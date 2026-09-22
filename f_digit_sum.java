package revision;

import java.util.Scanner;

public class f_digit_sum {
    public static void sum(int n){
        int s=0;

        while(n!=0){
            s=s+(n%10);
            n=n/10;
        }

        System.out.println("The sum is "+s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        sum(n);
    }
}
