package second;

import java.util.Random;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;
    private String name;
    private int position;
    private Random random;

    public Car() {

    }

    public Car(String name) {
        if (isValidName(name)) {
            this.name = name;
        }
        random = new Random();
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    private boolean isValidName(String name) {
        if (!isValidLength(name)) {
            throw new IllegalStateException("이름은 다섯자를 넘을 수 없습니다");
        }
        return true;
    }

    private boolean isValidLength(String name) {
        return name.length() <= MAX_NAME_LENGTH;
    }

    public String getName() {
        return this.name;
    }

    public void move() {
        this.position += random.nextInt(2);
    }

    public int getPosition() {
        return this.position;
    }

    public void print() {
        System.out.printf("%-5s : ", this.name);
        for (int i = 0; i < this.position; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
