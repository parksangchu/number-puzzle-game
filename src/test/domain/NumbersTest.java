package test.domain;

import java.util.List;
import main.domain.Numbers;
import main.domain.NumbersGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumbersTest {

    @Test
    @DisplayName("1과 2의 자리를 서로 스왑한다.")
    void moveNumbers() {
        Numbers numbers = NumbersGenerator.generateNumbers(1, 8);
        int before = numbers.getNumbers().indexOf(1);
        List<Integer> exchangeNumbers = List.of(1, 2);
        numbers.swapNumbers(exchangeNumbers);
        int after = numbers.getNumbers().indexOf(2);
        Assertions.assertTrue(before == after);
    }
}