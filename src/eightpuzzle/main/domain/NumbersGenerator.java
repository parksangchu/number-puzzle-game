package eightpuzzle.main.domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbersGenerator {

    public static Numbers generateNumbers(int startNumber, int endNumber) {
        List<Integer> numbers = IntStream.rangeClosed(startNumber, endNumber)
                .boxed()
                .collect(Collectors.toList());
        Collections.shuffle(numbers);
        return new Numbers(numbers);
    }
}
