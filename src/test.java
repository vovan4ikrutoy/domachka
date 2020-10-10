import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        char[][] a = new char[n][n];
        if (n % 2 != 0) {
            //обработка
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        a[i][j] = '*';
                    } else if (i == n / 2 || j == n / 2) {
                        a[i][j] = '*';
                    } else if (i == n - j - 1) {
                        a[i][j] = '*';
                    } else {
                        a[i][j] = '.';
                    }
                }
            }
            //вывод
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }
}

