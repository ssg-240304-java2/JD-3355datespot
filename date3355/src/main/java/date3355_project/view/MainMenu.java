package date3355_project.view;

import date3355_project.controller.DatePlanManager;
import date3355_project.controller.SearchPlaces;

import java.util.Scanner;

public class MainMenu {

    DatePlanManager dpm = new DatePlanManager();
    MainView view = new MainView();
    Scanner sc = new Scanner(System.in);
    SearchPlaces search = new SearchPlaces();

    public int selectMenu() {
        view.mainView();
        return sc.nextInt();
    }

    public void mainMenu() {

        dpm.initInsert();
        System.out.println("최근 추가된 장소 : " + dpm.getPlaces().get(dpm.getPlaces().size()-1).getPlaceName());

        int selcted;
        do{
            selcted = selectMenu();

            switch (selcted) {
                case 1:
                    // 검색기능
                    break;
                case 2:
                    // 지역별 추천 코스
                    break;
                case 3: // 추천 장소 등록
                    break;
                case 0: // 프로그램 종료
                    System.out.println("프로그램을 종료합니다.👋");
                    return;
                default:
                    System.out.println("잘못입력하셨습니다!! 1,2,3,0 중 한 개를 입력해주세요!!");
                    break;
            }
        } while (selcted != 3);
    }

}
