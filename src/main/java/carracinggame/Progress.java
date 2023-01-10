package carracinggame;

public class Progress {
    private int progress;

    public Progress() {
        this(0);
    }
    public Progress(int progress) {
        if(progress<0)
            throw new IllegalArgumentException("음수는 입력불가 합니다.");
        this.progress = progress;
    }

    public int getProgress() {
        return this.progress;
    }

    public void increaseProgress() {
        this.progress++;
    }
}
