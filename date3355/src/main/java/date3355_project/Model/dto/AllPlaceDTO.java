package date3355_project.Model.dto;

import java.time.LocalTime;

public class AllPlaceDTO {

    private String placeName;       // 장소 이름
    private String region;          // 지역
    private boolean parkingLot;     // 주차장 유무
    private int price;              // 가격
    private LocalTime openTime;     // 오픈시간
    private LocalTime closeTime;    // 마감시간
    private String closedDay;       // 휴무일
    private String information;     // 설명

    // 휴무요일은 어떠한 타입으로 선언해야 할지 미정이라 일단 String으로 설정
    // 이용가능여부는 오픈시간과 마감시간 데이터로 기능 파트에서 구현할 가능성이 있어서 비워놨습니다.

    // Constructor, 생성자에 설명까지 붙여서 생성해야 하면 너무 길어질거 같아서 설명 넣기는 getter, setter로 뺏습니다!
    public AllPlaceDTO() {
    }

    public AllPlaceDTO(String placeName, String region, boolean parkingLot,
                       int price, String openTime, String closeTime, String closedDay) {

        this.placeName = placeName;
        this.region = region;
        this.parkingLot = parkingLot;
        this.price = price;
        this.openTime = LocalTime.parse(openTime);
        this.closeTime = LocalTime.parse(closeTime);
        this.closedDay = closedDay;
    }

    // Getter / Setter
    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(boolean parkingLot) {
        this.parkingLot = parkingLot;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public void setOpenTime(LocalTime openTime) {
        this.openTime = openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(LocalTime closeTime) {
        this.closeTime = closeTime;
    }

    public String getClosedDay() {
        return closedDay;
    }

    public void setClosedDay(String closedDay) {
        this.closedDay = closedDay;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    // toString
    @Override
    public String toString() {
        return ", placeName='" + placeName + '\'' +
                ", region='" + region + '\'' +
                ", parkingLot=" + parkingLot +
                ", price=" + price +
                ", openTime=" + openTime +
                ", closeTime=" + closeTime +
                ", closedDay='" + closedDay + '\''
                ;
    }

    public String toString1() {//출력결과를 깔끔하게 하고 싶어서 추가한 부분(고유진)
        return " { 장소명='" + placeName + '\'' +
                ", 지역='" + region + '\'' +
                ", 주차가능=" + parkingLot +
                ", 가격=" + price +
                ", 오픈시간=" + openTime +
                ", 마감시간=" + closeTime +
                ", 휴일='" + closedDay + '\''
                ;
    }
}
