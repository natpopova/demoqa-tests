package tests;

import org.junit.jupiter.api.*;

public class FirstJUnitTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("This method executed before all tests");
    }

    @BeforeEach
    void before() {
        System.out.println("This method executed before each test");
    }

    @AfterEach
    void after() {
        System.out.println("This method executed after each test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("This method executed after all tests");
    }

    @Test
    void textTest() {
        System.out.println("        The first test!");
    }

    @Test
    void videoTest() {
        System.out.println("        The second test!");
    }
}