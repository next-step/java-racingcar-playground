1. 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다. -> CarValidator.validCarName(carName);
3. 자동차 이름은 쉼표(,)를 기준으로 구분한다.
4. 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다. -> RandomNumberGenerator.create();

7. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다. -> RacingGame 에서 그냥 Sys로 반환해야 한다. 
7. 자동차 시합에 기본적인 세팅들을 진행함 -> RacingGame.createGameInfo();
(경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).
pobi,crong,honux
시도할 회수는 몇회인가요?
5 )

7. 시합할 자동차를 만든다 -> RacingCarGenerator.create(); (0)
7. 우승자를 알려준다. -> GoalLine.informWinner();

7. 자동차는 시도마다 움직일 수 있다. -> RacingCar.move(); (0)
8. 자동차는 경주한다. -> RacingGame.race();