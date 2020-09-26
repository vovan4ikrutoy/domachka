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
            System.out.print("1 + ");
            System.out.print("2 - ");
            System.out.println("3 * ");
            System.out.print("4 / ");
            System.out.print("5 √ ");
            System.out.println("6 ^ ");
            System.out.print("7 sin ");
            System.out.print("8 cos ");
            System.out.println("9 tg ");
            System.out.println("10 cot");
            System.out.println("11 Завершить");
            int dey = sc.nextInt();
            double result;
            switch (dey) {

                //сложение
                case 1:
                    num1 = number1();
                    num2 = number2();
                    result = num1 + num2;
                    System.out.println("Результат:" + result);
                    break;

                //вычитание
                case 2:
                    num1 = number1();
                    num2 = number2();
                    result = num1 - num2;
                    System.out.println("Результат:" + result);
                    break;

                //умножение
                case 3:
                    num1 = number1();
                    num2 = number2();
                    result = num1 * num2;
                    System.out.println("Результат:" + result);
                    break;

                //деление
                case 4:
                    num1 = number1();
                    num2 = number2();
                    result = num1 / num2;
                    System.out.println("Результат:" + result);
                    break;

                //корень
                case 5:
                    num1 = number();
                    result = Math.sqrt(num1);
                    System.out.println("Результат:" + result);
                    break;

                //степень
                case 6:
                    num1 = number();
                    System.out.print("Укажите степень:");
                    int step = sc.nextInt();
                    result = Math.pow(num1, step);
                    System.out.println("Результат:" + result);
                    break;

                //синус
                case 7:
                    num1 = angle();
                    if (num1 < 360 && num1 > 0) {
                        num1 = Math.toRadians(num1);
                        result = Math.sin(num1);
                        System.out.println("Результат:" + result);
                    }
                    break;

                //косинус
                case 8:
                    num1 = angle();
                    if (num1 < 360 && num1 > 0) {
                        num1 = Math.toRadians(num1);
                        result = Math.cos(num1);
                        System.out.println("Результат:" + result);
                    }
                    break;

                //тангенс
                case 9:
                    num1 = angle();
                    if (num1 < 360 && num1 > 0) {
                        num1 = Math.toRadians(num1);
                        result = Math.tan(num1);
                        System.out.println("Результат:" + result);
                    }
                    break;
                //котангенс
                case 10:
                    num1 = angle();
                    if (num1 < 360 && num1 > 0) {
                        num1 = Math.toRadians(num1);
                        result = Math.cos(num1) / Math.sin(num1);
                        System.out.println("Результат:" + result);
                    }
                    break;

                //выход
                case 11:
                    System.out.println("Выход...");
                    exit = 1;
                    break;

                //ошибка
                default:
                    System.out.println("error#@000000000000rrt24542");
                    System.out.println("w45694q37b85gc46&#^cbg)$&^");
                    break;

            }
            if (exit == 0) {
                System.out.println(" ");
                System.out.println("Продолжить?");
                System.out.println("1 - Да");
                System.out.println("2 - Нет");
                num1 = sc.nextInt();
                if (num1 == 2) {
                    System.out.println("Выход...");
                    break;
                }
                System.out.println(" ");
            } else {
                break;
            }
        }
    }
}