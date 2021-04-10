package arrayofarrays;

import java.util.Arrays;

public class ArrayOfArraysMain {

    public static void main(String[] args) {

        new ArrayOfArraysMain().toString(new ArrayOfArraysMain().multiplicationTable(5));

        System.out.println();
        int[][] arr = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = (i+2) * (j+5);
            }
        }

        new ArrayOfArraysMain().printArrayOfArrays(arr);

        System.out.println();
        int[][] arr2 = new ArrayOfArraysMain().triangularMatrix(8);
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        new ArrayOfArraysMain().getInfo(new ArrayOfArraysMain().getValues());

    }

    public int[][] multiplicationTable(int size) {
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = (i + 1) * (j + 1);
            }
        }
        return result;
    }

    public void toString(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printArrayOfArrays(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] triangularMatrix(int size) {
        int[][] result = new int[size][];
        for (int i = 0; i < size; i++) {
            result[i] = new int[i+1];
            for(int j = 0; j <= i; j++) {
                result[i][j] = i;
            }
        }
        return result;
    }

    public int[][] getValues() {
        int[][] values = new int[12][];
        values[0] = new int[31];
        for(int j = 0; j <31; j++) {
            values[0][j] = j * 5;
        }
        values[1] = new int[28];
        values[2] = new int[31];
        values[3] = new int[30];
        values[4] = new int[31];
        values[5] = new int[30];
        values[6] = new int[31];
        values[7] = new int[31];
        values[8] = new int[30];
        values[9] = new int[31];
        values[10] = new int[30];
        values[11] = new int[31];
        return values;
    }

    public void getInfo (int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value = arr[i][j];
                if (Integer.toString(value).length() == 1) {
                    System.out.print("   " + value);
                }
                if (Integer.toString(value).length() == 2) {
                    System.out.print("  " + value);
                }
                if (Integer.toString(value).length() == 3) {
                    System.out.print(" " + value);
                }
            }
            System.out.println();
        }
    }
}
