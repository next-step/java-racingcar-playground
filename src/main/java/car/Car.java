package car;

public class Car {

    private final CarName name;
    private int distance = 0;
    public Car(String name) {
        this.name = new CarName(name);
    }

    public void go(int number) {
        if( number >= 4 ){
            distance++;
        }
    }
    public CarName getName() {
        return name;
    }

    public int getDistance() { return this.distance; }

    public String moveView(){
        StringBuilder result = new StringBuilder(this.name + " : ");
        for (int i = 0; i < distance; i++) {
            result.append("-");
        }
        return result.toString();
    }
}
