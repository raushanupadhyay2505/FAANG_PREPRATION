package revision;
import java.util.*;
public class sum_of_first_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int n=sc.nextInt();

        int s=0;
        for(int i=1;i<=n;i++){
            s=s+i;
        }

        System.out.println("The sum of 1st "+n+" number is "+s);
    }
}
