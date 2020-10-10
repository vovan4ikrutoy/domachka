import java.util.Scanner;

public class test2 {

    public static int gig(int X) {
        int num = 0;
        for(int i = 100; i < X; i++){
            if((i / 100 + i / 10 % 10 + i % 10) % 13 == 0){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        System.out.println(gig(X));
    }
}
