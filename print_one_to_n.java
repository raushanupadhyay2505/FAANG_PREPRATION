package revision;

import java.util.Scanner;

public class print_one_to_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        int i=1;

        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
    }
}
