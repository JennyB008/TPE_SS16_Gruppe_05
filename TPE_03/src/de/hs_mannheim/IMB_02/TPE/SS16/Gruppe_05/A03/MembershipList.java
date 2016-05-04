package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A03;

import java.util.HashMap;
import java.util.Map;

/**
 * Klasse "MembershipList", in der die Mitgliedsdaten abgelegt sind.
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */
public class MembershipList<K, V> extends HashMap<K, V> implements Map<K, V> {

	public V put(Member m) {
		K k = (K) new Integer(m.getMitgliederID());
		return put(k, (V) m);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
