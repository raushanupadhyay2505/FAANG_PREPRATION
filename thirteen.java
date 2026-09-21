package revision;

import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        
        if(a>0){
            System.out.println(a+" is positive");
        }
        else if(a==0){
            System.out.println("0");
        }
        else{
            System.out.println(a+" is negative");
        }
    }
}
