package revision;

import java.util.Scanner;

public class f_average {
    public static void aver(int a,int b,int c){
        System.out.println("The average is "+(a+b+c)/3);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();

        System.out.println("Enter the 2nd number");
        int b=sc.nextInt();

        System.out.println("Enter the 3rd number");
        int c=sc.nextInt();

        aver(a, b, c);
    }
}
