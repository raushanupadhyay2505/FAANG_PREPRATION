package revision;

import java.util.Scanner;

public class f_palindrom {

    public static void palindom(int n){
        int p=n;
        int s=0;

        while(n!=0){
            s=s*10+(n%10);
            n=n/10;
        }

        if(p==s){
            System.out.println(p+" is palindrom");
            return;
        }
        System.out.println(p+" not is palindrom");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        palindom(n);
    }
}
