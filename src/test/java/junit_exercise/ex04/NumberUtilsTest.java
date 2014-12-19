package junit_exercise.ex04;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class NumberUtilsTest {

  @Test
  public void 入力値に10を与えるとtrueを返す() throws Exception {
    // SetUp
    // Exercise
    // Verify
    assertThat(NumberUtils.isEven(10), is(true));
  }
  
  @Test
  public void 入力値に7を与えるとfalseを返す() throws Exception {
    // SetUp
    // Exercise
    // Verify
    assertThat(NumberUtils.isEven(7), is(false));
  }

}
