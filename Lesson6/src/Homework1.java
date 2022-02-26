import java.util.Scanner;
public class Homework1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("a ga son kirit: " +
                    "programma kiritgan soningacha bo\'lgan sonlarni yig\'indisini va " +
                    "ko\'paytmasini xisoblaydi");
            int num1 = in.nextInt();
            int sum=0, kup=1;
            for (int i=1; i<=num1; i++) {
                sum += i;
                kup *= i;
            }
            System.out.println(num1 +" gacha bo\'lgan sonlar yig\'indisi " + sum);
            System.out.println(num1 +" gacha bo\'lgan sonlar ko\'paytmasi " + kup);
        }
    }
