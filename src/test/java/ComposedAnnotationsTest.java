import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComposedAnnotationsTest {
  @Test
  @Fast
  void customAnnotationTest() {
    assertEquals(1, 2 - 1);
  }

  @Target({ElementType.TYPE, ElementType.METHOD})
  @Retention(RetentionPolicy.RUNTIME)
  @Tag("fast")
  public @interface Fast {
  }
}

