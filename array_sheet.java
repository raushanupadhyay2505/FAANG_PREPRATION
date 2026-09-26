package revision;

import java.util.Scanner;

import function.product;

public class array_sheet {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void stock(int arr[]){
        int b=Integer.MAX_VALUE;
        int max_p=0;

        for(int i=0;i<arr.length;i++){
            if(b>arr[i]){
                b=arr[i];
            }
            else{
                int s=arr[i]-b;
                if(s>max_p){
                    max_p=s;
                }
            }
        }

        System.out.println("The maximum profit is "+max_p);
    }

    public static boolean duplicate(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void sorted_serch(int arr[],int k){
        int s=1;
        int l=0;

        while(s<arr.length){
            if(arr[s]<arr[l]){
                break;
            }
            l++;
            s++;
        }

        if(arr[l]==k){
            System.out.println(k+" is present at index "+l);
            return;
        }
        if(arr[s]==k){
            System.out.println(k+" is present at index "+s);
            return ;
        }

        int st=0;
        int ed=arr.length-1;

        if(k<=arr[l] && k>=arr[st]){
            while(l>st){
                int m=(l+st)/2;

                if(arr[m]==k){
                    System.out.println(k+" is present at index "+m);
                    return;
                }

                else if(arr[m]>k){
                    l=m-1;
                }
                else{
                    s=m+1;
                }
            }
        }
        else{
            int m=(s+ed)/2;
            if(arr[m]==k){
                System.out.println(k+" is present at index "+m);
                return;
            }
            else if(arr[m]<k){
                s=m+1;
            }
            else{
                ed=m-1;
            }
        }

        System.out.println(k+" is not present");
    }

    public static int search(int arr[],int k){
        int s=0;
        int l=arr.length-1;

        while(s<=l){
            int m=(s+l)/2;

            if(arr[m]==k){
                return m;
            }
            
            if(arr[s]<=arr[m]){
                if(arr[s]<=k && arr[m]>k){
                    l=m-1;
                }
                else{
                    s=m+1;
                }
            }
            else{
                if(arr[m]<k && arr[l]>=k){
                    s=m+1;
                }
                else{
                    l=m-1;
                }
            }
        }

        //System.out.println(k+" is not present");
        return -1;
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
        System.out.println("The elements of array are ");
        print(arr);

        //stock(arr);
        //System.out.println(duplicate(arr));
        System.out.println("Enter the serching element");
        int k=sc.nextInt();
        sorted_serch(arr, k);
        //search(arr, k);
    }
}
