package cryptography.hashes.crc;

import java.security.NoSuchAlgorithmException;
import net.jacksum.JacksumAPI;
import net.jacksum.algorithms.AbstractChecksum;

public class CRC {

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

	public static String crc8(String input) {
		return jacksumAPI(input, "CRC-8");
	}

	public static String crc16(String input) {
		return jacksumAPI(input, "CRC-16");
	}

	public static String crc24(String input) {
		return jacksumAPI(input, "CRC-24");
	}

	public static String crc32(String input) {
		return jacksumAPI(input, "CRC-32");
	}

	public static String crc64(String input) {
		return jacksumAPI(input, "CRC-64");
	}
}
