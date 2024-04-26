package date3355_project.Model;

public class RestaurantDTO extends PlaceDTO {

    private String recommendMenu;   // 추천메뉴
    private boolean blueRibbon;     // 블루리본 유무
    private boolean reservation;    // 예약가능 유무

    public RestaurantDTO(int ID, String placeName, String region, boolean parkingLot,
                         int price, String openTime, String closeTime, String closedDay,
                         String recommendMenu, boolean blueRibbon, boolean reservation) {

        super(ID, placeName, region, parkingLot, price, openTime, closeTime, closedDay);
        this.recommendMenu = recommendMenu;
        this.blueRibbon = blueRibbon;
        this.reservation = reservation;
    }

    public String getRecommendMenu() {
        return recommendMenu;
    }

    public void setRecommendMenu(String recommendMenu) {
        this.recommendMenu = recommendMenu;
    }

    public boolean isBlueRibbon() {
        return blueRibbon;
    }

    public void setBlueRibbon(boolean blueRibbon) {
        this.blueRibbon = blueRibbon;
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
                ", recommendMenu='" + recommendMenu + '\'' +
                ", blueRibbon=" + blueRibbon +
                ", reservation=" + reservation +
                '}';
    }
}
