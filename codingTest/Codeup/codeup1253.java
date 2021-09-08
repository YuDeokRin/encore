package Codeup;

import java.util.Scanner;

public class codeup1253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        if(a < b){
            while(a <= b){

                System.out.println(a);
                a++;

            }
        }else if(b < a){
            while(b<=a){
                System.out.println(b);
                b++;
            }

        }else {
            System.out.println(a);
        }
    }
}
