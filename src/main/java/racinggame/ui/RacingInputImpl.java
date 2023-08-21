package racinggame.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RacingInputImpl implements RacingInput {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public String receiveCarNames() {
        return readLine();
    }

    @Override
    public int receiveTotalRound() {
        return Integer.parseInt(readLine());
    }

    private String readLine() {
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
}
