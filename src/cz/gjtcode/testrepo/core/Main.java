package cz.gjtcode.testrepo.core;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println("Test");
		System.out.println("App - START");
		final byte[] testBytes = {'a', 'b', 'c'};
		final String testStrFromBytes = new String(testBytes, StandardCharsets.UTF_8);
		System.out.println("TestBytes: " + Arrays.toString(testBytes));
		System.out.println("TestStrFromBytes: " + testStrFromBytes);
		System.out.println("App - END");
	}

}
