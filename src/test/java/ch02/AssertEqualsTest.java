package ch02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertEqualsTest {

    private int sum(int x, int y) {
        return x + y;
    }

    @Test
    void assertEqualsExample1Test() {
        int actual = 2;
        int expected = 2;

        assertEquals(expected, actual);
    }

    private String toUpperCase(String name) throws NullPointerException {
        if(name == null)
            throw new NullPointerException();
        return name.toUpperCase();
    }

    @Test
    void toUpperCaseThrowNPETest() {
        try {
            String name = toUpperCase("KOUNGKYU");
            assertEquals("KOUNGKYU", name);
        } catch (NullPointerException ignored) {}
    }

    @Test
    void toUpperCaseThrowNPEFailTest() {
        assertThrows(NullPointerException.class,
                () -> toUpperCase(null));
    }
}
