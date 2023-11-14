package main.domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbersGenerator {

    public static List<Integer> generateNumbers(int startNumber, int endNumber) {
        List<Integer> Numbers = IntStream.rangeClosed(startNumber, endNumber)
                .boxed()
                .collect(Collectors.toList());
        Collections.shuffle(Numbers);
        return Numbers;
    }
}
