package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A02;

import static org.junit.Assert.*;

import org.junit.Test;

public class CrypterSubstitutionTest {

	@Test
	public void testCrypterSubstitution() {
		Key k = new Key("UFLPWDRASJMCONQYBVTEXHZKGI");
		CrypterSubstitution c = new CrypterSubstitution(k);
		CrypterSubstitution d = new CrypterSubstitution(k);
		assertEquals(c, d);
	}

	@Test
	public void testVerschluesselnString() throws CrypterException {
		Key k = new Key("UFLPWDRASJMCONQYBVTEXHZKGI");
		CrypterSubstitution c = new CrypterSubstitution(k);
		String s = "ZSMSYWPSUSTESNDQVOUESH";
		assertEquals(s, c.verschluesseln("WIKIPEDIAISTINFORMATIV"));
	}

	@Test
	public void testVerschluesselnChar() throws CrypterException {
		Key k = new Key("UFLPWDRASJMCONQYBVTEXHZKGI");
		CrypterSubstitution c = new CrypterSubstitution(k);
		char d = 'U';
		assertEquals(d, c.verschluesseln('A'));
	}

	@Test
	public void testEntschluesselnString() throws CrypterException {
		Key k = new Key("UFLPWDRASJMCONQYBVTEXHZKGI");
		CrypterSubstitution c = new CrypterSubstitution(k);
		String s = "WIKIPEDIAISTINFORMATIV";
		assertEquals(s, c.entschluesseln("ZSMSYWPSUSTESNDQVOUESH"));
	}

	@Test
	public void testEntschluesselnChar() throws CrypterException {
		Key k = new Key("UFLPWDRASJMCONQYBVTEXHZKGI");
		CrypterSubstitution c = new CrypterSubstitution(k);
		char d = 'A';
		assertEquals(d, c.entschluesseln('U'));
	}

	@Test
	public void testReset() {
		fail("Not yet implemented");
	}

}
