package Codeup;

import java.util.Scanner;

public class codeup1253_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        if(a < b){
           for(int i=a; i<=b; i++){
               System.out.print(i+" ");
            }
        }else if(b < a){
            for(int i=b; i<=a; i++){
                System.out.print(i+ " ");
            }
        }else {

            System.out.println(a+ " ");
        }


    }
}
