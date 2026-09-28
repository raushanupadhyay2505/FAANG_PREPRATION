package revision;

import java.util.Scanner;

public class two_d_array {
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void spiral(int arr[][]){
        int s_r=0;
        int s_c=0;

        int e_r=arr.length-1;
        int e_c=arr[0].length-1;

        while(s_r<=e_r && s_c<=e_c){
            for(int i=s_c;i<=e_c;i++){
                System.out.print(arr[s_r][i]+" ");
            }
            s_r++;

            for(int i=s_r;i<=e_r;i++){
                System.out.print(arr[i][e_c]+" ");
            }
            e_c--;

            for(int i=e_c;i>=s_c;i--){
                if(s_r>e_r){
                    break;
                }
                System.out.print(arr[e_r][i]+" ");
            }
            e_r--;

            for(int i=e_r;i>=s_r;i--){
                if(s_c>e_c){
                    break;
                }
                System.out.print(arr[i][s_c]+" ");
            }
            s_c++;

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns");
        int m=sc.nextInt();

        int arr[][]=new int[n][m];

        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("The elements of array are ");
        print(arr);

        System.out.println("The spiral is ");
        spiral(arr);
    }
}
