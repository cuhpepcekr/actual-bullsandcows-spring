# 숫자 야구 게임(Bulls and Cows)
## 주요 화면 및 기능
### 회원가입/로그인/로그아웃
#### 회원가입
* 성공  
로그인 성공 안내 창 출력 후 로그인 페이지로 이동.  
* 아이디 중복  
안내 문구 출력.  
* 최대 글자수 초과  
안내 문구 출력.  
#### 로그인
* 성공  
홈페이지로 이동.  
* 아이디 또는 비밀번호 미일치  
안내 문구 출력.  
#### 로그아웃
* 홈페이지로 이동.  
### 관리자
#### 회원 목록 페이지
* 회원의 간단한 정보를 목록으로 출력.  
#### 회원 상세 페이지
* 회원의 상세한 정보를 출력.  
* 출제자 권한을 설정 가능.
### 출제자
#### 게임 목록 페이지
* 게임의 간단한 정보를 목록으로 출력.  
#### 게임 상세 페이지
* 게임의 상세한 정보를 출력.  
#### 게임 생성 페이지
* 게임 생성 가능한 폼 출력.  
#### 게임 수정 페이지
* 게임 수정 가능한 폼 출력.  

### 풀이자
#### 게임 목록 페이지
* 게임의 간단한 정보를 목록으로 출력.  
#### 게임 진행 페이지
* 게임 진행 페이지 출력.  
#### 게임 기록 목록 페이지
* 게임 기록의 간단한 정보를 목록으로 출력.  
#### 게임 기록 상세 페이지
* 게임 기록의 상세한 정보를 출력.  


## 초기 환경 설정
### Docker
#### mySQL
docker run -d -p 2206:3306 --name actual-bullsandcows-docker -e MYSQL_ROOT_PASSWORD=rootpasswordvalue -e MYSQL_DATABASE=databasevalue -e MYSQL_USER=uservalue -e MYSQL_PASSWORD=passwordvalue mysql:latest --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci
### Spring
#### 테스트 데이터 생성
BullsandcowsApplicationTests.class 실행.
