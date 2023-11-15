package main.domain;

import java.util.Collections;
import java.util.List;

public class Numbers {
    private final List<Integer> numbers;

    public Numbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void swapNumbers(List<Integer> exchangeNumbers, Turn turn) {
        int indexZero = findIndex(exchangeNumbers, 0);
        int indexOne = findIndex(exchangeNumbers, 1);
        Collections.swap(numbers, indexZero, indexOne);
        turn.increaseTurn();
    }

    private int findIndex(List<Integer> exchangeNumbers, int index) {
        return numbers.indexOf(exchangeNumbers.get(index));
    }
}
