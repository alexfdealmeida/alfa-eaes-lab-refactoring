package br.com.alexfelipe.nf;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import br.com.alexfelipe.data.NotaFiscalData;

public class GeradorNotaFiscal {
	public void geraNota(Fatura f, Imposto imposto) {
		NotaFiscal notaFiscal = geraNotaFiscal(f, imposto);
		new NotaFiscalData().salvarNotaFiscal(notaFiscal);
		enviarEmail(f);
	}

	private void enviarEmail(Fatura f) {
		final String username = "refatoracaoalfa2017@gmail.com";
		final String password = "refatoracao123";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("refatoracaoalfa2017@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("diegoamericoguedes@gmail.com"));
			message.setSubject("Titulo");
			message.setText("Mensagem");

			Transport.send(message);

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

	private NotaFiscal geraNotaFiscal(Fatura f, Imposto imposto) {
		double valorImposto = 0;

		valorImposto = imposto.getValor(f.getV());

		NotaFiscal notaFiscal = new NotaFiscal(valorImposto, f.getV());
		return notaFiscal;
	}
}