import java.io.PrintStream;
import java.util.Scanner;
public class Task4 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int start = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1] + 1) {
                if (start == i - 1) {
                    out.print(a[start]);
                    out.print(" ");
                } 
                else {
                    out.print(a[start] + "-" + a[i - 1]);
                    out.print(" ");
                }
                start = i;
            }
        }
        if (start == n - 1) {
            System.out.print(a[start]);
        } 
        else {
            System.out.print(a[start] + "-" + a[n - 1]);
        }
    }
}
