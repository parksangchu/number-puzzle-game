package fifteenpuzzle.test;

import fifteenpuzzle.main.domain.NumbersGenerator;
import fifteenpuzzle.main.domain.OutNumbers;
import fifteenpuzzle.main.domain.Turn;
import fifteenpuzzle.main.view.OutputView;
import java.util.List;
import org.junit.jupiter.api.Test;

class NumbersGeneratorTest {

    @Test
    void generateNumbers() {
        Turn turn = new Turn();
        OutNumbers outNumbers = NumbersGenerator.generateNumbers();
        for (List<String> inNumbers : outNumbers.getNumbers()) {
            System.out.println(inNumbers);
        }
        OutputView.printCurrentStatus(turn, outNumbers);
    }
}