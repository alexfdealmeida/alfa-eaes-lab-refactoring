package br.com.alexfelipetest.nf;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import br.com.alexfelipe.nf.NotaFiscal;

public class NotaFiscalTest {

	@Test
	public void test() {
		NotaFiscal notafiscal = new NotaFiscal();
		
		notafiscal.setImposto(10.0);
		notafiscal.setValorBase(100.0);
		
		Assert.assertEquals(110.0, notafiscal.valorTotal(), 0.0001);
	}

}
