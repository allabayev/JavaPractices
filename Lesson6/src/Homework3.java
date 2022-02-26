import java.util.Scanner;
public class Homework3 {
        public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
            System.out.println("Bitta son kirit: O\'sha songacha bo\'lgan juft sonlar yig\'indisini xisoblaydi");
            System.out.println("va 3 ga bo\'linadigan sonlar yig\'indisini xisoblaydi");
            int num= in.nextInt();
            int sumJuft=0;
            int sum3Qoldiq=0;
            for (int i=1; i<=num; i++) {
                if (i % 2 == 0) {
                    sumJuft += i;
                }
            }
            System.out.println("Juft sonlar yi\'indisi " + sumJuft);

            for (int j=1; j<=num; j++) {
                if (j % 3 == 0) {
                    sum3Qoldiq+=j;
                }
            }
            System.out.println("3 ga bo\'linadigan sonlar yi\'indisi " + sum3Qoldiq);
        }
    }