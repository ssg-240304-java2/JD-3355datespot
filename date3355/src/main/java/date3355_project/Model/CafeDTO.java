package date3355_project.Model;

public class CafeDTO extends PlaceDTO {

    private String recommendMenu;   // 추천메뉴
    private boolean blueRibbon;     // 블루리본 유무

    public CafeDTO(int ID, String placeName, String region, boolean parkingLot,
                   int price, String openTime, String closeTime, String closedDay,
                   String recommendMenu, boolean blueRibbon) {

        super(ID, placeName, region, parkingLot, price, openTime, closeTime, closedDay);
        this.recommendMenu = recommendMenu;
        this.blueRibbon = blueRibbon;
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

    @Override
    public String toString() {
        return super.toString() +
                ", recommendMenu='" + recommendMenu + '\'' +
                ", blueRibbon=" + blueRibbon +
                '}';
    }
}
