package It.com.project.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class District {

	private String title;
	private List<City> cities = new ArrayList<City>();

	public District() {
		super();
	}

	public District(String title, List<City> cities) {
		this.title = title;
		this.cities = cities;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public void addCity(City city) {
		if (isHaveCapital()) {
			city.setCapital(false);
		}
		if(isHaveRegionalCity()) {
			city.setRegionalCity(false);
		}
		cities.add(city);
	}

	private boolean isHaveCapital() {
		for (City city : cities) {
			if (city.getIsCapital()) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isHaveRegionalCity() {
		for (City city : cities) {
			if (city.getIsRegionalCity()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "District [title=" + title + ", cities=" + cities + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cities, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		return Objects.equals(cities, other.cities) && Objects.equals(title, other.title);
	}

}
