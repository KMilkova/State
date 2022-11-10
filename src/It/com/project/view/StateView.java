package It.com.project.view;

import java.util.List;

import It.com.project.bean.City;
import It.com.project.bean.District;
import It.com.project.bean.Region;
import It.com.project.bean.State;
import It.com.project.logic.StateLogic;

public class StateView {

	public void print(Object obj) {
		System.out.println(obj.toString());
	}

	public void printAllInfo(State state) {
		String res = state.getTitle() + " ";
		res += getRegions(state);
		System.out.println(res);
	}

	public String getCities(District district) {
		String res = "Cities: ";
		for (City city : district.getCities()) {
			res += city.getTitle() + ", ";
		}
		return res;
	}

	public String getDistricts(Region region) {
		String res = "Districts: ";
		for (District district : region.getDistricts()) {
			res += district.getTitle() + ", ";
			res += getCities(district);
		}
		return res;
	}

	public String getRegions(State state) {
		String res = "";
		for (Region region : state.getRegions()) {
			res += "Regions: ";
			res += region.getTitle() + ", ";
			res += getDistricts(region);
		}
		return res;
	}

	public void printCapital(City city) {
		System.out.println("The capital: " + city.getTitle());
	}

	public void printCntOfRegions(int cnt) {
		System.out.println("Cnt of regions: " + cnt);
	}

	public void printRegionalCities(List<City> cities) {
		System.out.print("Regional cities: ");
		for (City regCity : cities) {
			System.out.print(regCity.getTitle()+" ");
		}
	}
}
