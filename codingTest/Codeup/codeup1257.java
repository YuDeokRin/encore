package Codeup;

import java.util.Scanner;

public class codeup1257 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

    if(a<=b){
        for(int i= a; i<=b; i++){
            if(a%2==1){
                System.out.println(a);

            }
            a++;
        }
    }




    }
}
