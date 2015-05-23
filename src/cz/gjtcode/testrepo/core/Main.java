package cz.gjtcode.testrepo.core;

import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Properties;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		System.out.println("Test");
		System.out.println("App - START");
		System.out.println("Application args (count: " + args.length + ")");
		for (String argStr : args) {
			System.out.println(" - " + argStr);
		}
		System.out.println("System properties: ");
		final Properties properties = System.getProperties();
		final Set<Object> propertyKeySet = properties.keySet();
		for (Object propertyKey : propertyKeySet) {
			final Object propertyValue = properties.get(propertyKey);
			System.out.println(String.format(" - %s: %s", propertyKey, propertyValue));
		}
		System.out.println("Next info: ");
		final Charset defaultCharset = Charset.defaultCharset();
		System.out.println(String.format(" - DefaultCharset: %s", defaultCharset.displayName()));
		final byte[] testBytes = {'a', 'b', 'c'};
		final String testStrFromBytes = new String(testBytes, StandardCharsets.UTF_8);
		System.out.println("TestBytes: " + Arrays.toString(testBytes));
		System.out.println("TestStrFromBytes: " + testStrFromBytes);
		System.out.println("App - END");
	}

}
