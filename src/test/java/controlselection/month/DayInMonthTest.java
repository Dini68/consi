package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayInMonthTest {

    @Test
    void yearDivisible400Test() {
        DayInMonth dm = new DayInMonth();

        assertEquals(31, dm.numberOfDays(2000,"Július"));
        assertEquals(30, dm.numberOfDays(2000,"Június"));
        assertEquals(29, dm.numberOfDays(2000,"Február"));
    }

    @Test
    void yearDivisible100Test() {
        DayInMonth dm = new DayInMonth();

        assertEquals(31, dm.numberOfDays(1900,"Július"));
        assertEquals(30, dm.numberOfDays(1900,"Június"));
        assertEquals(28, dm.numberOfDays(1900,"Február"));
    }

    @Test
    void yearDivisible4Test() {
        DayInMonth dm = new DayInMonth();

        assertEquals(31, dm.numberOfDays(2020,"Január"));
        assertEquals(30, dm.numberOfDays(2020,"Április"));
        assertEquals(29, dm.numberOfDays(2020,"Február"));
    }
    @Test
    void yearNoDivisible4Test() {
        DayInMonth dm = new DayInMonth();

        assertEquals(31, dm.numberOfDays(2021,"Január"));
        assertEquals(30, dm.numberOfDays(2021,"Április"));
        assertEquals(28, dm.numberOfDays(2021,"Február"));
    }
    @Test
    void wrongMonthNameTest() {
        DayInMonth dm = new DayInMonth();

        Exception ex = assertThrows(IllegalArgumentException.class, () -> dm.numberOfDays(2021,"Januar"));
        assertEquals("Invalid month: Januar", ex.getMessage());

    }

    @Test
    public void testNumberOfDays() {
        assertEquals(31, new DayInMonth().numberOfDays(2017, "május"));
        assertEquals(30, new DayInMonth().numberOfDays(2017, "június"));
        assertEquals(28, new DayInMonth().numberOfDays(2017, "február"));
        assertEquals(28, new DayInMonth().numberOfDays(1900, "február"));
    }

    @Test
    public void testCase() {
        assertEquals(31, new DayInMonth().numberOfDays(2017, "MáJuS"));
    }

    @Test
    public void testLeapYear() {
        assertEquals(29, new DayInMonth().numberOfDays(2012, "február"));
    }

    @Test
    public void testLeapYear100() {
        assertEquals(28, new DayInMonth().numberOfDays(1900, "február"));
    }

    @Test
    public void testLeapYear400() {
        assertEquals(29, new DayInMonth().numberOfDays(2000, "február"));
    }

    @Test
    public void testIllegalMonth() {
        assertThrows(IllegalArgumentException.class, () -> new DayInMonth().numberOfDays(2012, "abc"));
    }

}