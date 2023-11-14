package main.domain;

public class Number {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 8;
    public static final String INVALID_RANGE = "[ERROR] 1-8사이의 숫자만 입력 가능합니다.";
    private final int number;

    public Number(int number) {
        validateRange(number);
        this.number = number;
    }

    private void validateRange(int number) {
        if (!isValidRange(number)){
            throw new IllegalArgumentException(INVALID_RANGE);
        }
    }
    private boolean isValidRange(int number) {
        return number >= MIN_VALUE && number <= MAX_VALUE;
    }

    public int getNumber() {
        return number;
    }
}
