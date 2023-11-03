package cryptography.hashes.sha;

import java.security.NoSuchAlgorithmException;
import net.jacksum.JacksumAPI;
import net.jacksum.algorithms.AbstractChecksum;

public class SHA {

	public static void main(String[] args) {
	}

	private static String jacksumAPI(String input, String instance) {
		String output = "";
		AbstractChecksum abstractChecksum = null;
		try {
			abstractChecksum = JacksumAPI.getChecksumInstance(instance.toLowerCase());
			abstractChecksum.update(input.getBytes());
			output = abstractChecksum.getValueFormatted();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return output;
	}

	public static String sha0(String input) {
		return jacksumAPI(input, "SHA-0");
	}

	public static String sha1(String input) {
		return jacksumAPI(input, "SHA-1");
	}

	public static String sha224(String input) {
		return jacksumAPI(input, "SHA-224");
	}

	public static String sha256(String input) {
		return jacksumAPI(input, "SHA-256");
	}

	public static String sha384(String input) {
		return jacksumAPI(input, "SHA-384");
	}

	public static String sha512(String input) {
		return jacksumAPI(input, "SHA-512");
	}

}
