package eightpuzzle.main.domain;

public class Number {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 8;
    public static final String INVALID_RANGE = "[ERROR] 1-8사이의 숫자만 입력 가능합니다.";
    public static final String INVALID_TYPE = "[ERROR] 문자는 입력할 수 없습니다.";
    private final int number;

    public Number(String number) {
        validateType(number);
        validateRange(number);
        this.number = Integer.parseInt(number);
    }

    private void validateRange(String number) {
        if (!isValidRange(number)) {
            throw new IllegalArgumentException(INVALID_RANGE);
        }
    }

    private boolean isValidRange(String number) {
        return Integer.parseInt(number) >= MIN_VALUE && Integer.parseInt(number) <= MAX_VALUE;
    }

    private void validateType(String number) {
        if (!isValidType(number)) {
            throw new IllegalArgumentException(INVALID_TYPE);
        }
    }

    private boolean isValidType(String number) {
        return number.chars()
                .allMatch(Character::isDigit);
    }

    public int getNumber() {
        return number;
    }
}
