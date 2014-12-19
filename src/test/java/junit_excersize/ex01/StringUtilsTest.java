package junit_excersize.ex01;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

  @Test
  public void toSnakeCaseにaaaを渡すとaaaが取得できる() {
    // SetUp
    String expected = "aaa";
    // Exercise
    String actual   = StringUtils.toSnakeCase("aaa");
    // Verify
    assertThat(actual, is(expected));
  }
  
  @Test
  public void toSnakeCaseにHelloWorldを渡すとhello_worldが取得できる() throws Exception {
    // SetUp
    String expected = "hello_world";
    // Exercise
    String actual   = StringUtils.toSnakeCase("HelloWorld");
    // Verify
    assertThat(actual, is(expected));
  }
  
  @Test
  public void toSnakeCaseにpracticeJunitを渡すとpractice_junitが取得できる() throws Exception {
    // SetUp
    String expected = "practice_junit";
    // Exercise
    String actual   = StringUtils.toSnakeCase("practiceJunit");
    // Verify
    assertThat(actual, is(expected));
  }
}
