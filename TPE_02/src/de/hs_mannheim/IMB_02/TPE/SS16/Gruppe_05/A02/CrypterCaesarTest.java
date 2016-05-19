package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A02;

import static org.junit.Assert.*;

import org.junit.Test;

public class CrypterCaesarTest {

	@Test
	public void testCrypterCaesar() {
		Key k = new Key("C");
		CrypterCaesar c = new CrypterCaesar(k);
		CrypterCaesar d = new CrypterCaesar(k);
		assertEquals(c, d);
	}

	@Test
	public void testVerschluesselnString() throws CrypterException {
		Key k = new Key("C");
		CrypterCaesar c = new CrypterCaesar(k);
		String s = "DO";
		assertEquals(s, c.verschluesseln("AL"));
	}

	@Test
	public void testVerschluesselnChar() throws CrypterException {
		Key k = new Key("C");
		CrypterCaesar c = new CrypterCaesar(k);
		char e = 'O';
		assertEquals(e, c.verschluesseln('L'));
	}

	@Test
	public void testEntschluesselnString() throws CrypterException {
		Key k = new Key("C");
		CrypterCaesar c = new CrypterCaesar(k);
		String s = "AL";
		assertEquals(s, c.entschluesseln("DO"));
	}

	@Test
	public void testEntschluesselnChar() throws CrypterException {
		Key k = new Key("C");
		CrypterCaesar c = new CrypterCaesar(k);
		char e = 'A';
		assertEquals(e, c.entschluesseln('D'));
	}

	@Test
	public void testReset() {
		fail("Not yet implemented");
	}

}
