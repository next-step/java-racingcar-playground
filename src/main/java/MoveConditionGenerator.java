import java.util.Random;

public class MoveConditionGenerator {
    private static final Random random = new Random();

    public static int generate(){
        return random.nextInt(10);
    }
}
