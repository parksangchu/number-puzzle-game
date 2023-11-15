package eightpuzzle.test;

import eightpuzzle.main.domain.Numbers;
import eightpuzzle.main.domain.NumbersGenerator;
import eightpuzzle.main.domain.Turn;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OutNumbersTest {

    @Test
    @DisplayName("1과 2의 자리를 서로 스왑한다.")
    void moveNumbers() {
        Turn turn = new Turn();
        Numbers numbers = NumbersGenerator.generateNumbers(1, 8);
        int before = numbers.getNumbers().indexOf(1);
        List<Integer> exchangeNumbers = List.of(1, 2);
        numbers.swapNumbers(exchangeNumbers);
        int after = numbers.getNumbers().indexOf(2);
        Assertions.assertTrue(before == after);
    }
}