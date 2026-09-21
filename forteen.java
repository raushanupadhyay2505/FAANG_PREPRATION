package revision;

import java.util.Scanner;

public class forteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature");
        float f=sc.nextFloat();

        if(f>100){
            System.out.println("You have fever");
        }
        else{
            System.out.println("Chill you don't have fever");
        }
    }
}
