package revision;

import java.util.Scanner;
public class nine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the income");
        float inc=sc.nextFloat();

        if(inc<500000){
            System.out.println("your tax is 0");
        }

        else if(inc>=500000 && inc<1000000){
            System.out.println("Your tax is "+(inc*0.2));
        }

        else{
            System.out.println("Your tax is "+(inc*0.3));
        }
    }
}
