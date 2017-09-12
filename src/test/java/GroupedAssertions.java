import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    In a grouped assertion all assertions are executed
    Failure of one test result into group test failure.
*/
public class GroupedAssertions {
  @Test
  void calculatorTest() {
    assertAll("calculator",
        () -> assertEquals(3, 1 + 2),
        () -> assertEquals(6, 2 * 3)
    );

  }
}
