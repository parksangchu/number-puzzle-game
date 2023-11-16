package fifteenpuzzle.main.domain;

import java.util.ArrayList;
import java.util.List;

public class OutNumbers {
    private static final int NUMBERS_SIZE = 4;
    private static final String INVALID_SIZE = "퍼즐 숫자의 개수가 맞지 않습니다.";
    private static final String INVALID_MOVING = "해당 숫자는 움직일 수 없습니다.";
    private final List<List<String>> numbers;


    public OutNumbers(List<List<String>> numbers) {
        validateSize(numbers);
        this.numbers = numbers;
    }

    public List<List<String>> getNumbers() {
        return numbers;
    }

    public void swapNumbers(String exchangeNumbers) {
        List<Integer> targetIndexs = findIndex(exchangeNumbers);
        List<Integer> emptyIndexs = findIndex("");
        if (isValidMoving(targetIndexs, emptyIndexs)) {
            numbers.get(targetIndexs.get(0))
                    .set(targetIndexs.get(1), "");
            numbers.get(emptyIndexs.get(0))
                    .set(emptyIndexs.get(1), exchangeNumbers);
        }
    }

    private boolean isValidMoving(List<Integer> targetIndexs, List<Integer> emptyIndexs) {
        if (isRight(targetIndexs, emptyIndexs)) {
            return true;
        }
        if (isLeft(targetIndexs, emptyIndexs)) {
            return true;
        }
        if (isTop(targetIndexs, emptyIndexs)) {
            return true;
        }
        if (isBottom(targetIndexs, emptyIndexs)) {
            return true;
        }
        throw new IllegalArgumentException(INVALID_MOVING);
    }

    private boolean isRight(List<Integer> targetIndexs, List<Integer> emptyIndexs) {
        return targetIndexs.get(0) == emptyIndexs.get(0) && targetIndexs.get(1) == emptyIndexs.get(1) + 1;
    }

    private boolean isLeft(List<Integer> targetIndexs, List<Integer> emptyIndexs) {
        return targetIndexs.get(0) == emptyIndexs.get(0) && targetIndexs.get(1) == emptyIndexs.get(1) - 1;
    }

    private boolean isTop(List<Integer> targetIndexs, List<Integer> emptyIndexs) {
        return targetIndexs.get(0) == emptyIndexs.get(0) + 1 && targetIndexs.get(1) == emptyIndexs.get(1);
    }

    private boolean isBottom(List<Integer> targetIndexs, List<Integer> emptyIndexs) {
        return targetIndexs.get(0) == emptyIndexs.get(0) - 1 && targetIndexs.get(1) == emptyIndexs.get(1);
    }


    public boolean isAnswer() {
        List<List<String>> answer = makeAnswer();
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (numbers.get(i).get(j).equals(answer.get(i).get(j))) {
                    count++;
                }
            }
        }
        return count >= 15;
    }

    private List<List<String>> makeAnswer() {
        List<List<String>> answer = new ArrayList<>();
        answer.add(List.of("1", "2", "3", "4"));
        answer.add(List.of("5", "6", "7", "8"));
        answer.add(List.of("9", "10", "11", "12"));
        answer.add(List.of("13", "14", "15", ""));
        return answer;
    }

    private List<Integer> findIndex(String exchangeNumber) {
        List<Integer> indexs = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (numbers.get(i).get(j).equals(exchangeNumber)) {
                    indexs.add(i);
                    indexs.add(j);
                }
            }
        }
        return indexs;
    }

    private void validateSize(List<List<String>> numbers) {
        if (numbers.size() != NUMBERS_SIZE) {
            throw new IllegalArgumentException(INVALID_SIZE);
        }
    }
}
