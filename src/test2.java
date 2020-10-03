import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите действие");
        System.out.println("1 Куб");
        System.out.println("2 Параллелепипед");
        System.out.println("3 Сфера");
        System.out.println("4 Конус");
        System.out.println("5 Цилиндр");
        int dey = sc.nextInt();
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        switch (dey) {

            //куб
            case 1:
                num1 = sc.nextDouble();
                System.out.println(Math.pow(num1,3));
                break;

            //Параллелепипед
            case 2:
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                num3 = sc.nextDouble();
                System.out.println(num1 * num2 * num3);
                break;
            //сфера
            case 3:
                num1 = sc.nextDouble();
                System.out.println(1.33333333333 * 3.1415926535 * Math.pow(num1,3));
                break;
            case 4:

                break;
            case 5:

                break;
        }
    }
}
