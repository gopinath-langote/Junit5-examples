import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test display name feature")
public class DisplayNameTest {
  @Test
  @DisplayName("Custom test having name with spaces.")
  void testDisplayNameWithSpaces() {

  }

  @Test
  @DisplayName("!@Ī%@ & )")
  void testDisplayNameWithSpecialCharacters() {

  }

  @Test
  @DisplayName("\uD83D\uDE32")
  void testDisplayNameWithEmoji() {

  }
}
