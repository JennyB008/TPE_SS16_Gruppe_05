package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A02;

import static org.junit.Assert.*;

import org.junit.Test;

public class CrypterXORTest {

	@Test
	public void testCrypterXOR() {
		Key k = new Key("TPERULES");
		CrypterXOR c = new CrypterXOR(k);
		CrypterXOR d = new CrypterXOR(k);
		assertEquals(c, d);
	}

	@Test
	public void testKeyInArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetIndex() {
		Key k = new Key("TPERULES");
		CrypterXOR b = new CrypterXOR(k);

		char[] ca = { 'W', 'A', 'S' };
		int i = 1;
		assertEquals(i, b.getIndex('A', ca));
	}

	@Test
	public void testGetChar() {
		Key k = new Key("TPERULES");
		CrypterXOR b = new CrypterXOR(k);

		char[] ca = { 'W', 'A', 'S' };
		char c = 'A';
		assertEquals(c, b.getChar(1, ca));
	}

	@Test
	public void testVerschluesselnCharArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testVerschluesselnChar() {
		fail("Not yet implemented");
	}

	@Test
	public void testEntschluesselnCharArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testEntschluesselnChar() {
		fail("Not yet implemented");
	}

	@Test
	public void testReset() {
		fail("Not yet implemented");
	}

}
