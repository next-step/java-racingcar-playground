import java.util.Comparator;
import java.util.Random;

public class Car implements Comparable<Car> {
    String name;
    Random random;
    int currentLocation;

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Car(String name) {
        if(5 < name.length())
            throw new IllegalArgumentException("자동차의 이름은 5자를 넘어갈수 없습니다.");

        this.name = name;
        this.random = new Random();
        this.currentLocation = 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentLocation() {
        return currentLocation;
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


    @Override
    public int compareTo(Car o) {
        if (o.getCurrentLocation() > currentLocation)
            return 1;
        else if (o.getCurrentLocation() < currentLocation)
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
