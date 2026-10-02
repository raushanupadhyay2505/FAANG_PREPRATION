package revision;

import java.util.Scanner;

public class recursion {

    public static void print(int arr[]){
        System.out.println("The elements of array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void print_dec(int n){
        if(n==0){
            return;
        }

        System.out.print(n+" ");
        print_dec(n-1);
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int f=fact(n-1)*n;
        return f;
    }

    public static int n_sum(int n){
        if(n==0){
            return 0;
        }

        int s=n_sum(n-1)+n;
        return s;
    }

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }

    public static boolean sorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }
        return sorted(arr, i+1);

    }

    public static void binary_search(int arr[],int k,int s,int l){
        if(s>l){
            System.out.println(k+" is not present");
            return;
        }

        int m=(s+l)/2;

        if(arr[m]==k){
            System.out.println(k+" is present at index "+m);
            return;
        }

        if(arr[m]>k){
            binary_search(arr, k, s, m-1);
        }
        else{
            binary_search(arr, k, m+1, l);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the elements of array");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //print_dec(n);

        //System.out.println(fact(n));

        //System.out.println(n_sum(n));
        //System.out.println(fib(n));

        print(arr);
        //System.out.println(sorted(arr, 0));
        System.out.println("enter the serching element");
        int k=sc.nextInt();

        binary_search(arr, k, 0, n-1);
    }
}
