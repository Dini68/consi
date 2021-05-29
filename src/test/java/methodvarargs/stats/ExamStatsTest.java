package methodvarargs.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {

    @Test
    void getNumberOfTopGrades() {
        ExamStats examStats = new ExamStats(100);
        int count = examStats.getNumberOfTopGrades(60, 45,50,55,60,65,70,75,80);
        assertEquals(4, count);
    }

    @Test
    void hasAnyFailed() {
        ExamStats examStats = new ExamStats(100);
        boolean isExist = examStats.hasAnyFailed(50, 45,50,55,60,65,70,75,80);
        assertEquals(true, isExist);
    }
}