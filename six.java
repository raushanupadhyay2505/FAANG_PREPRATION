package revision;


import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of pen");
        float p=sc.nextFloat();

        System.out.println("Enter the price of pencile");
        float pencile=sc.nextFloat();

        System.out.println("Enter the price of eraser");
        float e=sc.nextFloat();

        double total=p+pencile+e;

        System.out.println("The total price is "+total);

        double tax=total+(0.18*total);

        System.out.println("The total price after tax is "+tax);
    }
}
