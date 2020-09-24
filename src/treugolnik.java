import java.util.Scanner;

public class treugolnik {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите координаты первой вершины");
        double x1 = sc.nextInt();
        double y1 = sc.nextInt();
        System.out.println("Укажите координаты второй вершины");
        double x2 = sc.nextInt();
        double y2 = sc.nextInt();
        System.out.println("Укажите координаты третей вершины");
        double x3 = sc.nextInt();
        double y3 = sc.nextInt();
        double a = Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));
        double b = Math.sqrt(Math.pow(x2 - x3,2) + Math.pow(y2 - y3,2));
        double c = Math.sqrt(Math.pow(x3 - x1,2) + Math.pow(y3 - y1,2));
        double p = (a + b + c) * 0.5;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println();
        System.out.print("Длинна первой стороны - ");
        System.out.printf("%.3f", a);
        System.out.println();
        System.out.print("Длинна второй стороны - ");
        System.out.printf("%.3f", b);
        System.out.println();
        System.out.print("Длинна третей стороны - ");
        System.out.printf("%.3f", c);
        System.out.println();
        System.out.print("Площадь равна - ");
        System.out.printf("%.3f", S);
    }
}