import java.util.Scanner;
public class yulduzcha {

    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("Yulduzchalarni kamayishi: Son kirit");
            int a= in.nextInt();
            int i, j;
            for (j=0; j<a; j++) {
                for (i=j; i+1<a; i++){
                    System.out.print(" *");
                }
                System.out.println(" *");
            }
        }
    }