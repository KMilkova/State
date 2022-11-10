package It.com.project.bean;

import java.util.Objects;

public class City {

	private String title;
	private int yearOfFoundation;
	private int population;
	private boolean isCapital;
	private boolean isRegionalCity;

	public City() {
		super();
	}

	public City(String title, int yearOfFoundation, int population, boolean isCapital,boolean isRegionalCity) {
		this.title = title;
		this.yearOfFoundation = yearOfFoundation;
		this.population = population;
		this.isCapital = isCapital;
		this.isRegionalCity = isRegionalCity;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearOfFoundation() {
		return yearOfFoundation;
	}

	public void setYearOfFoundation(int yearOfFoundation) {
		this.yearOfFoundation = yearOfFoundation;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public boolean getIsCapital() {
		return isCapital;
	}

	public void setCapital(boolean isCapital) {
		this.isCapital = isCapital;
	}
	

	public boolean getIsRegionalCity() {
		return isRegionalCity;
	}

	public void setRegionalCity(boolean isRegionalCity) {
		this.isRegionalCity = isRegionalCity;
	}


	@Override
	public String toString() {
		return "City [title=" + title + ", yearOfFoundation=" + yearOfFoundation + ", population=" + population
				+ ", isCapital=" + isCapital + ", isRegionalCity=" + isRegionalCity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(population, title, yearOfFoundation);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return population == other.population && Objects.equals(title, other.title)
				&& yearOfFoundation == other.yearOfFoundation;
	}

}
