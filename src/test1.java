import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int res = 0;
        for (int i = 0; i < 3; i++) {
            a = sc.nextInt();
            if (a % 2 == 0) {
                res++;
                System.out.println("Четное");
            } else {
                System.out.println("Нечётное");
            }
        }
        System.out.println("");
        if (res >= 2){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println("Четных цифр:" + res);
    }
}