import java.util.Scanner;

public class test {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x < 1000 && x >= 100 && x % 5 == 0){
        System.out.println("yes");
    } else {
        System.out.println("no");
    }
}
}
