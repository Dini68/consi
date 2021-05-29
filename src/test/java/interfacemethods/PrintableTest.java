package interfacemethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintableTest {

    @Test
    public void testGetColorWithDefaultImplementation() {
        Printable printable = new NewsPaper();
        assertEquals(Printable.BLACK, printable.getColor(0));
    }

}