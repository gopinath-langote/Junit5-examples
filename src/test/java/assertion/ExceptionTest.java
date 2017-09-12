package assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {
  @Test
  void shouldThrowSomeException() {
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
      // here code throwing exception.
      throw new IllegalArgumentException("a message");
    });

    assertEquals("a message", exception.getMessage());
  }
}
