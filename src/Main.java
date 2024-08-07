import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lesson lesson = new Lesson();
        lesson.printThreeWords();
        lesson.checkSumSign();
        lesson.printColor();
        lesson.compareNumbers();
        System.out.println(Lesson.sumInRange(1, 8));
        lesson.NumberType(-1);
        System.out.println(Lesson.numberNegative(-1));
        Lesson.printString("java", 2);
        System.out.println(Lesson.leapYear(86));
        Lesson.invertArray();
        Lesson.fillArray();
        Lesson.doubleArray();
        Lesson.createDiagonalArray();
        lesson.createArray();
    }
}