package fifteenpuzzle.main.view;

import fifteenpuzzle.main.domain.OutNumbers;
import fifteenpuzzle.main.domain.Turn;

public class OutputView {
    private static final String START_MESSAGE = "간단 숫자 퍼즐";
    private static final String TURN = "\nTurn ";
    private static final String END = "%n축하합니다! %d턴만에 퍼즐을 완성하셨습니다!";

    public static void printError(Exception e) {
        System.out.println();
        System.out.println(e.getMessage());
    }

    public static void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public static void printCurrentStatus(Turn turn, OutNumbers outNumbers) {
        OutputView.printTurn(turn);
        OutputView.printNumbers(outNumbers);
    }

    private static void printTurn(Turn turn) {
        System.out.println(TURN + turn.getTurn());
    }

    private static void printNumbers(OutNumbers outNumbers) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("[%2s]", outNumbers.getNumbers()
                        .get(i)
                        .get(j));
            }
            System.out.println();
        }
    }

    public static void printEnd(Turn turn) {
        System.out.printf(END, turn.getTurn());
    }

}
