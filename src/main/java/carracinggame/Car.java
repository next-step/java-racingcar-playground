package carracinggame;

public class Car {
    private Name name;
    private Progress progress;

    public Car(String name, int progress) {
        this.name= new Name(name);
        this.progress =new Progress();
    }

    public void logProgress(Car car){
        System.out.print(this.name);
        for(int i=0;i<this.progress.getProgress();i++)
            System.out.print("-");
    }

    public void advance(MovingStrategy movingStrategy){
        if(movingStrategy.movable())
            progress.increaseProgress();
    }

    public String getName() {
        return name.getName();
    }

    public int getProgress() {
        return this.progress.getProgress();
    }
}
