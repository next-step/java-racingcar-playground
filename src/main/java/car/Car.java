package car;

public class Car {
    private final String name;
    private int distance = 0;
    public Car(String name) {
        checkCarNameLength(name);
        this.name = name;
    }

    private void checkCarNameLength(String carName){
        if( carName.length() > 5 ){
            throw new IllegalArgumentException("car name too long");
        }
    }

    public void go(int number) {
        if( number >= 4 ){
            distance++;
        }
    }

    public int getDistance() {
        return this.distance;
    }
}
