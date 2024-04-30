package date3355_project.run;

import date3355_project.controller.PlaceRecommend;
import date3355_project.view.MainMenu;


public class Application {

    public static void main(String[] args) {

        PlaceRecommend placeRecommend =new PlaceRecommend();
        placeRecommend.placeRecommend();

        MainMenu menu = new MainMenu();
        menu.mainMenu();

    }
}