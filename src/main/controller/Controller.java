package main.controller;

import java.util.List;
import main.domain.Convertor;
import main.domain.Numbers;
import main.domain.NumbersGenerator;
import main.domain.Turn;
import main.view.InputView;
import main.view.OutputView;

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
