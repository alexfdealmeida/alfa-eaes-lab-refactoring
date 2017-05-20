package br.com.diego.nf;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class NotaFiscalTest {

	@Test
	public void test() {
		NotaFiscal notafiscal = new NotaFiscal();
		
		notafiscal.setI(10.0);
		notafiscal.setVb(100.0);
		
		Assert.assertEquals(110.0, notafiscal.valorTotal(), 0.0001);
	}

}
