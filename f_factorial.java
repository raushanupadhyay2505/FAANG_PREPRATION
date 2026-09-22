package revision;
import java.util.*;
public class f_factorial {
    public static void factorial(int n){
        int f=1;

        for(int i=1;i<=n;i++){
            f=f*i;
        }

        System.out.println("The factorail of "+n+" is "+f);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int n=sc.nextInt();

        factorial(n);
    }
}
