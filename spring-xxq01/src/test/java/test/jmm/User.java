package test.jmm;

import java.util.List;
import java.util.Map;

public class User {

	private String name;
	private Integer id;
	private List<Long> cityId;
	private Map<String,String> map;

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}

	public List<Long> getCityId() {
		return cityId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCityId(List<Long> cityId) {
		this.cityId = cityId;
	}

	public User(String name, Integer id, List<Long> cityId) {
		this.name = name;
		this.id = id;
		this.cityId = cityId;
	}

	public User() {

	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", id=" + id +
				", cityId=" + cityId +
				", map=" + map +
				'}';
	}
}
