package Lesson4;

import java.util.Scanner;

public class Logics {
    public static void main(String []args){
        //
        Scanner scanner = new Scanner(System.in);
        // Scanner int ga :
        System.out.print("Enter num1 : " );
        int num1 = scanner.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = scanner.nextInt();

        System.out.println("Enter num3 : ");
        int num3 = scanner.nextInt();

//        int primeterValue = 2 * (num1 + num2);
//
//        System.out.println("Result : " +  primeterValue);
        System.out.println("-----------------------------------");


        // if else ---> shart operatori
//        if (num1> num2){
//            System.out.println("Num1 katta num2  " + num1 + " > " + num2);
//        } else {
//            System.out.println( num1 + " < " + num2);
//        }

        // ------- Logic --- Boolean type -----
        if (num1<=0) {
            System.out.println("num1 is " + false);
        }  else System.out.println("num1 is " + true );
        if (num2<=0) System.out.println("num2 is " + false);
             else System.out.println("num2 is " + true);
        if (num3<=0) System.out.println("num3 is " + false);
            else System.out.println("num3 is " + true);

        //------ Max ------------

        int max = num1;

        if (max<num2){
            max = num2;
        } else if (max<num3){
            max = num3;
        }

        System.out.println("Max : " + max);
        //----------------------------

        // ------ Min -------
        int min = num1;

        if (min>num2){
            min = num2;
        } else if (min>num3){
            min = num3;
        }

        System.out.println("Min : " + min);

        //-----------

        // ------- Arifmetik process ---
        float sum = (num1 + num2 + num3)/3;
        System.out.println("Arifmetik : " + sum);

        // ---- Sortirovka
        // 1. Ascending


        // 2. Descending



        // -----------
        scanner.close();
    }
}

/**
 *
 * InputMismatchException:
 * 1. IDE
 * 2. Enter number?
 * 3. Scanner ?
 *
 *
 * */
