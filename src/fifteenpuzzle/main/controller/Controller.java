package fifteenpuzzle.main.controller;

import fifteenpuzzle.main.domain.Number;
import fifteenpuzzle.main.domain.NumbersGenerator;
import fifteenpuzzle.main.domain.OutNumbers;
import fifteenpuzzle.main.domain.Turn;
import fifteenpuzzle.main.view.InputView;
import fifteenpuzzle.main.view.OutputView;

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
            createMoving(outNumbers);
            turn.increaseTurn();
        }
    }

    private void createMoving(OutNumbers outNumbers) {
        while (true) {
            try {
                String input = InputView.readExchangeNumber();
                Number number = new Number(input);
                String exchangeNumber = String.valueOf(number.getNumber());
                outNumbers.swapNumbers(exchangeNumber);
                return;
            } catch (IllegalArgumentException e) {
                OutputView.printError(e);
            }
        }
    }
}
