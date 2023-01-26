import java.util.Random;

public class Car {
    String name;
    Random random;
    int currentLocation;

    public Car(String name) {
        if(5 < name.length())
            throw new IllegalArgumentException("자동차의 이름은 5자를 넘어갈수 없습니다.");

        this.name = name;
        this.random = new Random();
        this.currentLocation = 0;
    }

    public void race(){
        if(createRandomNum() > 4)
            ++currentLocation;
        System.out.print(this.name + " : ");
        for(int i = 0; i < currentLocation; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    private int createRandomNum(){
        return random.nextInt(10);
    }

}
