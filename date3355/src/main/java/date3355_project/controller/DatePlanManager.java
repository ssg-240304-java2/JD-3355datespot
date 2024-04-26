package date3355_project.controller;

import date3355_project.Model.PlaceDTO;
import java.util.ArrayList;
import java.util.List;

public class DatePlanManager {

    List<PlaceDTO> places = new ArrayList<>();
    InitData init = new InitData();

    public List<PlaceDTO> getPlaces() {
        return places;
    }

    public void initInsert() {
        init.initalData(places);
    }


}
