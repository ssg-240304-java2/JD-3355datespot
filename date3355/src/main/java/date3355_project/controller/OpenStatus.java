package date3355_project.controller;

import date3355_project.Model.dto.AllPlaceDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class OpenStatus {

    LocalDate date = LocalDate.now();
    public String openStatus(AllPlaceDTO place) {

        String openStatus = "";
        char closedDay = place.getClosedDay().charAt(0);
        String day = date.getDayOfWeek().toString();


        char todayOfWeek = ' ';
        switch (day) {
            case "MONDAY":
                todayOfWeek = '월';
                break;
            case "TUESDAY":
                todayOfWeek = '화';
                break;
            case "WEDNESDAY":
                todayOfWeek = '수';
                break;
            case "THURSDAY":
                todayOfWeek = '목';
                break;
            case "FRIDAY":
                todayOfWeek = '금';
                break;
            case "SATURDAY":
                todayOfWeek = '토';
                break;
            default:
                todayOfWeek = '일';
                break;
        }

        /* 1. 오늘과 휴무일이 겹치는지 비교 result = 0 -> "휴무일" */
        if (place.getClosedDay() == null ) {
            openStatus = "실시간 영업정보 없음";
        }
        else if (todayOfWeek == closedDay) {
            openStatus = "휴무일";
        } else {
            return hourCheck(place);
        }

        return openStatus;
    }


    public String hourCheck(AllPlaceDTO place) {
        if (place.getOpenTime() != null && place.getCloseTime() != null) {
            LocalTime openTime = place.getOpenTime();
            LocalTime closeTime = place.getCloseTime();
            return LocalTime.now().isAfter(openTime) && LocalTime.now().isBefore(closeTime) ? "영업중" : "영업종료";

        } else {
            return "실시간 영업정보 없음";
        }
    }
}
