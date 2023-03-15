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
    public String getName() {
        return name;
    }

    public int getDistance() { return this.distance; }

    public String moveView(){
        String result = this.name + " : ";
        for (int i = 0; i < distance; i++) {
            result += "-";
        }
        return result;
    }
}
