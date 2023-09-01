import java.io.IOException;

public class CarController {
    private final InputView inputView;
    private final OutputView outputView;

    public CarController(InputView inputView, OutputView outputView) { // 둘은 완전히 책임이 다르므로 의존주입 받기
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void game() throws IOException {
        outputView.inputName();
        String input = inputView.getInput();
        String[] splitInput = inputView.getCars(input);
        Cars cars = new Cars(splitInput);
        outputView.getTrial();
        int trial = Integer.parseInt(inputView.getInput());
        for (int i = 0; i < trial; i++) {
            cars.move();
            outputView.result(cars);
        }
        outputView.winner(cars);
    }
}
