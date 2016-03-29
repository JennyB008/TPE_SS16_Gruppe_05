package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A01;

import static org.junit.Assert.*;

import org.junit.Test;

public class KontoTest {

	@Test
	public void testGetWaehrung() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Konto k = new Konto("Peter Lustig", 2.0, w);
		assertEquals(w, k.getWaehrung());

	}

	@Test
	public void testKontoStringBetrag() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b = new Betrag(20, w);
		Konto k1 = new Konto("Peter Lustig", b);
		Konto k2 = new Konto("Peter Lustig", b);
		assertEquals(k1, k2);
	}

	@Test
	public void testKontoStringDoubleWaehrung() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Konto k1 = new Konto("Peter Lustig", 20, w);
		Konto k2 = new Konto("Peter Lustig", 20, w);
		assertEquals(k1, k2);
	}

	@Test
	public void testGetInhaber() {
		String s = "Peter Lustig";
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Konto k1 = new Konto("Peter Lustig", 20, w);
		assertEquals(s, k1.getInhaber());
	}

	@Test
	public void testBuchen() {
		long l = 20;
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b1 = new Betrag(10, w);
		Konto k1 = new Konto("Peter Lustig", b1);
		Betrag b2 = new Betrag(10, w);
		assertEquals(l, k1.buchen(b2));
	}

	@Test
	public void testSaldo() {
		double l = 20.0;
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b = new Betrag(20, w);
		Konto k = new Konto("Peter Lustig", b);
		assertEquals(l, k.saldo(), 0.01);
	}

	@Test
	public void testGebühren() {
		long l = 50;
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b = new Betrag(1000, w);
		Konto k = new Konto("Peter Lustig", b);
		double p = 0.5;
		assertEquals(l, k.gebuehren(p), 0.01);
	}

	@Test
	public void testToString() {
		String s = "Kontoinhaber: Peter Lustig\nWährung: Euro\n----------\n10.0 €\n-10.0 €\n----------\nSaldo: 10.0 €";
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b1 = new Betrag(1000, w);
		Konto k = new Konto("Peter Lustig", b1);
		Betrag b2 = new Betrag(1000, w);
		Betrag b3 = new Betrag(-1000, w);
		k.buchen(b2);
		k.buchen(b3);
		assertEquals(s, k.toString());
	}

}
