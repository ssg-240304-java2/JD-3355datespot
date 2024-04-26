package date3355_project.Model.vo;

import date3355_project.Model.dto.AttractionDTO;
import date3355_project.Model.dto.CafeDTO;
import date3355_project.Model.dto.AllPlaceDTO;
import date3355_project.Model.dto.RestaurantDTO;

import java.time.LocalDate;
import java.util.List;

public class InitData {

    public void initalData(List<AllPlaceDTO> places) {

        // 강남구 데이터
        places.add(new CafeDTO("셀렉티드마롱", "강남구", true, 5000, "08:00:00", "22:00:00", null, "티라미수 플래터", false));
        places.add(new RestaurantDTO("오제제 강남", "강남구", false, 40000, "11:00:00", "21:00:00", null, "쟈루우동과 카츠", false, false));
        places.add(new AttractionDTO( "강남향수공방 닷노트", "강남구", false, 49000, "11:00:00", "22:00:00", null, "할거리", null, null, true));
        places.add(new AttractionDTO("나이스웨더마켓", "강남구", false, 35000, "11:00:00", "22:00:00", null, "볼거리", null, null, false));

        // 성북구 데이터
        places.add(new CafeDTO("학림", "성북구", false, 6000, "10:00:00", "23:00:00", null, "비엔나커피", true));
        places.add(new RestaurantDTO("칸다소바", "성북구", false, 13500, "11:30:00", "21:30:00", null, "마제소바", true, false));
        places.add(new AttractionDTO("셜록홈즈", "성북구", false, 44000, "12:00:00", "23:30:00", null, "할거리", null, null, true));
        places.add(new AttractionDTO("창경궁 산책", "성북구", true, 1000, "09:00:00", "21:00:00", "MON", "할거리", null, null, true));
        places.add(new AttractionDTO("라온아트", "성북구", false, 50000, "11:00:00", "20:00:00", null, "볼거리", LocalDate.of(2017, 3, 1), LocalDate.of(2030, 3, 1), true));

        // 영등포구 데이터
        places.add(new CafeDTO("브링미커피 브루어스", "영등포구", false, 4000, "09:00:00", "22:00:00", null, "에그타르트", true));
        places.add(new RestaurantDTO("베르두레", "영등포구", false, 20000, "10:00:00", "22:00:00", null, "트러플 뇨끼 파스타", true, true));
        places.add(new AttractionDTO("더플라스틱 클라이밍 문래점", "영등포구", false, 30000, "12:00:00", "00:00:00", null, "할거리", null, null, true));
        places.add(new AttractionDTO("선유도 공원", "영등포구", true, 0, "06:00:00", "23:59:59", null, "볼거리", null, null, false));
        places.add(new AttractionDTO("더현대 서울 '폼페이 유물전'", "영등포구", true, 20000, "10:30:00", "22:00:00", null, "볼거리", LocalDate.of(2024, 1, 13), LocalDate.of(2024, 5, 6), true));
        places.add(new AttractionDTO("더현대 서울 '2023 크리스마스 팝업'", "영등포구", true, 0, "10:30:00", "22:00:00", null, "볼거리", LocalDate.of(2023, 11,1), LocalDate.of(2023, 12, 31), false));

        // 강동구 데이터
        places.add(new CafeDTO("아이스베리", "강동구", false, 9000, "12:00:00", "23:50:00", null, "밀크딸기요빙", false));
        places.add(new RestaurantDTO("더화이트", "강동구", true, 55000, "11:30:00", "22:00:00", null, "프랑스식 코스요리", true, true));
        places.add(new AttractionDTO("브릭스파크", "강동구", true, 20000, "13:00:00", "22:00:00", null, "할거리", null, null, true));
        places.add(new AttractionDTO("광나루 한강공원", "강동구", false, 0, "00:00:00", "23:59:59", null, "볼거리", null, null, false));

        // 송파구 데이터
        places.add(new CafeDTO("코히루", "송파구", false, 15000, "11:00:00", "22:00:00", null, "밤테린느", false));
        places.add(new RestaurantDTO("니커버커 베이글", "송파구", true, 20000, "09:00:00", "18:00:00", null, "연어 샌드위치", true, false));
        places.add(new AttractionDTO("아이홉 맥주공방", "송파구", true, 50000, "12:00:00", "21:00:00", null, "할거리", null, null, true));
        places.add(new AttractionDTO("서울스카이", "송파구", true, 31000, "10:30:00", "22:00:00", null, "볼거리", null, null, false));
        places.add(new AttractionDTO("뮤지컬 '헤드윅'", "송파구", true, 80000, "19:30:00", "21:30:00", null, "볼거리", LocalDate.of(2024,3,22), LocalDate.of(2024, 6, 23), true));
        places.add(new AttractionDTO("서울 재즈 페스티벌 2024", "송파구", true, 200000, "12:00:00", "22:00:00", null, "볼거리", LocalDate.of(2024, 5, 31), LocalDate.of(2024,6,2), true));

    }
}
