# JD-3355datespot

# 💌 데이터베이스를 활용한 데이트스팟 추천 (랜덤형)

## 💌프로젝트 소개
* 맛집, 카페, 놀거리 세 개의 카테고리를 가진 데이터베이스 구축
* 저장된 데이터베이스를 조회하여 정보를 가져올 수 있음
* 랜덤으로 특정 지역의 데이트 코스를 추천 받을 수 있음
* 실시간 시간 정보를 비교하여 추천 장소의 현재 영업 상태를 확인 할 수 있음


## 🧑‍💻팀원 구성

1. 연주현 (DISNOTACAT)
2. 고유진 (yujin4sth00)
3. 김민규 (Gyunorld)
4. 서윤정 (yj0318)
5. 좌상현 (sanghyeonJwa)

## 🛠️개발 환경
* Develop : JAVA
* Version Constrol : Git
* Communicate : Slack, Notion, 

## 프로젝트 구조
```
├── README.md
└── date3355
     ├── src/main/java/com/date3355_project
           ├── Controller
           |    └── DatePlanManager.java
           |    └── OpenStatus.java
           |    └── PlaceRecommend.java
           |    └── RecommendPlaces.java
           |    └── SearchPlaces.java
           ├── Model
           |    ├── dto
           |    |      ├── AllPlaceDTO.java
           |    |      ├── AttractionDTO.java
           |    |      ├── CafeDTO.java
           |    |      └── RestaurantDTO.java
           |    ├── vo
           |    |      └── InitData.java
           |    
           ├── Run
           |    └── Application.java
           └──View
                ├── MainMenu.java
                └── MenuView.java
```
<br>

## 📋역할 분담

#### 연주현
* 실시간 영업정보 비교
  1. 휴무요일과 영업시간을 비교하여 현재 영업상태 출력

#### 고유진
* 지역별 자동 데이트 추천 개발
  1. 지역 선택시 항목별 데이터를 랜덤 선택하여 출력
 
#### 김민규
* 메인화면 개발
  1. 메인화면 구성
  2. 최근 추가 게시글 노출 기능 제작
 
#### 서윤정
* 새로운 데이터 입력 개발
  1. 사용자에게서 항목별 내용을 입력 받고 저장

#### 좌상현
* 초기 데이터셋 생성, 데이터 조회 개발
  1. 초기 데이터를 입력 및 연결
  2. 전체 데이터 조회
  3. 지역-카테고리-예산 입력에 따른 필터링 조회
 
## 📕 프로젝트 후기

#### 연주현


#### 고유진


#### 김민규


#### 서윤정


#### 좌상현



