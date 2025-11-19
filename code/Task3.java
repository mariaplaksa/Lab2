import java.io.PrintStream;
import java.util.Scanner;
public class Task3 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        int n = in.nextInt();
        int c = 0;
        int x = n;
        while (x > 0) {
            if ((x % 10) % 2 == 1) {
                c++;
            }
            x /= 10;
        }
        out.println(c);
    }
}
