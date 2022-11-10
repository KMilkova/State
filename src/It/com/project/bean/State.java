package It.com.project.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class State {
	private String title;
	private List<Region> regions = new ArrayList<Region>();
	private List<District> districts = new ArrayList<District>();
	private List<City> cities = new ArrayList<City>();

	public State() {
		super();
	}

	public State(String title, List<Region> regions) {
		super();
		this.title = title;
		this.regions = regions;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public void addRegions(Region region) {
		regions.add(region);
	}

	@Override
	public String toString() {
		return "State [title=" + title + ", regions=" + regions + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(regions, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return Objects.equals(regions, other.regions) && Objects.equals(title, other.title);
	}
}
