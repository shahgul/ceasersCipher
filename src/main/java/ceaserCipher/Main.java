package ceaserCipher;

public class Main {

	public static void main(String[] args) {
		
		String message = "how are you doing";
		int offset = 12;
		
		CeasersCipher ceaserCipher = new CeasersCipher();
		String cipheredMessage = ceaserCipher.cipher(message, offset);
		
		System.out.println("Message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Ciphered Message: " + cipheredMessage);
	}
}
