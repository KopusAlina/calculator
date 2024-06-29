public class Calculator {
    public static double vichisleniya(double a, double b, String operation) {
        double result = 0;
        switch (operation) {
            case ("+"):
                result = a + b;
                break;
            case ("-"):
                result = a - b;
                break;
            case ("/"):
                result = a / b;
                break;
            case ("*"):
                result = a * b;
                break;
        }
        return result;
    }
}
