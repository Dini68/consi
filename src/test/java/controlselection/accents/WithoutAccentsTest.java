package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutAccentsTest {

    @Test
    void withoutAccentsTest() {
        WithoutAccents wa = new WithoutAccents();
        assertEquals('A', wa.convertToCharWithoutAccents('Á'));
        assertEquals('e', wa.convertToCharWithoutAccents('é'));
        assertEquals('I', wa.convertToCharWithoutAccents('Í'));
        assertEquals('o', wa.convertToCharWithoutAccents('o'));
        assertEquals('u', wa.convertToCharWithoutAccents('ú'));
        assertEquals('U', wa.convertToCharWithoutAccents('Ü'));
        assertEquals('E', wa.convertToCharWithoutAccents('É'));
        assertEquals('e', wa.convertToCharWithoutAccents('e'));
        assertEquals('a', wa.convertToCharWithoutAccents('a'));

    }
    @Test
    public void testWith() {
        assertEquals('a', new WithoutAccents().convertToCharWithoutAccents('á'));
        assertEquals('e', new WithoutAccents().convertToCharWithoutAccents('é'));
        assertEquals('u', new WithoutAccents().convertToCharWithoutAccents('ű'));
        assertEquals('U', new WithoutAccents().convertToCharWithoutAccents('Ű'));
    }

    @Test
    public void testWithout() {
        assertEquals('a', new WithoutAccents().convertToCharWithoutAccents('a'));
        assertEquals('g', new WithoutAccents().convertToCharWithoutAccents('g'));
        assertEquals('z', new WithoutAccents().convertToCharWithoutAccents('z'));
    }
}