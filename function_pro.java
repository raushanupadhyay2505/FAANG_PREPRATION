package revision;
import java.util.*;
public class function_pro {
    public static void pro(int a,int b){
        System.out.println(a+"X"+b+"="+(a*b));
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();

        System.out.println("Enter the 2nd number");
        int b=sc.nextInt();

        pro(a,b);
    }
}
