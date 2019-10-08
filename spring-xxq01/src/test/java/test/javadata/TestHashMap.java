package test.javadata;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>(16);
		map.put("1","2");
		map.put("2","2");
		System.out.println(map.size());
	}
}
