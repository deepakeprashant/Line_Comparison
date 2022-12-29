public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation");
        System.out.println("Length of Line is "+Math.round(lineLengthCalculate(-5,4,-3,-1)));
    }

    private static double lineLengthCalculate(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
}
