import java.util.Scanner;

public class treugolnik {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите координаты точки A");
        double x1 = sc.nextInt();
        double y1 = sc.nextInt();
        System.out.println("Укажите координаты точки B");
        double x2 = sc.nextInt();
        double y2 = sc.nextInt();
        System.out.println("Укажите координаты точки C");
        double x3 = sc.nextInt();
        double y3 = sc.nextInt();
        double a = Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));
        System.out.println("Результаты:");
        System.out.print("Длина стороны ab ");
        System.out.printf("%.3f", a);
        double b = Math.sqrt(Math.pow(x2 - x3,2) + Math.pow(y2 - y3,2));
        System.out.println();
        System.out.print("Длина стороны bc ");
        System.out.printf("%.3f", b);
        double c = Math.sqrt(Math.pow(x3 - x1,2) + Math.pow(y3 - y1,2));
        System.out.println();
        System.out.print("Длина стороны ca ");
        System.out.printf("%.3f", c);
        double P = a + b + c;
        System.out.println();
        System.out.print("Периметр треугольника ABC ");
        System.out.printf("%.3f", P);
        double p = P * 0.5;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println();
        System.out.print("Площадь треугольника ABC ");
        System.out.printf("%.3f", S);
    }
}