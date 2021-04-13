package math.rounding;

import java.util.Random;

public class RoundingAnomaly {

    public double[] randomNumbers(int size, double max, int scale) {
        double[] result = new double[size];
        double number = Math.pow(10, scale);
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            result[i] =  (long)(rnd.nextDouble() * max * number) / number;
        }
        return result;
    }

    public double roundAfterSum(double[] numbers) {
        double sum = 0;
        for (double d: numbers) {
            sum += d;
        }
        return Math.round(sum);
    }

    public double sumAfterRound(double[] numbers) {
        double sum = 0;
        for (double d: numbers) {
            sum += Math.round(d);
        }
        return sum;
    }

    public double difference(int size, double max, int scale) {
        double[] numbers = randomNumbers(size, max, scale);
        double d1 = roundAfterSum(numbers);
        System.out.println(d1);
        double d2 = sumAfterRound(numbers);
        System.out.println(d2);
        return Math.abs(d1 - d2);
    }

    public static void main(String[] args) {
        RoundingAnomaly ra = new RoundingAnomaly();

        double sum = 0;
        int max = 100;
        for (int i = 0; i < max; i++) {
            sum += ra.difference(1000, 1_000_000, 5);
        }

        System.out.println(sum / max);


    }
}
