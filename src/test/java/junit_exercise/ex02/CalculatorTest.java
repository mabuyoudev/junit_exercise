package junit_exercise.ex02;

import org.junit.Test;

public class CalculatorTest {

  @Test(expected = IllegalArgumentException.class)
  public void divideで第二引数に0を与えるとIllegalArgumentExceptionが発生する() throws Exception {
    // SetUp
    Calculator sut = new Calculator();
    // Exercise
    // Verify
    sut.divide(10, 0);
  }
}
