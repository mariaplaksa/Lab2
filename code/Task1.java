import java.io.PrintStream;
import java.util.Scanner;
public class Task1 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args)  {
        int a0 = in.nextInt();
        int n = in.nextInt();
        int x = a0 * (-3);
        out.print(x + " ");
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                x = x - 2;
                out.print(x + " ");
            }
            else{
                x = x * (-3);
                out.print(x + " ");
            }
        }
    }
}
