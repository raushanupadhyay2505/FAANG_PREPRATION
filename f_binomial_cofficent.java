package revision;

import java.util.Scanner;

public class f_binomial_cofficent {

    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }

        return f;
    }

    public static void binomial(int n,int r){
        int ans= fact(n)/(fact(n-r)*fact(r));
        System.out.println(n+"C"+r+" = "+ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n=sc.nextInt();

        System.out.println("Enter the value of r");
        int r=sc.nextInt();

        binomial(n, r);
    }
}
