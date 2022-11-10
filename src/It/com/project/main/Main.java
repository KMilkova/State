package It.com.project.main;

import It.com.project.bean.City;
import It.com.project.bean.District;
import It.com.project.bean.Region;
import It.com.project.bean.State;
import It.com.project.logic.StateLogic;
import It.com.project.view.StateView;

public class Main {

	public static void main(String[] args) {

		State state = new State();

		District dist = new District();
		dist.setTitle("dist1");
		dist.addCity(new City("CapitalCity", 1925, 12500, true, false));
		dist.addCity(new City("RegionalCity1", 1900, 92500, false, true));

		District dist2 = new District();
		dist2.setTitle("dist2");
		dist2.addCity(new City("RegionalCity2", 1925, 12500, false, true));
		dist2.addCity(new City("City4", 1900, 92500, false, false));

		Region reg = new Region();
		reg.setTitle("reg1");
		reg.addDistrict(dist);

		Region reg2 = new Region();
		reg2.setTitle("reg2");
		reg2.addDistrict(dist2);

		state.setTitle("State1");
		state.addRegions(reg);
		state.addRegions(reg2);

		StateLogic stLogic = new StateLogic();
		StateView stView = new StateView();

		stView.printAllInfo(state);
		stView.printCapital(stLogic.getCapital(state));
		stView.printCntOfRegions(stLogic.findCntOfRegions(state));
		stView.printRegionalCities(stLogic.getRegionalCities(state));
	}

}
