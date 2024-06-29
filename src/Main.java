import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число");
        double y = scanner.nextDouble();
        System.out.println("введите второе число");
        double x = scanner.nextDouble();
        System.out.println("введите операцию");
        String z = scanner.next();
        double r = Calculator.vichisleniya(y, x, z);
        System.out.println("Равно " + r);
        double с = scanner.nextDouble();
         }
}