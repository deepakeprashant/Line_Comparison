import java.util.Objects;

public class RefactorLineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation");
        RefactorLineComparison refactorLineComparison = new RefactorLineComparison();
        double firstLength = refactorLineComparison.lineLengthCalculate(-5, 4, -3, -1);
        double secondLength = refactorLineComparison.lineLengthCalculate(5, 7, 5, 9);
        refactorLineComparison.lineEqualMethod(firstLength, secondLength);
        refactorLineComparison.lineCompareToMethod(firstLength, secondLength);

    }

    double lineLengthCalculate(int x1, int x2, int y1, int y2) {
        double x = Math.pow(x2 - x1, 2);
        double y = Math.pow(y2 - y1, 2);
        return Math.sqrt(x + y);
    }

    void lineEqualMethod(double firstLength, double secondLength) {
        if (Objects.equals(firstLength, secondLength)) {
            System.out.println("The Line Are Equal");
            System.out.println("Line One Value " + firstLength + "\nLine Two Value " + secondLength);
            return;
        }
        System.out.println("The Are Not Equal");
        System.out.println("Line One Value " + firstLength + "\nLine Two Value " + secondLength);
    }

    void lineCompareToMethod(double firstLength, double secondLength){
        String line1 = String.valueOf(firstLength);
        String line2 = String.valueOf(secondLength);
        int result = line1.compareTo(line2);
        if (result == 0) {
            System.out.println("Both Line are Equals");
        } else if (result > 0) {
            System.out.println("The Line 1 is Greater Than Line 2");
        } else {
            System.out.println("The Line 2 is Greater Than Line 1");
        }
    }
}
