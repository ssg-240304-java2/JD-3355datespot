package date3355_project.controller;

import date3355_project.Model.dto.AllPlaceDTO;
import date3355_project.Model.dto.AttractionDTO;
import date3355_project.Model.dto.CafeDTO;
import date3355_project.Model.dto.RestaurantDTO;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class SearchPlaces {

    Scanner sc = new Scanner(System.in);
    OpenStatus op = new OpenStatus();

    // 조회 방식 선택 메소드
    public void searchPage(List<AllPlaceDTO> places) {

        while (true) {

            System.out.print("""
                    1. 전체 조회
                    2. 상세 조회
                    """);
            System.out.print(">> ");

            String str = sc.nextLine();

            if (str.equals("1")) {

                printAllPlaces(places);
                break;

            } else if (str.equals("2")) {

                printDetailPlaces(places);
                break;

            } else {
                System.out.println("잘못 입력하셨습니다! 다시 입력하세요.");
                continue;
            }
        }
    }

    // 전체 조회 메소드
    public void printAllPlaces(List<AllPlaceDTO> places) {
        for (AllPlaceDTO i : places) {
            System.out.print("[" + (places.indexOf(i) + 1) + "] ");
            printForm(i, 1);
        }
    }

    // 인스턴스 타입 반환 메소드
    public Class<?> getInstance(String category) {
        if (category.equals("1") || category.equals("카페"))
            return CafeDTO.class;
        else if (category.equals("2") || category.equals("식당"))
            return RestaurantDTO.class;
        else
            return AttractionDTO.class;
    }

    // 세부 조회 메소드
    public void printDetailPlaces(List<AllPlaceDTO> places) {

        int cnt = 0;
        String maxPrice;

        System.out.print("구를 입력해주세요 (ex) 영등포구, 강남구) : ");
        String region = sc.nextLine();

        System.out.print("카테고리를 입력해주세요 (1. 카페, 2. 식당, 3. 어트랙션) : ");
        String category = sc.nextLine();

        while(true) {
            System.out.print("금액을 입력해주세요 (MAX) : ");
            maxPrice = sc.nextLine();
            break;
        }

        System.out.print("금액을 입력해주세요 (MIN) : ");
        String minPrice = sc.nextLine();

        System.out.println("---------------------------------------------");

        for (AllPlaceDTO i : places) {
            if (i.getRegion().equals(region)
                    && i.getPrice() >= Integer.parseInt(minPrice)
                    && i.getPrice() <= Integer.parseInt(maxPrice)
                    && i.getClass() == getInstance(category)
            ) {
                cnt++;
                System.out.print("[" + (places.indexOf(i) + 1) + "] ");
                printForm(i, 2);
                System.out.println("영업상태 : " + op.openStatus(i));
                System.out.println("---------------------------------------------");
            }
        }
        if(cnt == 0) System.out.println("해당 조건을 만족하는 장소가 없습니다!");
    }

    // 출력 형식 메소드
    public void printForm(AllPlaceDTO i, int num) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());

        if(num == 1) {
            System.out.println("/ " + i.getPlaceName() + " / 지역 : " + i.getRegion());
        }

        if(num == 2) {
            System.out.println(i.getPlaceName());
            System.out.println("지역 : " + i.getRegion() + " / 가격 : " + numberFormat.format(i.getPrice()) + " / 주차장 유무 : " + (i.isParkingLot() ? "Y" : "N"));
            System.out.println("오픈시간 : " + i.getOpenTime() + " / 마감시간 : " + i.getCloseTime() + " / 휴무일 : " + (Objects.isNull(i.getClosedDay()) ? "X" : i.getClosedDay()));
        }
    }
}
