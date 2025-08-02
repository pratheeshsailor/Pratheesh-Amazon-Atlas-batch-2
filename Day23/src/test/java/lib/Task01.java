package lib;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task01 {

    @Test
    @Tag("firstPriority")
    void testMethod01() {
        int expected = 2;
        int actual = 1 + 1;
        assertEquals(expected, actual);
    }

    @Test
    @Tag("firstPriority")
    void runTestcase02() {
        String str = "JUnit";
        assertEquals("JUnit", str);
    }

    @Test
    @Tag("fastTag")
    void testMethod03() {
        assertEquals(4, 2 * 2);
    }

    @Test
    @Tag("slowTag")
    void runTestcase04() {
        assertEquals(10, 5 + 5);
    }
}
