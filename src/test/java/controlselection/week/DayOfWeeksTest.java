package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfWeeksTest {

    DayOfWeeks dw = new DayOfWeeks();

    @Test
    void dayOfWeeksTest() {
        assertEquals("hét eleje", dw.whichDay("Hétfő"));
        assertEquals("hét közepe", dw.whichDay("Kedd"));
        assertEquals("majdnem hétvége", dw.whichDay("Péntek"));
        assertEquals("hét vége", dw.whichDay("Szombat"));
    }
    @Test
    void dayOfWeeksWrongDataTest() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> dw.whichDay("Hetfo"));
        assertEquals("Invalid day: Hetfo", ex.getMessage());
    }

    @Test
    public void testWhichDay() {
        assertEquals("hét eleje", new DayOfWeeks().whichDay("hétfő"));
        assertEquals("hét közepe", new DayOfWeeks().whichDay("szerda"));
        assertEquals("majdnem hétvége", new DayOfWeeks().whichDay("péntek"));
        assertEquals("hét vége", new DayOfWeeks().whichDay("vasárnap"));
    }

    @Test
    public void testCase() {
        assertEquals("hét eleje", new DayOfWeeks().whichDay("hÉtfŐ"));
    }

    @Test
    public void testIllegalDay() {


        assertThrows(IllegalArgumentException.class, () -> new DayOfWeeks().whichDay("abc"));
    }
}