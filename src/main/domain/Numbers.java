package main.domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Numbers {
    private final List<Integer> numbers;

    public Numbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
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

}
