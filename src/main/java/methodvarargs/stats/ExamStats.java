package methodvarargs.stats;

public class ExamStats {

    private final int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results == null) {
            throw new IllegalArgumentException("Wrong data");
        }
        int count = 0;
        for (int i: results) {
            if (i > maxPoints * limitInPercent / 100.0) {
                count ++;
            }
        }
        return count;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results == null) {
            throw new IllegalArgumentException("Wrong data");
        }
        for (int i: results) {
            if (i < maxPoints * limitInPercent / 100.0) {
                return true;
            }
        }
        return false;
    }
}
