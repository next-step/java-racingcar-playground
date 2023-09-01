1. 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다. -> CarValidator.validCarName(carname);
2. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
3. 자동차 이름은 쉼표(,)를 기준으로 구분한다.
4. 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
5. 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.


6. 경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).
   pobi,crong,honux
   시도할 회수는 몇회인가요?
   5
위와 같은 예시에서 RacingCarCreator.create();
GoalLine.createGoalLine();

7. 자동차는 시도마다 움직일 수 있다. -> RacingCar.move();