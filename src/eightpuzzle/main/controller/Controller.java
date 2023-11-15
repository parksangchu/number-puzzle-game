package eightpuzzle.main.controller;

import eightpuzzle.main.domain.Convertor;
import eightpuzzle.main.domain.Numbers;
import eightpuzzle.main.domain.NumbersGenerator;
import eightpuzzle.main.domain.Turn;
import eightpuzzle.main.view.InputView;
import eightpuzzle.main.view.OutputView;
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
