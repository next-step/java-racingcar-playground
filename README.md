1. [v] 사용자에게 차 이름 문자열 입력받기 #InputView.requestCarNames()
2. [v] 사용자에게 시행 횟수 입력받기 #InputView.requestGameCount()
3. [v] 입력받은 차 이름 문자열 (,) 단위로 분해하기 #Parser.splitInputNames()
4. [v] 분해된 차 이름 5글자 초과하는지 유효성 검사하기 #Name.validateCarNameLength()
5. [v] 분해된 차 이름 갯수만큼 car 생성, 위치값 이름 초기화 Cars 반환 #GameService.joinCar()
    - [v]car 객체의 멤버변수 Name 입력 #Car.setCarName()
    - [v]car 객체의 멤버변수 Position 입력 #Car.setCarPosition
    - [v]Position 객체의 멤버변수 int position 입력 #Position.setPosition()
    - [v]Name 객체의 멤버변수 String name 입력 #Name.setName()
6. [] 각각의 car 객체를 cars 객체의 ArrayList에 담기 #Cars.addCar()
7. [] 랜덤한 1~9 숫자 하나 뽑기 #RandomNumber.generateNumber()
8. [] Car 전진 #Car.go()
9. [] 뽑은 숫자가 4 이상일 경우 Car.go( ) 실행  #GameService.isRandomNumberOverFour( )
10. [] 입력받은 시행 횟수만큼 반복하기 #GameService.play()
    -[] 멤버변수 Count 클래스 만들기
11. [] 시행 결과 사용자에게 표시하기 #ResultView.printResult()
12. [] 최종 게임 결과를 발표한다. #ResultView.printWinner()
