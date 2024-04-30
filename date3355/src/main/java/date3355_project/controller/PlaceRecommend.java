package date3355_project.controller;
import date3355_project.Model.dto.AllPlaceDTO;
import date3355_project.Model.dto.AttractionDTO;
import date3355_project.Model.dto.CafeDTO;
import date3355_project.Model.dto.RestaurantDTO;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



// **** 근데 이 데이타가 영구적으로 저장이될까요? ///이게 휘발성으로 저장되요 지역별로 cafe 등을 저장하는 코드입니다.********
public class PlaceRecommend {
    private static final List<CafeDTO> cafes = new ArrayList<>(); // cafes 를 클래스의 멤버 변수
    private static final List<RestaurantDTO> restaurant = new ArrayList<>(); //restaurant 를 클래스의 멤버 변수
    private static final List<AttractionDTO> attrations = new ArrayList<>(); //볼거리 or 할거리 클래스의 멤버 변수

//    DatePlanManager datePlanManager = new DatePlanManager();
    List<AllPlaceDTO> places = new ArrayList<>();

    // 상속 받았는데 리스트는 상속 받는게 아닌가요...?ㅋㅎㅋㅎ


    public  void placeRecommend() {

        Scanner sc = new Scanner(System.in);
        System.out.println("나만의 장소를 추천 하시겠습니까? Y OR N");
        String userInput = sc.nextLine().toUpperCase();
        int num;

        if (userInput.equals("Y")) {
            System.out.println("========================");
            System.out.println("      CATEGORY         ");
            System.out.println("========================");
            System.out.println("1.    CAFE              ");
            System.out.println("========================");
            System.out.println("2.    RESTAURANT         ");
            System.out.println("========================");
            System.out.println("3.    VIEW & TO DO     ");
            System.out.println("========================");
            System.out.println("번호를 입력해주세요");
            System.out.println("========================");
            num = sc.nextInt();
            sc.nextLine();


            if (num > 3 || num <=0) {
                System.out.println("잘못된 번호입니다");
            } else {


                System.out.println("지역을 입력하세요 (예: 강남구, 성북구 , 영등포구 , 강동구 , 송파구):");
                String region = sc.nextLine();


//            for(DatePlanManager i :datePlanManager){
//                System.out.println(i);
//            }


                switch (num) {
                    case 1: //카페
                        if (region.equals("강남구") || region.equals("성북구") || region.equals("영등포구") || region.equals("강동구") || region.equals("송파구")) {
//                            datePlanManager.initInsert();
                            informationPlaceCafe(sc, region);
                        } else {
                            System.out.println("해당 지역은 현재 지원되지 않습니다.");
                        }

                        System.out.println("===== 추가된 '카페' 장소 목록 =====");
                        for (CafeDTO cafe : cafes) {
                            System.out.println(cafe.toString1());
                        }

                        break;
                    case 2: // 식당 정보 추가

                        if (region.equals("강남구") || region.equals("성북구") || region.equals("영등포구") || region.equals("강동구") || region.equals("송파구")) {
//                            datePlanManager.initInsert();
                            informationPlaceRestaurant(sc, region);
                        } else {
                            System.out.println("해당 지역은 현재 지원되지 않습니다.");
                        }

                        System.out.println("===== 추가된 '식당' 장소 목록 =====");
                        for (RestaurantDTO restaurants : restaurant) {
                            System.out.println(restaurants.toString1());
                        }

                        break;
                    case 3:


                        if (region.equals("강남구") || region.equals("성북구") || region.equals("영등포구") || region.equals("강동구") || region.equals("송파구")) {
                            informationPlaceAttration(sc, region);
                        } else {
                            System.out.println("해당 지역은 현재 지원되지 않습니다.");
                        }

                        System.out.println("===== 추가된 '볼거리 OR 할거리' 목록 =====");
                        for (AttractionDTO attrationss : attrations) {
                            System.out.println(attrationss.toString1());
                        }

                        break;

                    default:
                        System.out.println("잘못된 번호입니다.");
                        break;
                }
            }

        }

            else{
                System.out.println("아쉽네요~ 다음에 알려주세요~");
            }


    }
        public static void informationPlaceCafe(Scanner sc, String region) {  // 카페 입력 메서드

            System.out.println("지역은 " + region + "입니다.");
            System.out.println("카페 이름을 입력하시오 :");
            String placeName = sc.nextLine();
            System.out.println("주차장 유무 : ");
            boolean parkingLot = Boolean.parseBoolean(sc.nextLine());
            System.out.println("가격:");
            int price = Integer.parseInt(sc.nextLine());
            System.out.println("오픈 시간 : ");
            String openTime = sc.nextLine();
            System.out.println("클로우즈 시간 : ");
            String closeTime = sc.nextLine();
            System.out.println("닫는 요일 :");
            String closedDay = sc.nextLine();
            System.out.println("추천 메뉴는 ?");
            String recommendMenu = sc.nextLine();
            System.out.println("블루 리본이 있나요?");
            boolean blueRibbon = Boolean.parseBoolean(sc.nextLine());

            CafeDTO cafe = new CafeDTO(placeName, region, parkingLot, price, openTime, closeTime, closedDay, recommendMenu, blueRibbon);
            cafes.add(cafe); // cafes 에 cafe 객체 추가

        }
        public static void informationPlaceRestaurant(Scanner sc, String region){    // 식당 데이터 입력 메서드

            System.out.println("지역은 " + region + "입니다.");
            System.out.println("식당 이름을 입력하시오 :");
            String placeName = sc.nextLine();
            System.out.println("주차장 유무:");
            boolean parkingLot = Boolean.parseBoolean(sc.nextLine());
            System.out.println("가격:");
            int price = Integer.parseInt(sc.nextLine());
            System.out.println("오픈 시간 : ");
            String openTime = sc.nextLine();
            System.out.println("클로우즈 시간 : ");
            String closeTime = sc.nextLine();
            System.out.println("닫는 요일 :");
            String closedDay = sc.nextLine();
            System.out.println("추천 메뉴는 ?");
            String recommendMenu = sc.nextLine();
            System.out.println("블루 리본이 있나요?");
            boolean blueRibbon = Boolean.parseBoolean(sc.nextLine());
            System.out.println("예약 가능한가요 ? ");
            boolean reservation =Boolean.parseBoolean(sc.nextLine());

            RestaurantDTO restaurants = new RestaurantDTO(placeName, region, parkingLot, price, openTime, closeTime, closedDay, recommendMenu, blueRibbon,reservation);
            restaurant.add(restaurants);
        }
        public static void informationPlaceAttration(Scanner sc, String region){   //볼 거 & 할 거 데이터 입력 메서드

            System.out.println("지역은 " + region + "입니다.");
            System.out.println("장소명 이 무엇인가요?");
            String placeName = sc.nextLine();
            System.out.println("주차장이 있나요?");
            boolean parkingLot = Boolean.parseBoolean(sc.nextLine());
            System.out.println("가격이 얼마인가요?");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.println("오픈 시간 : ");
            String openTime = sc.nextLine();
            System.out.println("클로우즈 시간 : ");
            String closeTime = sc.nextLine();
            System.out.println("닫는 요일 :");
            String closedDay = sc.nextLine();
            System.out.println("볼거리 OR 할거리 ?");
            String subCategory = sc.nextLine();
            System.out.println("시작시간이 언제인가요 ?");
            LocalDate startDate = LocalDate.parse(sc.nextLine());
            System.out.println("닫는 시간이 언제인가요 ?");
            LocalDate endDate = LocalDate.parse(sc.nextLine());
            System.out.println("예약 가능한가요 ? ");
            boolean reservation =Boolean.parseBoolean(sc.nextLine());

            AttractionDTO attration = new AttractionDTO(placeName, region, parkingLot, price, openTime,
                    closeTime, closedDay,subCategory,startDate,endDate,reservation);

            attrations.add(attration);
        }


//    public void initalData(List<AllPlaceDTO> places) {  // 이거 하면 place 에 저장되는건가?
//        for (AllPlaceDTO place : places) {
//            if (place instanceof CafeDTO) {
//                cafes.add((CafeDTO) place);
//            } else if (place instanceof RestaurantDTO) {
//                restaurant.add((RestaurantDTO) place);
//            } else if (place instanceof AttractionDTO) {
//                attrations.add((AttractionDTO) place);
//            }
//        }
//    }

    }



