package main.view;

import main.domain.Numbers;
import main.domain.Turn;

public class OutputView {
    private static final String START_MESSAGE = "간단 숫자 퍼즐";
    private static final String TURN = "\nTurn ";
    private static final String END = "%n%n축하합니다! %d턴만에 퍼즐을 완성하셨습니다!";

    public static void printError(Exception e) {
        System.out.println();
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

    public static void printEnd(Turn turn) {
        System.out.printf(END, turn.getTurn());
    }
}
