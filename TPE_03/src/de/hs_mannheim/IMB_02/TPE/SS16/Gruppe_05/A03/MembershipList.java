package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A03;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/**
 * Klasse "MembershipList", in der die Mitgliedsdaten abgelegt sind.
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */
public class MembershipList extends HashMap<Integer, Member>implements Map<Integer, Member> {

	public MembershipList() {
		super();
	}

	public MembershipList(int i) {
		super(i);
	}

	public Member put(Member member) {
		return put(member.getMitgliederID(), member);
	}

	
}
