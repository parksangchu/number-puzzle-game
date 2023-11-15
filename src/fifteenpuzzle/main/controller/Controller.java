package fifteenpuzzle.main.controller;

import fifteenpuzzle.main.domain.Convertor;
import fifteenpuzzle.main.domain.NumbersGenerator;
import fifteenpuzzle.main.domain.OutNumbers;
import fifteenpuzzle.main.domain.Turn;
import fifteenpuzzle.main.view.InputView;
import fifteenpuzzle.main.view.OutputView;
import java.util.List;

public class Controller {
    public void start() {
        OutputView.printStartMessage();
        Turn turn = new Turn();
        OutNumbers outNumbers = NumbersGenerator.generateNumbers();
        repeatProcess(outNumbers, turn);
        OutputView.printCurrentStatus(turn, outNumbers);
        OutputView.printEnd(turn);
    }

    private void repeatProcess(OutNumbers outNumbers, Turn turn) {
        while (!outNumbers.isAnswer()) {
            OutputView.printCurrentStatus(turn, outNumbers);
            List<Integer> exchangeNumber = createExchangeNumber();
            outNumbers.swapNumbers(exchangeNumber);
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
