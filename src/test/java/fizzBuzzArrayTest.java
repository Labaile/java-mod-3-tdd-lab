import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fizzBuzzArrayTest {

    fizzBuzzArray f;

    @BeforeEach
    void setUp() {
        f = new fizzBuzzArray();
    }


    @AfterEach
    void tearDown() {
    }

    @Test
    void fizzBuzzArray() {
        String [] testArray  = {"fun", "tub", "fub"};
        String [] expectedArray = {"Fizz", "Buzz","FizzBuzz"};
        String[] strArray = f.fizzBuzzArray(testArray);
        assertArrayEquals(expectedArray, strArray);
    }

    @Test
    void returnsNull() {
        String [] testArray = null;
        String[] strArray = f.fizzBuzzArray(testArray);
        assertArrayEquals(null, strArray);
    }
}