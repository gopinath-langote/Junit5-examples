import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertionTest {
  @Test
  void standardAssertions() {
    assertEquals(3, 3);
    assertEquals(10, 10, "The optional assertion message is now the last parameter.");
    assertTrue(2 == 2, () -> "Assertion messages can be lazily evaluated -- to avoid constructing complex messages unnecessarily.");
  }
  
}
