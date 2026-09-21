package revision;

import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");

        int n=sc.nextInt();
        String res=n>33?"Pass":"fail";

        System.out.println(res);
    }
}
