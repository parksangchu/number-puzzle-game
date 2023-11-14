package main.view;

import main.domain.Turn;

public class OutputView {
    private static final String START_MESSAGE = "간단 숫자 퍼즐";
    private static final String TURN = "Turn ";
    public static void printStartMessage(){
        System.out.println(START_MESSAGE);
    }
    public static void printTurn(Turn turn){
        System.out.println(TURN + turn.getTurn());
    }
}
