package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A04;

/**
 * Klasse "BlockTest", die die Testumgebung der Klasse "Block" darstellt.
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class BlockTest {

	@Test
	public void testHashCode() {
		Block b1 = new Block(5, false);
		Block b2 = new Block(5, false);
		assertEquals(b1,b2);
	}

	@Test
	public void testBlock() {
		Block b1 = new Block(5, false);
		Block b2 = new Block(5, false);
		assertEquals(b1,b2);
	}

	@Test
	public void testGetAnfang1() {
		Block b1 = new Block(5, false);
		assertEquals(0, b1.getAnfang());
	}
	@Test
	public void testGetAnfang2(){
		Block b1 = new Block(5, false);
		Block b2 = new Block(5, false);
		Strecke s = new Strecke(10,2);
		s.addBlock(b1);
		s.addBlock(b2);
		assertEquals(6, b2.getAnfang());
	}

	@Test
	public void testSetAnfang() {
		Block b1 = new Block(5, false);
		b1.setAnfang(3);
		assertEquals(3, b1.getAnfang());
	}

	@Test
	public void testGetEnde1() {
		Block b1 = new Block(5, false);
		assertEquals(6, b1.getEnde());
	}
	@Test
	public void testGetEnde2(){
		Block b1 = new Block(5, false);
		Block b2 = new Block(5, false);
		Strecke s = new Strecke(10,2);
		s.addBlock(b1);
		s.addBlock(b2);
		assertEquals(11, b2.getEnde());
	}

	@Test
	public void testSetEnde() {
		Block b1 = new Block(5, false);
		b1.setEnde(3);
		assertEquals(3, b1.getEnde());
	}

	@Test
	public void testIsSperre() {
		Block b1 = new Block(5, false);
		assertEquals(false, b1.isSperre());
	}

	@Test
	public void testSetSperre() {
		Block b1 = new Block(5, false);
		b1.setSperre(true);
		assertEquals(true, b1.isSperre());
	}

	@Test
	public void testEqualsObject() {
		Block b1 = new Block(5, false);
		Block b2 = new Block(5, false);
		assertEquals(b1,b2);
	}

	@Test
	public void testGetLaenge() {
		Block b1 = new Block(5, false);
		assertEquals(6, b1.getLaenge());
	}

	@Test
	public void testSetLaenge() {
		Block b1 = new Block(5, false);
		b1.setLaenge(3);
		assertEquals(3, b1.getLaenge());
	}

	@Test
	public void testSperren() {
		Block b1 = new Block(5, false);
		b1.sperren();
		assertEquals(true, b1.isSperre());
	}

	@Test
	public void testEntsperren() {
		Block b1 = new Block(5, true);
		b1.entsperren();
		assertEquals(false, b1.isSperre());
	}

}
