package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A04;

/**
 * Klasse "StreckeTest", die die Testumgebung der Klasse "Strecke" darstellt.
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class StreckeTest {

	@Test
	public void testHashCode() {
		Strecke s1 = new Strecke(20, 3);
		Strecke s2 = new Strecke(20, 3);
		assertEquals(s1, s2);
	}

	@Test
	public void testStrecke() {
		Strecke s1 = new Strecke(20, 3);
		Strecke s2 = new Strecke(20, 3);
		assertEquals(s1, s2);

	}

	@Test
	public void testAddBlock() {
		Strecke s = new Strecke(8, 3);
		Block b1 = new Block(3, false);
		Block b2 = new Block(5, false);
		s.addBlock(b1);
		s.addBlock(b2);
		assertEquals(b2, s.streckeInBloecken[1]);
	}

	@Test
	public void testNextBlock() {
		Strecke s = new Strecke(8, 3);
		Block b1 = new Block(3, false);
		Block b2 = new Block(5, false);
		s.addBlock(b1);
		s.addBlock(b2);
		assertEquals(b2, s.nextBlock(b1));
	}

	@Test
	public void testToString() {
		String st = "_---_-----";
		Strecke s = new Strecke(8, 2);
		Block b1 = new Block(3, false);
		Block b2 = new Block(5, false);
		s.addBlock(b1);
		s.addBlock(b2);
		assertEquals(st, s.toString());
	}

	@Test
	public void testEqualsObject() {
		Strecke s1 = new Strecke(20, 3);
		Strecke s2 = new Strecke(20, 3);
		assertEquals(s1, s2);
	}

}
