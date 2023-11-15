package fifteenpuzzle.main.domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class OutNumbers {
    private static final int NUMBERS_SIZE = 4;
    private static final String INVALID_SIZE = "퍼즐 숫자의 개수가 맞지 않습니다.";
    private List<List<String>> numbers;

    public OutNumbers(List<List<String>> numbers) {
        validateSize(numbers);
        this.numbers = numbers;
    }

    public List<List<String>> getNumbers() {
        return numbers;
    }

    public void swapNumbers(List<Integer> exchangeNumbers) {
        int indexZero = findIndex(exchangeNumbers, 0);
        int indexOne = findIndex(exchangeNumbers, 1);
        Collections.swap(numbers, indexZero, indexOne);
    }

    public boolean isAnswer() {
        List<Integer> answer = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        return IntStream.range(0, numbers.size())
                .allMatch(index -> numbers.get(index).equals(answer.get(index)));
    }

    private int findIndex(List<Integer> exchangeNumbers, int index) {
        return numbers.indexOf(exchangeNumbers.get(index));
    }

    private void validateSize(List<List<String>> numbers) {
        if (numbers.size() != NUMBERS_SIZE) {
            throw new IllegalArgumentException(INVALID_SIZE);
        }
    }
}
