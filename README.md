# 숫자 야구 게임(Bulls and Cows)
## 요구 사항 정의서  
### 출제자  
#### 게임 생성 페이지  
1. 정답을 입력할 수 있는 3~4개 입력 요소.  
2. 회차를 입력할 수 있는 1개 입력 요소.  
3. 게임을 생성하는 버튼.  
4. 정답과 회차가 유효한 값인지 확인하는 기능.  
> 1. 입력한 정답이 3~4개인지 확인.  
> 2. 입력한 정답이 0~9 사이의 숫자인지 확인.  
> 3. 입력한 회차가 1~9 사이의 숫자인지 확인.  
5. 게임 생성.  
6. 게임 생성 후 게임 진행 페이지로 이동.  
### 풀이자  
#### 게임 진행 페이지  
1. 최대 회차를 알려주는 요소.  
2. 현재까지 시도한 횟수를 알려주는 요소.  
3. 플레이어 이름 알려주는 요소.  
4. 정답을 입력할 수 있는 3~4개 입력 요소.  
> 1. 출제자가 설정한 개수의 입력 요소.  
5. 정답 입력 후 전송을 위한 버튼.  
6. 정답이 유효한 값인지 확인하는 기능.  
> 1. 입력한 정답이 0~9 사이의 숫자인지 확인.  
7. 숫자 전송 후 정답과 비교하여 Strike, Ball을 알려주는 요소.  
> 1. 숫자와 위치가 모두 틀리면 “OUT”  
> 2. 숫자와 위치가 맞으면 “Strike”  
> 3. 숫자가 맞았느나 위치가 틀리면 “Ball”  
8. 현재 게임의 최고 기록을 알려주는 요소.  
> 1. Strike를 3점, Ball을 1점으로 계산해 최고 점수인 회차를 안내.  
> 2. 최고 기록이 같은 경우가 두 번 이상인 경우 모두 안내.  
9. 3 Strikes일 경우 Win 안내 창 출력.  
> 1. 확인 버튼, 최고 기록 확인 버튼.  
> 2. 확인 버튼 클릭 시 게임 목록 페이지로 이동.  
> 3. 최고 기록 확인 버튼 클릭 시 최고 기록을 안내.  
10. 마지막 회차까지 정답을 맞추지 못하면 Lose 안내 창 출력.  
> 1. 확인 버튼, 최고 기록 확인 버튼.  
> 2. 확인 버튼 클릭 시 게임 목록 페이지로 이동.  
> 3. 최고 기록 확인 버튼 클릭 시 최고 기록을 안내.  
### 공통  
#### 게임 목록 페이지  
1. 게임 번호, 정답 길이, 최대 회차 열.  
2. 클릭 시 게임 진행 페이지로 이동.  



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
### Swagger
Spring 소스코드에서 규칙에 따라 내용 입력 시,  
API 문서를 자동으로 생성해주는 도구입니다.  
확인 가능한 주소 : http://localhost:8080/swagger-ui.html  
