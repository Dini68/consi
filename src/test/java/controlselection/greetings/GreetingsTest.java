package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {

    @Test
    void greetingTest() {
        Greetings g = new Greetings();
        assertEquals("jó reggelt", g.greet(5, 1));
        assertEquals("jó éjt", g.greet(4, 59));
        assertEquals("jó reggelt", g.greet(8, 0));
        assertEquals("jó napot", g.greet(15, 0));
        assertEquals("jó estét", g.greet(19, 0));
        assertEquals("jó éjt", g.greet(23, 0));
    }
    @Test
    public void testGreet() {
        Greetings greetings = new Greetings();
        assertEquals("jó éjt", greetings.greet(4, 30));
        assertEquals("jó éjt", greetings.greet(5, 0));
        assertEquals("jó reggelt", greetings.greet(5, 1));
        assertEquals("jó reggelt", greetings.greet(9, 0));
        assertEquals("jó napot", greetings.greet(9, 1));
        assertEquals("jó napot", greetings.greet(18, 30));
        assertEquals("jó estét", greetings.greet(18, 31));
        assertEquals("jó estét", greetings.greet(20, 0));
        assertEquals("jó éjt", greetings.greet(20, 1));
    }
}