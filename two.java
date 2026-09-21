package revision;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a=sc.nextInt();

        System.out.println("Enter the 2nd number");
        int b=sc.nextInt();

        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"X"+b+"="+(a*b));
    }
}
