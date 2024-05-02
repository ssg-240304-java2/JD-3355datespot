package date3355_project.controller;


import date3355_project.Model.dto.AllPlaceDTO;
import date3355_project.Model.dto.AttractionDTO;
import date3355_project.Model.dto.CafeDTO;
import date3355_project.Model.dto.RestaurantDTO;
import date3355_project.Model.vo.InitData;

import java.util.*;

public class RecommendPlaces {
//    DatePlanManager datePlanManager = new DatePlanManager();
    Scanner sc = new Scanner(System.in);
    OpenStatus op = new OpenStatus();


    //지역별로 나누었을 때 필드를 새로운 List에 담을 수 있도록 새롭게 생성
    //regionList에서 카테고리 별로 찾을 때 이중으로 필터링 하지 않기 위해
    List<AllPlaceDTO> regionList = new ArrayList<>();

    public void recommendPlaces(List<AllPlaceDTO> test1) {
        System.out.println("1. 강남구");
        System.out.println("2. 성북구");
        System.out.println("3. 영등포구");
        System.out.println("4. 강동구");
        System.out.println("5. 송파구");
        System.out.print("원하는 지역을 선택하세요: ");
        int choice = sc.nextInt();
        this.RecommendPlaces1(choice,test1); // 선택한 지역 처리하는 부분
        sc.nextLine();
        System.out.println("1. 카페");
        System.out.println("2. 레스토랑");
        System.out.println("3. 할 것");
        System.out.print("원하는 카테고리를 입력하세요: ");
        int choice1 = sc.nextInt();
        this.RecommendPlaces3(choice1); // 선택한 카테고리에서 랜덤한 추천 장소 3군데 나타내주는 부분

    }

//
    //지역별 나누어서 입력받은 번호를 기준으로 List에 값 넣어주기
    public void RecommendPlaces1(int num, List<AllPlaceDTO> test2) { // 숫자로 입력받아오기로 작성
//        datePlanManager.initInsert(); // 초기 데이터 넣어주기 필수!!!
        switch (num){
            case 1 : //1. 강남구 입력받았을 때
                for (AllPlaceDTO i : test2){
                    if (i.getRegion().equals("강남구")){ // 전체 값이 담긴 List 중 region="강남구"인 인덱스만 갖고오기 위해
                        regionList.add(i); // 필터링 걸린 인덱스만 갖고 와서 새로 생성한 임시 list에 추가하는 코드
//                        System.out.println(i); //확인용
                    }
                }
            break;
            case 2 ://2. 성북구 입력받았을 때
                for (AllPlaceDTO i : test2){
                    if (i.getRegion().equals("성북구")){
                        regionList.add(i);
//                        System.out.println(i);
                    }
                }
            break;
            case 3 : //3. 영등포구 입력받았을 때
                for (AllPlaceDTO i : test2){
                    if (i.getRegion().equals("영등포구")){
                        regionList.add(i);
//                        System.out.println(i);
                    }
                }
                break;
            case 4 : //4. 강동구 입력받았을 때
                for (AllPlaceDTO i : test2){
                    if (i.getRegion().equals("강동구")){
                        regionList.add(i);
//                        System.out.println(i);
                    }
                }
                break;
            case 5 : //5. 송파구 입력받았을 때
                for (AllPlaceDTO i : test2){
                    if (i.getRegion().equals("송파구")){
                        regionList.add(i);
//                        System.out.println(i);
                    }
                }
                break;
            default:
                System.out.println("값이 없습니다");
                break;
        }

    }

    public void RecommendPlaces3(int num2){
        Random random = new Random();

        if (num2 == 1) { // 카페
            List<CafeDTO> cafes = new ArrayList<>(); //위 경우처럼 새로 List생성해서 CafeDTO로 InitData에서 add했던 것을
            // 찾아와서 넣어줄 수 있도록 하기 위해
            // ( 카테고리 별로 나눌 예정이라서 regionList와 다르게 카테코리별 list 각자 생성)
            for (AllPlaceDTO place : this.regionList) {
                if (place instanceof CafeDTO) { // instanceof를 사용하여 true일 때CafeDTO를 사용하여 add했던 요소들을 찾아서 갖고 오기 위해
                    cafes.add((CafeDTO) place); // list에 add해주어서 값 추가
                }
            }
            if (cafes.size() == 0) { // 아예 없는 경우
                System.out.println("해당 지역에 카페가 없습니다.");
            } else {
                Collections.shuffle(cafes); // 컬렉션 중 shuffle이라는 것을 제공해줌
                //혹시나 값이 없는 경우 불러오지 못해서 오류날까봐 넣어준 부분(min함수)
                int count = Math.min(3, cafes.size()); // min함수를 이용해서 리스트의 개수가 3개 이하가 나올 수도 있기 때문에 제한해주기 위해
                for (int i = 0; i < count; i++) {
                    CafeDTO cafe = cafes.get(i); // 이미 List가 섞인 상태에서 갖고와줌
                    System.out.println(cafe);
                }
            }
        } else if (num2 == 2) { // 레스토랑
            List<RestaurantDTO> restaurants = new ArrayList<>();
            for (AllPlaceDTO place : this.regionList) {
                if (place instanceof RestaurantDTO) {
                    restaurants.add((RestaurantDTO) place);
                }
            }
            if (restaurants.size() == 0) {
                System.out.println("해당 지역에 레스토랑이 없습니다.");
            } else {
                Collections.shuffle(restaurants);
                int count = Math.min(3, restaurants.size());
                for (int i = 0; i < count; i++) {
                    RestaurantDTO restaurant = restaurants.get(i);
                    System.out.println(restaurant);
                }
            }
        } else if (num2 == 3) { // 할것
            List<AttractionDTO> attractions = new ArrayList<>();
            for (AllPlaceDTO place : this.regionList) {
                if (place instanceof AttractionDTO) {
                    attractions.add((AttractionDTO) place);
                }
            }
            if (attractions.size() == 0) {
                System.out.println("해당 지역에 관광지가 없습니다.");
            } else {
                Collections.shuffle(attractions);
                int count = Math.min(3, attractions.size());
                for (int i = 0; i < count; i++) {
                    AttractionDTO attraction = attractions.get(i);
                    System.out.println(attraction);
                }
            }
        } else {
            System.out.println("해당하는 카테고리가 없습니다.");
        }
    }

}




