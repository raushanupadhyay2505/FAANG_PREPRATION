package revision;

import java.util.Scanner;

public class check_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;

        if(n<=1){
            System.out.println(n+" is not prime");
            k++;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    System.out.println(n+" is not prime");
                    k++;
                    break;
                }
            }
        }

        if(k==0){
            System.out.println(n+" is prime");
        }
    }
}
