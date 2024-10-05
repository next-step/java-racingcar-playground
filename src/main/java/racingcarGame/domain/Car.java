package racingcarGame.domain;

public class Car {
    private final String name;
    private int location;
    private Position position;

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    Car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.location = 0;
        this.position = new Position();
    }

    public void move(int rand) {
        if (rand >= 4 )
            this.location += 1;
    }


    // move 전력이 바뀌는 것을 대비한 추상화
    public void move(MovingStrategy movingStrategy) {
        //여기만 보면 구현체 뭔지 모르는데
        //애플리케이션 코드에 이 메서드 사용할 때 구현체를 넣어주지
        if (movingStrategy.movable()){
            this.location += 1;
            position.move();

        }
    }

}
