package revision;

import java.util.Scanner;

public class tweleve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter the symbol for add substract multiply and divide");
        char c=sc.next().charAt(0);

        switch(c){
            case '+' : System.out.println(a+"+"+b+"="+(a+b));
            break;

            case '-': System.out.println(a+"-"+b+"="+(a-b));
            break;

            case '*': System.out.println(a+"*"+b+"="+(a*b));
            break;

            default: System.out.println(a+"/"+b+"="+(a/b));
        }
    }
}
