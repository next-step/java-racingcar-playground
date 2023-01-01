package practice;

public class Car {
    private String name;
    private int progress;

    public Car(String name, int progress) {
        this.name = name;
        this.progress = progress;
    }

    public void logProgress(Car car){
        System.out.print(this.name);
        for(int i=0;i<this.progress;i++)
            System.out.print("-");
    }

    public void advance(){
        this.progress++;
    }

    public String getName() {
        return name;
    }

    public int getProgress() {
        return progress;
    }
}
