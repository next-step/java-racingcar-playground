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
        if( number < 4 ){
            return;
        }
        distance++;
    }

    public Car compareDistance(Car car) {
        if( this.distance >= car.distance  ){
            return this;
        }
        return car;
    }

    public boolean matchDistance(Car car){
        return this.distance == car.distance;
    }

    public String getName() {
        return name;
    }

    public void printCarMove(){
        System.out.print(name + " : ");
        for (int i = 0; i < distance; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
