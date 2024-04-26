package date3355_project.view;

import date3355_project.Model.PlaceDTO;
import date3355_project.controller.DatePlanManager;

public class MainMenu {

    private DatePlanManager dpm = new DatePlanManager();

    public void mainMenu() {

        dpm.initInsert();
        for(PlaceDTO i : dpm.getPlaces()) {
            System.out.println(i.toString());
        }
    }

}
