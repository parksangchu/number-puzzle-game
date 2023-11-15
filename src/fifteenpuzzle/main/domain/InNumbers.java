package fifteenpuzzle.main.domain;

import java.util.List;

public class InNumbers {
    private static final int NUMBERS_SIZE = 4;
    private static final String INVALID_SIZE = "퍼즐 숫자의 개수가 맞지 않습니다.";
    private List<Integer> numbers;

    public InNumbers(List<Integer> numbers) {
        validateSize(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    private void validateSize(List<Integer> numbers) {
        if (numbers.size() != NUMBERS_SIZE) {
            throw new IllegalArgumentException(INVALID_SIZE);
        }
    }
}
