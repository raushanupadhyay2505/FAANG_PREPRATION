package revision;

import java.util.Scanner;

public class sorting {
    public static void print(int arr[]){
        System.out.println("The elements of array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int a=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[a]>arr[j]){
                    a=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[a];
            arr[a]=temp;
        }
    }

    public static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int a=arr[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(arr[j]>a){
                    arr[j+1]=arr[j];
                }
                else{
                    break;
                }
            }
            j++;
            arr[j]=a;
        }
    }

    public static void count_sort(int arr[]){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        int arr1[]=new int[max+1];
        int c=0;

        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            arr1[a]=arr1[a]+1;
        }

        for(int i=0;i<=max;i++){
            while(arr1[i]>0){
                arr[c]=i;
                c++;
                arr1[i]--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        print(arr);
        //bubble_sort(arr);
        //selection_sort(arr);
        insertion_sort(arr);
        print(arr);
    }
}
