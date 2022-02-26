import java.util.Scanner;

public class HomeSort {
    public static void main(String[] args) {
        System.out.println("3 ta son kirit kattasi va kichkinasini topadi");
        Scanner in = new Scanner(System.in);
        int max, mid, min;
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        if (max < c) {
            max = c;
            System.out.println(max);
            System.out.println(min);
        }
    }
}