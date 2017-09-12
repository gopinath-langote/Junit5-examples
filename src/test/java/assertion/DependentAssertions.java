package assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 Within a code block, if an assertion fails the
 subsequent code in the same block will be skipped.
 */
public class DependentAssertions {
  @Test
  void userDataValidations() {
    Person person = new Person("John", "Roy");
    assertAll("user data",
        () -> {
          //Inside this group if first assertion is failed then next assertion will not run.
          String firstName = person.getFirstName();
          assertNotNull(firstName);

          assertAll("first name",
              () -> assertTrue(firstName.startsWith("J")),
              () -> assertTrue(firstName.endsWith("n"))
          );
        },
        () -> {
          // Grouped assertion, so processed independently
          // of results of first name assertions.

          String lastName = person.getLastName();
          assertNotNull(lastName);

          // Executed only if the previous assertion is valid.
          assertAll("last name",
              () -> assertTrue(lastName.startsWith("R")),
              () -> assertTrue(lastName.endsWith("y"))
          );
        });
  }

  class Person {
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }

    public String getFirstName() {
      return firstName;
    }

    public String getLastName() {
      return lastName;
    }
  }
}
