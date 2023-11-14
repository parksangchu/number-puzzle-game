package main.view;

import java.util.Scanner;

public class InputView {
    private static final String ASK_EXCHANGE_NUMBER = "교환할 두 숫자를 입력>";

    public static String readExchangeNumber() {
        System.out.println(ASK_EXCHANGE_NUMBER);
        return readLine();
    }

    private static String readLine() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
}
