import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    FizzBuzz f;

    @BeforeEach
    void setUp() {
        f = new FizzBuzz();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fizzBuzzString() {
        String testString = "fub";
        String str = f.fizzBuzz(testString);
        assertEquals("FizzBuzz", str);
    }

    @Test
    void startswithother() {
        String testString  = "happy";
        String strTest = f.fizzBuzz(testString);
        assertEquals("happy", strTest);
    }


    @Test
    void endwithb() {
        String testString = "tub";
        String str = f.fizzBuzz(testString);
        assertEquals("Buzz", str);
    }

    @Test
    void returnsnull() {
        String  testArray = null;
        String strArray = f.fizzBuzz(testArray);
        assertEquals(null, strArray);
    }

}