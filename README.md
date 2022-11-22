# todaysjjigae
<h2>오늘의 찌개</h2>
<hr>
<li>메뉴고민을 덜기 위해 찌개를 랜덤으로 선택해주는 토이프로젝트를 만들었습니다.</li>
<li>찌개 선호도가 높을 수록 선택될 확률이 높습니다.</li>
<li>찌개 객체 등록,수정,삭제 가능합니다.</li>
<br>
<h3>✅목표</h3>
<li>Kotlin 언어 학습</li>
<li>REST API 서버</li>
<li>자체 Exception 클래스 생성 : 발생할 수 있는 모든 예외를 고려하여 예외처리</li>
<br>
<h3>🪛개발환경</h3>
<li>Gradle</li>
<li>Kotlin 1.6.21</li>
<li>Springboot 2.7.5</li>
<li>Mysql (AWS RDS)</li>
<li>Spring Data JPA</li>
<br>
<h3>🛠️프로젝트 구조</h3>
<li>DTO : 계층 간 데이터 전송을 위한 객체 생성</li>
<li>Entity : 도메인 모델</li>
<li>Mapper 인터페이스 / 클래스 : 객체와 DTO 간의 변환을 돕는 메서드 작성 ( fromEntity(ENTITY) , toEntity(DTO) )</li>
<li>Repository 인터페이스 : JpaRepository - JPA 관련 작업들을 별도의 코드 없이 처리 가능하게 도움</li>
<li>Service : 비즈니스 로직 처리</li>
<li>Exception : 예외 처리</li>
<li>Resource : 컨트롤러</li>
<br><br>

<p>프로젝트 상세 및 POSTMAN 을 통한 API TEST 과정을 포스팅으로 정리했습니다🔽</p>
<h2>https://feelfreetothink.tistory.com/147</h2>
