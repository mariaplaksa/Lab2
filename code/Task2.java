import java.io.PrintStream;
import java.util.Scanner;
public class Task2 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int bestlenght = 1;
        int beststart = 0;
        int bestalt = 1;
        int start = 0;
        int lenght = 1;
        int alt = 1;
        for (int i = 1; i <= n; i++) {
            if ((i < n) && (Math.abs(a[i]) == Math.abs(a[start]))) {
                lenght++;
                if (alt == lenght - 1) {
                    if (a[i - 1] != 0 && a[i] != 0 && a[i - 1] * a[i] < 0) {
                        alt++;
                    }
                }
            } else {
                if (lenght > bestlenght ||
                        (lenght == bestlenght && alt > bestalt)) {
                    bestlenght = lenght;
                    beststart = start;
                    bestalt = alt;
                }
                if (i < n) {
                    start = i;
                    lenght = 1;
                    alt = 1;
                }
            }
        }
        out.println(bestlenght);
        out.println(beststart);
    }
}
