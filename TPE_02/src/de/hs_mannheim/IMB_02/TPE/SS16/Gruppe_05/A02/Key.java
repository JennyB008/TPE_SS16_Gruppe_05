package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A02;

/**
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */
public class Key {
	private String key;

	public Key(String key) {
		this.key = key.toUpperCase();
	}

	public String getKey() {
		return key;
	}

	public String setKey(String newKey) {
		this.key = newKey;
		return key;
	}
}
