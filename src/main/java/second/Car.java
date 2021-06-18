package second;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;
    private String name;
    private int position;

    public Car() {
    }

    public Car(String name) {
        if (isValidName(name)) {
            this.name = name;
        }
    }

    public Car(String name, int position) {
        this(name);
        this.position = position;
    }

    public String getName() {
        return this.name;
    }

    public void move() {
        this.position += MyRandom.getPosition(2);
        print();
    }

    public int getPosition() {
        return this.position;
    }

    private void print() {
        System.out.printf("%-5s : ", this.name);
        for (int i = 0; i < this.position; i++) {
            System.out.print("-");
        }
        System.out.println();
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
}
