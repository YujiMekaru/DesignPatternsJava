package adapter;

import java.nio.charset.StandardCharsets;

public class LegacyPrinter {
	public void printDocument(byte[] bytes) {
		String str = new String(bytes, StandardCharsets.UTF_8);
		System.out.println(str);
	}
}
