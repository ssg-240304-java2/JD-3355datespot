package date3355_project.view;

import date3355_project.Model.dto.AllPlaceDTO;
import date3355_project.controller.DatePlanManager;
import date3355_project.controller.RecommendPlaces;

import java.util.Scanner;

public class MainMenu {

    Scanner sc = new Scanner(System.in);
    private DatePlanManager dpm = new DatePlanManager();
    RecommendPlaces recommendPlaces = new RecommendPlaces();



    public void mainMenu() {

        dpm.initInsert();
//        for(AllPlaceDTO i : dpm.getPlaces()) {
//            System.out.println("id = " + (dpm.getPlaces().indexOf(i) + 1)  + i.toString());
//        }

        // 실행될 부분 불러오기
        dpm.recommendPlaces();

    }



}