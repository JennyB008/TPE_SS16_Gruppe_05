package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A02;

import static org.junit.Assert.*;

import org.junit.Test;

public class CrypterBasicTest {

	@Test
	public void testCrypterBasic() {
		Key k = new Key("K");
		CrypterBasic c = new CrypterBasic(k);
		CrypterBasic d = new CrypterBasic(k);
		assertEquals(c, d);
	}

}
