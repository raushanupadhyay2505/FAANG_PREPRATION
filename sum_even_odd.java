package revision;

import java.util.Scanner;

public class sum_even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int s_e=0;
        int s_o=0;

        for(int i=1;i<=n;i++){
            if(i%2==0){
                s_e +=i;
            }
            else{
                s_o +=i;
            }
        }

        System.out.println("The sum of even is "+s_e);
        System.out.println("The sum of odd is "+s_o);
    }
}
