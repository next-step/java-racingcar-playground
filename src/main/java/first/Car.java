package first;

import java.util.Random;

public class Car {

    private String name;
    private int position;

    public Car(String name) {
        if (name.length() > 5) {
            throw new IllegalStateException("이름은 5글자를 초과할 수 없습니다");
        }
        this.name = name;
    }

    public void play() {
        this.position += new Random().nextInt(2);
        this.print();
    }

    public void print() {
        System.out.printf("%s : ", this.getName());
        for (int i = 0; i < this.getPosition(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }
}
