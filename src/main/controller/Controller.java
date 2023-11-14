package main.controller;

import main.domain.Turn;
import main.view.OutputView;

public class Controller {
    public void start(){
        OutputView.printStartMessage();
        Turn turn = new Turn();
        OutputView.printTurn(turn);
    }
}
