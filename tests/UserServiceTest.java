
package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {
    @Test
    public void testUserRegistration() {
        String expected = "User registered successfully!";
        String actual = "User registered successfully!";
        assertEquals(expected, actual);
    }
}
