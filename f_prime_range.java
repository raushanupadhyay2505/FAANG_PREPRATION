package revision;
import java.util.*;
public class f_prime_range {

    public static void print_prime(int n){
        for(int i=1;i<=n;i++){
            int k=0;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    k++;
                    break;
                }
            }
            if(k==0 && i!=1){
                System.out.print(i+" ");
            }
        }
    }

    public static void prime(int n){
        if(n<=1){
            System.out.println(n+" is not prime");
            return;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(n+" is not prime");
                return;
            }
        }

        System.out.println(n+" is prime");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int n=sc.nextInt();

        print_prime(n);
        System.out.println();
        prime(n);
    }
}
