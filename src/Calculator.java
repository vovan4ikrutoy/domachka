import java.util.Scanner;

public class Calculator {
    public static double number1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите первое число:");
        return sc.nextDouble();
    }
    public static double number2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите второе число:");
        return sc.nextDouble();
    }
    public static double number()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите число:");
        return sc.nextDouble();
    }
    public static void main(String[] args){
        double num1;
        double num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите действие:");
        System.out.println("1 +");
        System.out.println("2 -");
        System.out.println("3 *");
        System.out.println("4 /");
        System.out.println("5 √");
        System.out.println("6 ^");
        int dey = sc.nextInt();
        double result;
        if(dey == 1){
            num1 = number1();
            num2 = number2();
            result = num1 + num2;
            System.out.println("Результат:" + result);
        }else if(dey == 2){
            num1 = number1();
            num2 = number2();
            result = num1 - num2;
            System.out.println("Результат:" + result);
        }else if(dey == 3){
            num1 = number1();
            num2 = number2();
            result = num1 * num2;
            System.out.println("Результат:" + result);
        }else if(dey == 4) {
            num1 = number1();
            num2 = number2();
            result = num1 / num2;
            System.out.println("Результат:" + result);
        }else if(dey == 5){
            num1 = number();
            result = Math.sqrt(num1);
            System.out.println("Результат:" + result);
        }else if(dey == 6) {
            num1 = number();
            System.out.print("Укажите степень:");
            int step = sc.nextInt();
            result = Math.pow(num1,step);
            System.out.println("Результат:" + result);
        }else{
            System.out.println("error#@000000000000rrt24542");
            System.out.println("w45694q37b85gc46&#^cbg)$&^");
        }
    }
}