

import main.java.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

  private static Calculator calculator;

  @BeforeAll
  public static void init(){
    calculator = new Calculator();
  }

  @Test
  public void verifyAddition() {
    assertEquals(45, calculator.addition(25,20));
  }


  @Test
  public void verifySubtraction() {
    assertEquals(5, calculator.subtract(25,20));
  }


  @Test
  public void verifyMultiplication() {
    assertEquals(500, calculator.multiply(25,20));
  }

  @Test
  public void verifyDivision() {
    assertEquals(10, calculator.multiply(40,4));
  }


  @Test
  public void verifyDivisionByZero() {
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
      calculator.division(5, 0);
    });
    assertEquals("Cannot division by zero", exception.getMessage());
  }
}


