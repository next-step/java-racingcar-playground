## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

-----

기능 요구사항 "" => 0 "1,2" => 3, "1,2,3" => 6, "1,2:3" => 6
“//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용 //;\n1;2;3과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)
문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.

메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
method가 한 가지 일만 하도록 최대한 작게 만들어라.

-----

자동차 게임

각 자동차 이름 부여 > 5자 초과 불가

자동차들 클래스 (,로 들어와서 각 자동차 클래스에 매핑 시키기)

자동차 클래스 ( 5자 초과 체크 ) 

전진하는 자동차 출력시 자동차 이름 출력

자동차 이름 ,로 구분

0~9 random 값을 구한 후 4이상일때만 전진

누가 우승했는지 알려줌 우승자는 한명 이상일수도있음.

객체 생성 new Car("asdfz,ASDDE,QWERT") -> 검사 글자 수, 각 Car 객체로 할당

4, 3으로 테스트 코드 작성 후 전진(enum) 메소드 출력

Cars에서 서로 비교하기?