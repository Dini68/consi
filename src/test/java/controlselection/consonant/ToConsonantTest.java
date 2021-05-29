package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToConsonantTest {

    @Test
    void toConsonant() {
        ToConsonant tc = new ToConsonant();
        assertEquals('B', tc.convertToConsonant('A'));
        assertEquals('f', tc.convertToConsonant('e'));
        assertEquals('F', tc.convertToConsonant('F'));
        assertEquals('p', tc.convertToConsonant('o'));
        assertEquals('J', tc.convertToConsonant('I'));
        assertEquals('j', tc.convertToConsonant('j'));
        assertEquals('z', tc.convertToConsonant('z'));
        assertEquals('b', tc.convertToConsonant('a'));
        assertEquals('t', tc.convertToConsonant('t'));

    }
    @Test
    public void testVowel() {
        assertEquals('b', new ToConsonant().convertToConsonant('a'));
        assertEquals('f', new ToConsonant().convertToConsonant('e'));
        assertEquals('j', new ToConsonant().convertToConsonant('i'));
    }

    @Test
    public void testConsonant() {
        assertEquals('b', new ToConsonant().convertToConsonant('b'));
        assertEquals('g', new ToConsonant().convertToConsonant('g'));
        assertEquals('z', new ToConsonant().convertToConsonant('z'));
    }
}