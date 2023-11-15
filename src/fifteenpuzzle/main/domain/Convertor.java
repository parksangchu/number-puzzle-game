package fifteenpuzzle.main.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convertor {
    private static final String DELIMITER = ",";
    private static final String INVALID_SIZE = "2개의 숫자를 입력해야 합니다.";
    private static final String DUPLICATED = "중복된 숫자는 입력 불가능합니다.";

    public static List<Integer> convertToExchangeNumbers(String input) {
        List<Integer> exchangeNumbers = Arrays.stream(input.split(DELIMITER))
                .filter(number -> !number.isEmpty())
                .map(number -> new Number(number.trim()))
                .map(Number::getNumber)
                .collect(Collectors.toList());
        validateSize(exchangeNumbers);
        validateDuplicated(exchangeNumbers);
        return exchangeNumbers;
    }

    private static void validateDuplicated(List<Integer> exchangeNumbers) {
        if (isDuplicated(exchangeNumbers)) {
            throw new IllegalArgumentException(DUPLICATED);
        }
    }

    private static boolean isDuplicated(List<Integer> exchangeNumbers) {
        int AfterCut = (int) exchangeNumbers.stream()
                .distinct()
                .count();
        return exchangeNumbers.size() != AfterCut;
    }

    private static void validateSize(List<Integer> exchangeNumbers) {
        if (exchangeNumbers.size() != 2) {
            throw new IllegalArgumentException(INVALID_SIZE);
        }
    }
}
