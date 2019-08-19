package test.other;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class TestMain {
	public static void main(String[] args) throws Exception{
		String filename = "%282%29";
		String filename1 = URLDecoder.decode(filename, "utf8");
		System.out.println(filename1);

		System.out.println(new String(filename1.getBytes(), "ISO-8859-1"));

	}
}
