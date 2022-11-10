package It.com.project.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {
	
	private String title;
	private List<District> districts = new ArrayList<District>();

	public Region() {
		super();
	}

	public Region(String title, List<District> districts) {
		super();
		this.title = title;
		this.districts = districts;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}
	
	public void addDistrict(District district) {
		districts.add(district);
	}

	@Override
	public String toString() {
		return "Region [title=" + title + ", districts=" + districts + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(districts, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return Objects.equals(districts, other.districts) && Objects.equals(title, other.title);
	}
}
