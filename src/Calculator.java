import java.util.Scanner;

public class Calculator {

    public static double number1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите первое число:");
        return sc.nextDouble();
    }

    public static double number2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите второе число:");
        return sc.nextDouble();
    }

    public static double number() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите число:");
        return sc.nextDouble();
    }

    public static double angle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите угол:");
        return sc.nextDouble();
    }

    public static void main(String[] args) {
        double num1;
        double num2;
        int exit = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Укажите действие:");
            System.out.print("+ ");
            System.out.print("- ");
            System.out.print("* ");
            System.out.println("/ ");
            System.out.print("Корень ");
            System.out.println("Степень ");
            System.out.print("sin ");
            System.out.print("cos ");
            System.out.print("tg ");
            System.out.println("ctg ");
            System.out.print("Пи ");
            System.out.println("Е ");
            System.out.println("Выход ");
            String dey = sc.nextLine();
            double result;
            switch (dey) {

                //сложение
                case "+":
                    num1 = number1();
                    num2 = number2();
                    result = num1 + num2;
                    skip();
                    System.out.println("Результат:" + result);
                    break;

                //вычитание
                case "-":
                    num1 = number1();
                    num2 = number2();
                    result = num1 - num2;
                    skip();
                    System.out.println("Результат:" + result);
                    break;

                //умножение
                case "*":
                    num1 = number1();
                    num2 = number2();
                    result = num1 * num2;
                    skip();
                    System.out.println("Результат:" + result);
                    break;

                //деление
                case "/":
                    num1 = number1();
                    num2 = number2();
                    result = num1 / num2;
                    skip();
                    System.out.println("Результат:" + result);
                    break;

                //корень
                case "Корень":
                    num1 = number();
                    result = Math.sqrt(num1);
                    skip();
                    System.out.println("Результат:" + result);
                    break;

                //степень
                case "Степень":
                    num1 = number();
                    System.out.print("Укажите степень:");
                    int step = sc.nextInt();
                    result = Math.pow(num1, step);
                    skip();
                    System.out.println("Результат:" + result);
                    break;

                //синус
                case "sin":
                    num1 = angle();
                    if (num1 < 360 && num1 > 0) {
                        num1 = Math.toRadians(num1);
                        result = Math.sin(num1);
                        skip();
                        System.out.println("Результат:" + result);
                    }
                    break;

                //косинус
                case "cos":
                    num1 = angle();
                    if (num1 < 360 && num1 > 0) {
                        num1 = Math.toRadians(num1);
                        result = Math.cos(num1);
                        skip();
                        System.out.println("Результат:" + result);
                    }
                    break;

                //тангенс
                case "tg":
                    num1 = angle();
                    if (num1 < 360 && num1 > 0) {
                        num1 = Math.toRadians(num1);
                        result = Math.tan(num1);
                        skip();
                        System.out.println("Результат:" + result);
                    }
                    break;
                //котангенс
                case "ctg":
                    num1 = angle();
                    if (num1 < 360 && num1 > 0) {
                        num1 = Math.toRadians(num1);
                        result = Math.cos(num1) / Math.sin(num1);
                        System.out.println("Результат:" + result);
                    }
                    break;
                //пи
                case "Пи":
                    result = 3.1415926535;
                    skip();
                    System.out.println("π примерно равно:" + result);
                    break;
                //e
                case "Е":
                    result = 2.7182818284;
                    skip();
                    System.out.println("e примерно равно:" + result);
                    break;

                //выход
                case "Выход":
                    System.out.println("Выход...");
                    exit = 1;
                    break;

                //ошибка
                default:
                    System.out.println("error#@000000000000rrt24542");
                    System.out.println("w45694q37b85gc46&#^cbg)$&^");
                    break;

            }
            if (exit == 1) {
                break;
            }
            System.out.println(" ");
        }
    }

    private static void skip() {
        System.out.println(" ");
    }
}
