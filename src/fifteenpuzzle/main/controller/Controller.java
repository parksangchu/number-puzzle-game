package fifteenpuzzle.main.controller;

import fifteenpuzzle.main.domain.Convertor;
import fifteenpuzzle.main.domain.Numbers;
import fifteenpuzzle.main.domain.NumbersGenerator;
import fifteenpuzzle.main.domain.Turn;
import fifteenpuzzle.main.view.InputView;
import fifteenpuzzle.main.view.OutputView;
import java.util.List;

public class Controller {
    public void start() {
        OutputView.printStartMessage();
        Turn turn = new Turn();
        Numbers numbers = NumbersGenerator.generateNumbers(1, 8);
        repeatProcess(numbers, turn);
        OutputView.printCurrentStatus(turn, numbers);
        OutputView.printEnd(turn);
    }

    private void repeatProcess(Numbers numbers, Turn turn) {
        while (!numbers.isAnswer()) {
            OutputView.printCurrentStatus(turn, numbers);
            List<Integer> exchangeNumber = createExchangeNumber();
            numbers.swapNumbers(exchangeNumber);
            turn.increaseTurn();
        }
    }

    private List<Integer> createExchangeNumber() {
        while (true) {
            try {
                String input = InputView.readExchangeNumber();
                return Convertor.convertToExchangeNumbers(input);
            } catch (IllegalArgumentException e) {
                OutputView.printError(e);
            }
        }
    }

}
