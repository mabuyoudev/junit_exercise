package junit_exercise.ex03;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {

  @Test
  public void 初期状態でincrementメソッドを実行すると1が取得できる() throws Exception {
    // SetUp
    Counter sut  = new Counter();
    int expected = 1;
    // Exercise
    int actual   = sut.increment();
    // Verify
    assertThat(actual, is(expected));
  }
  
  @Test
  public void incrementメソッドを1回実行した状態でincrementメソッドを実行すると2が取得できる() throws Exception {
    // SetUp
    Counter sut  = new Counter();
    int expected = 2;
    // Exercise
    sut.increment();
    int actual   = sut.increment();
    // Verify
    assertThat(actual, is(expected));
  }
  
  @Test
  public void incrementメソッドを50回実行した状態でincrementメソッドを実行すると51が取得できる() throws Exception {
    // SetUp
    Counter sut = new Counter();
    int expected = 51;
    // Exercise
    for (int i = 0; i < 50; i++) {
      sut.increment();
    }
    int actual = sut.increment();
    // Verify
    assertThat(actual, is(expected));
  }
  
}
