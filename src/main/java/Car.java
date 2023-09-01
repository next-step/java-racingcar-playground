import java.util.Random;

public class Car {
    private final String name;
    private int location = 1;
    public Car(String name) {
        if (name.length() > 5) throw new RuntimeException();
        this.name = name;
    }

    public int getLocation(){
        return this.location;
    }

    public void move(){
        Random random = new Random();
        if (random.nextInt(10) >= 4) this.location++;
    }

    public String getName() {
        return name;
    }
}
