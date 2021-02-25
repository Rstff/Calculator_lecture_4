import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean end = true;
        while (end) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первый операнд: ");
            String firstoperand = scanner.nextLine();
            while (!(isDigitsOnly(firstoperand))) {
                System.out.println("Не верно задано число! Попробуем еще раз");
                System.out.print("Введите первый операнд: ");
                firstoperand = scanner.nextLine();
            }
            int firstoperandInt = Integer.parseInt(firstoperand);
            System.out.print("Введите операцию +,-,*,/,^: ");
            String operation = scanner.nextLine();
            while (!(operation.equals("+") || operation.equals("-")
                    || operation.equals("*") || operation.equals("/") || operation.equals("^"))) {
                System.out.println("Не верно задана операция! Попробуем еще раз");
                System.out.print("Введите операцию: ");
                operation = scanner.nextLine();
            }
            System.out.print("Введите второй операнд: ");
            String secondoperand = scanner.nextLine();
            while (!(isDigitsOnly(secondoperand))) {
                System.out.println("Не верно задано число! Попробуем еще раз");
                System.out.print("Введите второй операнд: ");
                secondoperand = scanner.nextLine();
            }
            int secondoperandInt = Integer.parseInt(secondoperand);
            if (operation.equals("+")) {
                Sum sum = new Sum();
                double result = sum.execute(firstoperandInt, secondoperandInt);
                System.out.println(firstoperand + operation + secondoperand + "=" + result);
            }
            if (operation.equals("-")) {
                Difference difference = new Difference();
                double result = difference.execute(firstoperandInt, secondoperandInt);
                System.out.println(firstoperand + operation + secondoperand + "=" + result);
            }
            if (operation.equals("*")) {
                Multiplication multiplication = new Multiplication();
                double result = multiplication.execute(firstoperandInt, secondoperandInt);
                System.out.println(firstoperand + operation + secondoperand + "=" + result);
            }
            if (operation.equals("/")) {
                Divide divide = new Divide();
                double result = divide.execute(firstoperandInt, secondoperandInt);
                System.out.println(firstoperand + operation + secondoperand + "=" + result);
            }
            if (operation.equals("^")) {
                Degree degree = new Degree();
                double result = degree.execute(firstoperandInt, secondoperandInt);
                System.out.println(firstoperand + operation + secondoperand + "=" + result);
            }
            System.out.print("Посчитаем еще? Введите да/нет ");
            String close = scanner.nextLine();
            while (!(close.equals("нет") || close.equals("да"))) {
                System.out.print("Некорректный ввод! Продолжаем? Введите да/нет ");
                close = scanner.nextLine();
            }
            if (close.equals("нет")) {
                end = false;
            }
        }
    }
    public static boolean isDigitsOnly(String str) {
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (!(symbol >= '0' && symbol <= '9')) {
                return false;
            }
        }
        return true;
    }
}
