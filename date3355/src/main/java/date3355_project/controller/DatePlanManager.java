package date3355_project.controller;
import date3355_project.Model.dto.AllPlaceDTO;
import date3355_project.Model.vo.InitData;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DatePlanManager {

    List<AllPlaceDTO> places = new ArrayList<>();   // 장소 리스트
    InitData init = new InitData(); // 초기 데이터 넣기 위한 객체 생성
    RecommendPlaces rp = new RecommendPlaces();
    SearchPlaces sp = new SearchPlaces();
    PlaceRecommend pr = new PlaceRecommend();

    // 테스트용 getter 메소드
    public List<AllPlaceDTO> getPlaces() {
        return places;
    }

    // 초기 데이터 넣는 메소드
    public void initInsert() {
        init.initalData(places);
    }

    //장소 추천 클래스 불러오기
    public void recommendPlaces() {
        rp.recommendPlaces(places);
    }

    //장소 검색하기
    public void searchPlaces() {
        sp.searchPage(places);
    }

    //추천 장소 입력하기
    public void placeRecommend() {
        pr.placeRecommend();
    }

}