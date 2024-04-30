package date3355_project.Model.dto;

import java.time.LocalDate;

public class AttractionDTO extends AllPlaceDTO {

    private String subCategory;     // 서브 카테고리 (볼거리/할거리)
    private LocalDate startDate;    // 시작일
    private LocalDate endDate;      // 종료일
    private boolean reservation;    // 예약가능여부

    public AttractionDTO(String placeName, String region, boolean parkingLot,
                         int price, String openTime, String closeTime, String closedDay,
                         String subCategory, LocalDate startDate, LocalDate endDate, boolean reservation) {

        super(placeName, region, parkingLot, price, openTime, closeTime, closedDay);
        this.subCategory = subCategory;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reservation = reservation;
    }



    public AttractionDTO() {

    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isReservation() {
        return reservation;
    }

    public void setReservation(boolean reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", subCategory='" + subCategory + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", reservation=" + reservation +
                '}';
    }
    public String toString1() {
        return super.toString1() +
                "  subCategory='" + subCategory + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", reservation=" + reservation +
                '}';
    }

}
