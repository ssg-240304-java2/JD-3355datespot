package date3355_project.view;

import date3355_project.Model.dto.AllPlaceDTO;
import date3355_project.controller.DatePlanManager;


public class MainMenu {

    private DatePlanManager dpm = new DatePlanManager();

    public void mainMenu() {

        dpm.initInsert();
        for(AllPlaceDTO i : dpm.getPlaces()) {
            System.out.println("id = " + (dpm.getPlaces().indexOf(i) + 1) + i.toString());
        }


    }
}
