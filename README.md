### 미완성

### ✨ 목적 및 개요
사이드프로젝트를 진행할때 공통적으로 설정하는 것들을 템플릿화하고, 그대로 clone해서 공통모듈 설정하는 시간을 줄인다.


### 🔨 사용한 의존성
JAVA 11, Spirng Boot(2.7.13), SpringCloud(2021.0.8), Spring Data JPA, Validation, Lombok, Thymeleaf, H2 Database, Kakao Social Login


### ✍ Flow
각 파트마다 테스트 할 수 있는 코드 작성

1. 패키지구조 -> 도메인형
2. 서버상태체크 api 테스트
3. cors설정
4. yml파일 (개발, 운영, test) 분리
5. 전역에러처리 (벨리드, 타입, http method, 비지니스로직, 나머지예외)
6. JPA audition
7. Spring Cloud OpenFeign
8. JWT
9. 카카오 토큰발급
