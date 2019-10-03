import at.htl.restprimer.rest.Calculator;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

  private static final Logger log = Logger.getLogger(CalculatorTest.class.getSimpleName());

  private Calculator calculator = new Calculator();

  @Test
  void calculator_twoNumbersDivided_Success() {
    try {
        assertThat(calculator.divide(6, 3), is(Double.valueOf(calculator.divide(6, 3)), 2));
    }catch (Exception e){

    }
  }

  @Test
  void calculator_numberDividedBy0_Fail() {
    Throwable exception = assertThrows(ArithmeticException.class, () -> {
      calculator.divide(6, 0);
    });
    assertThat(exception.getMessage(), is(exception.getMessage(),"/ by zero"));
  }

    private boolean is(String s, String test) {
        return s.compareTo(test) == 0;
    }
    private boolean is(double s, double test) {
        return s == test;
    }
}