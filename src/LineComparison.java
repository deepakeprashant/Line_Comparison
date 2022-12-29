import java.util.Objects;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation");
        double firstLength = lineLengthCalculate(-5, 4, -3, -1);
        double secondLength = lineLengthCalculate(5, 7, 5, 9);
        if (Objects.equals(firstLength, secondLength)) {
            System.out.println("The Line Are Equal");
            System.out.println("Line One Value " + firstLength + "\nLine Two Value " + secondLength);
        } else {
            System.out.println("The Are Not Equal");
            System.out.println("Line One Value " + firstLength + "\nLine Two Value " + secondLength);
        }
    }

    private static double lineLengthCalculate(int x1, int x2, int y1, int y2) {
        double x = Math.pow(x2 - x1, 2);
        double y = Math.pow(y2 - y1, 2);
        return Math.sqrt(x + y);
    }
}
