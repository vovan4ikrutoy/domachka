import java.util.Scanner;

public class piska {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите секунды:");
        int seconds = sc.nextInt();
        int sec1 = seconds % 10;
        int sec10 = seconds % 60 / 10;
        int min1 = seconds / 60 % 10;
        int min10 = min1 / 10;
        int hour = seconds / 3600 % 24;
        System.out.print("Время:");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(min10);
        System.out.print(min1);
        System.out.print(":");
        System.out.print(sec10);
        System.out.print(sec1);
    }
}