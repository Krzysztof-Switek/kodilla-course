public class CalcCombined {
    static double PI = 3.1415927;          // [1]

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double circleArea(double r) {
        return PI * r * r;
    }

    public double circlePerimeter(double r) {
        return 2 * PI *r;
    }
    public class CalcApplicationCombined {
        public static void main(String[] args) {
            CalcCombined calculatorNew = new CalcCombined();
            double area = calculatorNew.circleArea(10);          // [1]
            System.out.println("Area of the Circle with radius 10 equals: " + area);
        }
    }
}


