package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A02;

import static org.junit.Assert.*;

import org.junit.Test;

public class KeyTest {

	@Test
	public void testKey() {
		Key k = new Key("D");
		Key i = new Key("D");
		assertEquals(k, i);
	}

	@Test
	public void testGetKey() {
		Key k = new Key("D");
		String s = "D";
		assertEquals(s, k.getKey());
	}

	@Test
	public void testSetKey() {
		Key k = new Key("D");
		String s = "N";
		assertEquals(s, k.setKey("N"));
	}

}
