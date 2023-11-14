package main.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convertor {
    private static final String INVALID_SIZE = "2개의 숫자를 입력해야 합니다.";

    public static List<Integer> convertToExchangeNumbers(String input) {
        List<Integer> exchangeNumbers = Arrays.stream(input.split(","))
                .map(number -> new Number(number.trim()))
                .map(number -> number.getNumber())
                .collect(Collectors.toList());
        validateSize(exchangeNumbers);
        return exchangeNumbers;
    }

    private static void validateSize(List<Integer> exchangeNumbers) {
        if (exchangeNumbers.size() == 2) {
            throw new IllegalArgumentException(INVALID_SIZE);
        }
    }
}
