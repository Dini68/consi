package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstTest {

    @Test
    void sumTest() {
        First first = new First();

        assertEquals(10, first.sum(4, 6));
    }

    @Test
    void sum2Test() {
        First first = new First();

        int sum = first.sum(7,6);

        assertEquals(13, sum);
    }
}