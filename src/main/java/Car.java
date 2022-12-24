public class Car {
    private String name;
    private int position;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public  void progress(int randomGenerate) {
        if(randomGenerate >=4) movePosition();
    }


    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void movePosition() {
        this.position+=1;
    }
}
