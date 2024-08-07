import java.sql.SQLOutput;
import java.util.Arrays;

public class Lesson {
    public void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");;
    }
    public void checkSumSign() {
        int a = 1, b = -2;
        if ((a+b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
        System.out.println("Сумма отрицательная");
        }
    }
    public void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    public void compareNumbers() {
        int a = 3, b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
    public static boolean sumInRange(int a, int b) {
        return ((a +b) >= 10 && (a +b)<=20);
    }
    public void NumberType(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательный");
        }
    }
    public static boolean numberNegative(int a) {
        return (a < 0);
    }
    public static void printString( String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
            }
            System.out.println(Arrays.toString(arr));
    }
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void doubleArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void createDiagonalArray() {
        int size = 5;
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            arr[i][i] = 1;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void createArray() {
        int len = 7;
        int initialValue = 8;
        int[] arr = createArray(len, initialValue);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue; // Заполнение массива значением initialValue
        }
        return arr;
    }
}
