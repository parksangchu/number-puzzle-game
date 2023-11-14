package main.view;

import main.domain.Numbers;
import main.domain.Turn;

public class OutputView {
    private static final String START_MESSAGE = "간단 숫자 퍼즐";
    private static final String TURN = "Turn ";

    public static void printError(Exception e) {
        System.out.println(e.getMessage());
    }

    public static void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public static void printTurn(Turn turn) {
        System.out.println(TURN + turn.getTurn());
    }

    public static void printNumbers(Numbers numbers) {
        System.out.println(numbers.getNumbers());
    }
}
