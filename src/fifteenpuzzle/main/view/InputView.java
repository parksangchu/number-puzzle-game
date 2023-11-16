package fifteenpuzzle.main.view;

import java.util.Scanner;

public class InputView {
    private static final String ASK_EXCHANGE_NUMBER = "\n숫자 입력> ";

    public static String readExchangeNumber() {
        System.out.print(ASK_EXCHANGE_NUMBER);
        return readLine();
    }

    private static String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
