package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void test_toString() {
        Review classUnderTest = new Review("John", "This place tastes bad", 2);
        assertEquals("Author: John\n" +
                "Stars: 2\n" +
                "This place tastes bad",
                classUnderTest.toString());
    }
}