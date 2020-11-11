package ceaserCipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CeaserCipherTest {
	
	private CeasersCipher ceaserCipher = new CeasersCipher();

	@Test
	void testCipheredMessageWithOffsetof12() {
		assertEquals("tai mdq kag pauzs", ceaserCipher.cipher("how are you doing", 12));
	}
	@Test
	void testEmptyString() {
		assertEquals("", ceaserCipher.cipher("", 12));
	}

}
