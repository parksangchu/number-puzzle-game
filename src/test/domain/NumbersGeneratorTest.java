package test.domain;

import java.util.List;
import main.domain.NumbersGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NumbersGeneratorTest {

    @ParameterizedTest
    @DisplayName("1-8 수를 가진다.")
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8})
    void generateNumbers(int input) {
        List<Integer> numbers = NumbersGenerator.generateNumbers(1, 8);
        Assertions.assertEquals(8, numbers.size());
        Assertions.assertEquals(true, numbers.contains(input));
    }
}