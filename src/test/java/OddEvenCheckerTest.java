package test.java;

import main.java.OddEvenChecker;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OddEvenCheckerTest {

    private OddEvenChecker oddEvenChecker = new OddEvenChecker();


    @ParameterizedTest(name = "test odd number with four odd numbers (1, 300, -33, 5) ")
    @ValueSource(ints = {1, 300, -33, 5})
            public void testOddNumber(int number) {
        assertTrue(Numbers.isOdd(number));
    }


    @ParameterizedTest(name = "test even number with four even numbers (2, 400, -22, 6) ")
    @ValueSource(ints = {2, 400, -22, 6})
            public void testEvenNumber(int number) {
        assertFalse(Numbers.isOdd(number));
    }

}
