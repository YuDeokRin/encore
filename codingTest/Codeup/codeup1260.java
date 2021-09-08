package Codeup;

import java.util.Scanner;

public class codeup1260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        if(a<=b){
            for(int i = a; i<=b; i++){
                if(i%3==0){
                    sum = i + sum;

                }
            }
            System.out.println(sum);
        }
    }
}
