import java.net.SocketOption;
import java.util.Scanner;
public class Integer {
    public static void main(String[] arg) {
        int[][] a = new int[3][];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                a[i][j] = sc.nextInt();
            }
        }
    }
}