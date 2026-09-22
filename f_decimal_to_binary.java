package revision;

import java.util.Scanner;

public class f_decimal_to_binary {

    public static void convert(int n){
        int a=0;
        int i=0;

        while(n!=0){
            int r=n%2;
            a=a+(int)(r*Math.pow(10,i));
            i++;
            n=n/2;
        }

        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        convert(n);
    }
}
