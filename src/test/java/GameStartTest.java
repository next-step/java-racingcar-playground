import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameStartTest {


    @Test
    void car_name_split(){
        GameStart gs = new GameStart();
        String[] str = gs.input("pobi,crong,honux");
        assertEquals(str[0], "pobi");
        assertEquals(str[1], "crong");
        assertEquals(str[2], "honux");
    }


    @Test
    void car_name_under_5(){
        String input1 = "crong";
        String input2 = "crongs";

        assertTrue(GameStart.validate(input1));
        assertTrue(!GameStart.validate(input2));
    }

}
