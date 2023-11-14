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
        OutputView.printTurn(turn);
        Numbers numbers = new Numbers(NumbersGenerator.generateNumbers(1, 8));
        OutputView.printNumbers(numbers);
        List<Integer> exchangeNumber = createExchangeNumber();
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
