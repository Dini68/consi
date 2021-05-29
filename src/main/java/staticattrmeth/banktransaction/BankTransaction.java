package staticattrmeth.banktransaction;

import java.math.BigDecimal;

public class BankTransaction {

    public final static long MIN_LIMIT = 1;
    public final static long MAX_LIMIT = 10_000_000;

    private static long trxValue;
    private static long currentMinValue;
    private static long currentMaxValue;
    private static BigDecimal sum;
    private static long count;

    public BankTransaction(long trxValue) {
        if ( trxValue < MIN_LIMIT || trxValue > MAX_LIMIT) {
            throw new IllegalArgumentException("Wrong data");
        }
        BankTransaction.trxValue = trxValue;
        if (count == 0) {
            currentMinValue = trxValue;
            currentMaxValue = trxValue;
        }
        count ++;
        if (trxValue < currentMinValue) {
            currentMinValue = trxValue;
        }
        if (trxValue > currentMaxValue) {
            currentMaxValue = trxValue;
        }
        BigDecimal bd = BigDecimal.valueOf(trxValue);
        sum = BigDecimal.valueOf(sum.longValue() + bd.longValue());
    }

    public long getTrxValue() {
        return trxValue;
    }

    public static void initTheDay() {
        currentMinValue = 0;
        currentMaxValue = 0;
        trxValue = 0;
        count = 0;
        sum = BigDecimal.valueOf(0);
    }

    public static BigDecimal averageOfTransaction() {
        return BigDecimal.valueOf(sum.longValue() / count);
    }

    public static long getCurrentMinValue() {
        return currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return currentMaxValue;
    }

    public static BigDecimal getSumOfTrxs() {
        return sum;
    }



}
