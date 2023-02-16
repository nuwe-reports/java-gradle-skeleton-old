import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstTest {

    @Test
    void myFirstTest() {
        assertEquals(First.sum2(3, 4), 7);
    }

    @Test
    void myFailedTest() {
        assertEquals(First.sum2(3, 9), 9);
    }
}