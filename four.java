package revision;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter the 3rd number");
        int c=sc.nextInt();

        float avg=(a+b+c)/(3.0f);

        System.out.println("The average is "+avg);
    }
}
