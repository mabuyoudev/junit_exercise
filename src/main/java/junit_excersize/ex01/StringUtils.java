package junit_excersize.ex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
  
  public static String toSnakeCase(String input) {
    
    if (input == null) throw new NullPointerException("text == null.");
    String snake = input;
    Pattern p = Pattern.compile("([A-Z])");
    for (;;) {
      Matcher m = p.matcher(snake);
      if (!m.find()) break;
      snake = m.replaceFirst("_" + m.group(1).toLowerCase());
    }
    return snake.replaceFirst("^_", "");
  }
}
