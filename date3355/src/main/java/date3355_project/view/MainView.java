package date3355_project.view;

import date3355_project.Model.vo.InitData;
import date3355_project.controller.DatePlanManager;
import java.util.Scanner;

public class MainView {
    Scanner sc = new Scanner(System.in);
    InitData data = new InitData();
    DatePlanManager dpm = new DatePlanManager();

    public void mainView() {
        System.out.println("==================================");
        System.out.println("1.      검색        ");
        System.out.println("2.  지역별 추천 코스   ");
        System.out.println("3.  내 장소 추천하기   ");
        System.out.println("0.      종료        ");
//        System.out.println(dpm.getPlaces().get(dpm.getPlaces().size()-1).getPlaceName());
        System.out.print("입력: ");

    }
}
