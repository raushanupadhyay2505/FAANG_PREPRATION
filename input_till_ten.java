package revision;

import java.util.Scanner;

public class input_till_ten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the number");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
        }while(true);
    }
}
