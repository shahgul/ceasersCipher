package ceaserCipher;

public class CeasersCipher {
	private static final int ALPHABET_SIZE = 26;
	private static final char LETTER_A = 'a';
	private static final char LETTER_Z = 'z';
	
	public String cipher(String message, int offset) {
		offset %= ALPHABET_SIZE;
		char[] character = message.toCharArray();
		offsetBy(character,offset);
		return new String(character);
	}

	private void offsetBy(char[] character, int offset) {
		for (int i = 0; i < character.length; i++) {
			if (character[i]!= ' ')
			character[i] = offsetCharacter(character[i], offset, LETTER_A, LETTER_Z);
		}
		
	}

	private char offsetCharacter(char c, int offset, char letterA, char letterZ) {
		c+=offset;
		if(c<letterA)
			return (char) (c + ALPHABET_SIZE);
		else if (c>letterZ)
			return (char) (c - ALPHABET_SIZE);
		return c;
	}

}
