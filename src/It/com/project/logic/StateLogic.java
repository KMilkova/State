package It.com.project.logic;

import java.util.ArrayList;
import java.util.List;

import It.com.project.bean.City;
import It.com.project.bean.District;
import It.com.project.bean.Region;
import It.com.project.bean.State;

public class StateLogic {

	public int findCntOfRegions(State state) {
		return state.getRegions().size();
	}

	public City getCapital(State state) {
		for (Region reg : state.getRegions()) {
			for (District dis : reg.getDistricts()) {
				for (City city : dis.getCities()) {
					if (city.getIsCapital()) {
						return city;
					}
				}
			}
		}
		return null;
	}
	
	public List<City> getRegionalCities(State state) {
		List<City> regCities = new ArrayList<City>();
		for (Region reg : state.getRegions()) {
			for (District dis : reg.getDistricts()) {
				for (City city : dis.getCities()) {
					if (city.getIsRegionalCity()) {
						regCities.add(city);
					}
				}
			}
		}
		return regCities;
	}

}
