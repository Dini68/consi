package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GentlemanTest {

    @Test
    void sayHelloTest() {
        Gentleman g = new Gentleman();

        String result = g.sayHello("Dénes");

        assertEquals("Hello Dénes", result);

    }
    @Test
    void sayHelloTestNull() {
        Gentleman g = new Gentleman();

        String result = g.sayHello(null);

        assertEquals("Hello Anonymus", result);

    }
}