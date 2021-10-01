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

[] 자동차 이름,위치 정보를 가지는 객체 생성 - Car
[] 자동차 이름 , 에따라 주어지면 split 해서 Car 객체를 가지는 Cars 그룹 생성 - Cars
[] Validation체크
    []이름 5자 체크
    []null체크
    []isempty체크
    []정상적으로 들어왔는지 체크
    [](,)에 따라 객체 생성 안될시 오류) - Cars
[] 자동차 움직임 구현 0~1 - Car , move
[] 자동차 그룹으로 움직임 구현 0~1 - Cars , move
[] 횟수에 따른 움직임 구현 
    [] 횟수가 음수 일시 오류 발생

[] 위치 정보에 따른 승자 뽑아내기

----- 출력
[] 자동차 이름 입력하세요 
[] 도할 회수 몇회
[] 실행 결과
[] 횟수에 따른 이동 결과
[] 최종 우승 자동차 
    [] 1명, 0명 , 2명이상
----- 입력
[ ]  자동차 이름 입력
[ ]  횟수 입력
