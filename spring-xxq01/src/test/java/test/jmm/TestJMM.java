package test.jmm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestJMM {
	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setName("name1");
		List<Long> cityId = new ArrayList<Long>();
		cityId.add(1L);
		cityId.add(2L);
		cityId.add(3L);
		user.setCityId(cityId);

		Map<String,String> map = new HashMap<>();
		map.put("ID","value1");
		map.put("ID2","value2");
		user.setMap(map);

		System.out.println(user);

		List<Long> cityId1 = user.getCityId();
		cityId1.remove(2);
		System.out.println(user);

		Map<String,String> map1 = user.getMap();
		System.out.println(map1.get("ID"));
		System.out.println(user);
		map1.put("id",map1.get("ID").toString());
		System.out.println(user);

		String name = user.getName();
		name = "name2";
		System.out.println(user);
	}

	@Test
	public void test1() {
		TestUser testUser = new TestUser(1,2);

	}
}
