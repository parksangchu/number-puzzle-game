package fifteenpuzzle.main.controller;

import fifteenpuzzle.main.domain.FifteenNumbers;
import fifteenpuzzle.main.domain.Number;
import fifteenpuzzle.main.domain.NumbersGenerator;
import fifteenpuzzle.main.domain.Turn;
import fifteenpuzzle.main.view.InputView;
import fifteenpuzzle.main.view.OutputView;

public class Controller {
    public void start() {
        OutputView.printStartMessage();
        Turn turn = new Turn();
        FifteenNumbers fifteenNumbers = NumbersGenerator.generateNumbers();
        repeatProcess(fifteenNumbers, turn);
        OutputView.printCurrentStatus(turn, fifteenNumbers);
        OutputView.printEnd(turn);
    }

    private void repeatProcess(FifteenNumbers fifteenNumbers, Turn turn) {
        while (!fifteenNumbers.isAnswer()) {
            OutputView.printCurrentStatus(turn, fifteenNumbers);
            createMoving(fifteenNumbers);
            turn.increaseTurn();
        }
    }

    private void createMoving(FifteenNumbers fifteenNumbers) {
        while (true) {
            try {
                String input = InputView.readExchangeNumber();
                Number number = new Number(input);
                String exchangeNumber = String.valueOf(number.getNumber());
                fifteenNumbers.swapNumbers(exchangeNumber);
                return;
            } catch (IllegalArgumentException e) {
                OutputView.printError(e);
            }
        }
    }
}
