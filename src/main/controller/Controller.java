package main.controller;

import main.domain.Numbers;
import main.domain.NumbersGenerator;
import main.domain.Turn;
import main.view.OutputView;

public class Controller {
    public void start() {
        OutputView.printStartMessage();
        Turn turn = new Turn();
        OutputView.printTurn(turn);
        Numbers numbers = new Numbers(NumbersGenerator.generateNumbers(1, 8));
    }
}
