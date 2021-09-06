package fundamentals.mainTask;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            System.out.print(random.nextInt() + " ");
        }
    }
}
