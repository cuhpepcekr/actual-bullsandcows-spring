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
### 설치 및 설정, 실행
1. Java SE Development Kit 8u251 설치, 환경 변수 설정  
https://www.oracle.com/kr/java/technologies/javase/javase-jdk8-downloads.html  
2. Git 설치  
https://git-scm.com/downloads  
3. IntelliJ IDEA 설치  
https://www.jetbrains.com/ko-kr/idea/download/  
4. Docker 설치  
https://www.docker.com/get-started  
5. Docker에서 MySQL 설치
docker run -d -p 2206:3306 --name actual-bullsandcows-docker -e MYSQL_ROOT_PASSWORD=rootpasswordvalue -e MYSQL_DATABASE=databasevalue -e MYSQL_USER=uservalue -e MYSQL_PASSWORD=passwordvalue mysql:latest --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci  
6. Git clone  
경로 : C:\Users\Manager\project-spring\  
git clone https://github.com/cuhpepcekr/actual-bullsandcows-spring.git  
7. IntelliJ로 프로젝트 열기
경로 : C:\Users\Manager\project-spring/actual-bullsandcows-spring  
8. 스키마, 데이터 생성
BullsandcowsApplicationTests.class 실행.
### 확인된 오류 및 해결 방안
* IntelliJ에서 Lombok의 builder() 오류  
> * 증상  
```Cannot resolve method 'builder' in 'User'  ```  
> * 해결 방안  
> > 1. 경로 : File -> Settings... -> Plugins  
> > 2. Lombok 검색 후 설치  
> > 3. 경로 : File -> Settings... -> Plugins -> Build, Execution, Deployment 🠖 Compiler 🠖 Annotation Processors  
> > 4. Enable annotation processing 체크  

* IntelliJ에서 Project import시 Gradle에서 오류 발생  
Gradle 버전을 낮추어서 실행.  
```$ ./gradlew wrapper --gradle-version 5.6.4  ```  
위 명령어를 실행하려고 하는데 아래와 같은 오류가 발생할 때  
```bash: ./gradlew: Permission denied  ```  
아래 명령어 실행하면 Gradle 설치 가능.  
```$ chmod +x gradlew  ```  
