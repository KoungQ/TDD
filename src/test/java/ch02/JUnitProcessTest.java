package ch02;

import org.junit.jupiter.api.*;

public class JUnitProcessTest {

    public JUnitProcessTest() {
        System.out.println("Constructor");
    }

    @BeforeAll
    public static void classAll() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("BeforeEach");
    }

    @Test
    public void testForTest() {
        System.out.println("test");
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("AfterEach");
    }

    @AfterAll
    public static void afterAllTest() {
        System.out.println("AfterALl");
    }
}
