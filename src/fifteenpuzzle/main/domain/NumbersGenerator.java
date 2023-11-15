package fifteenpuzzle.main.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbersGenerator {
    private static final int START_NUM = 0;
    private static final int END_NUM = 15;
    private static final int IN_NUMBERS_START_INIT_NUM = 0;
    private static final int IN_NUMBERS_END_INIT_NUM = 3;

    public static OutNumbers generateNumbers() {
        List<String> targetNumbers = IntStream.rangeClosed(START_NUM, END_NUM)
                .mapToObj(number -> String.valueOf(number))
                .collect(Collectors.toList());
        Collections.shuffle(targetNumbers);
        List<List<String>> outNumbers = addInNumbers(targetNumbers);
        outNumbers = cutZero(outNumbers);
        return new OutNumbers(outNumbers);
    }

    private static List<List<String>> addInNumbers(List<String> targetNumbers) {
        List<List<String>> outNumbers = new ArrayList<>();
        int startNum = IN_NUMBERS_START_INIT_NUM;
        int endNum = IN_NUMBERS_END_INIT_NUM;
        for (int i = 0; i < 4; i++) {
            outNumbers.add(IntStream.rangeClosed(startNum, endNum)
                    .mapToObj(index -> targetNumbers.get(index))
                    .collect(Collectors.toList()));
            startNum += 4;
            endNum += 4;
        }
        return outNumbers;

    }

    private static List<List<String>> cutZero(List<List<String>> outNumbers) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (outNumbers.get(i).get(j).equals("0")) {
                    outNumbers.get(i).set(j, "");
                }
            }
        }
        return outNumbers;
    }
}
