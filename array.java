package revision;

import java.util.Scanner;

public class array {
    public static void print(int arr[]){
        System.out.println("The elements of array are ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void leaner_serch(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println(k+" is present at index "+i);
                return;
            }
        }

        System.out.println(k+" is not present");
    }

    public static void largest(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }

        System.out.println("The maximum is "+max);
        System.out.println("The minimum is "+min);
    }

    public static void binary_serch(int arr[],int k){
        int s=0;
        int l=arr.length;

        while(s<=l){
            int m=(s+l)/2;

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

        System.out.println(k+" is not present");
    }

    public static void reverse(int arr[]){
        int s=0;
        int l=arr.length-1;

        while(s<l){
            int temp=arr[s];
            arr[s]=arr[l];
            arr[l]=temp;
            s++;
            l--;
        }
    }

    public static void pair(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }

    public static void sub_arr(int arr[]){
        for(int i=0;i<=arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("(");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print(")");
            }
            System.out.println();
        }
    }

    public  static void sum_sub_arr(int arr[]){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int s=0;
            for(int j=i;j<arr.length;j++){
                s=s+arr[j];
                if(max<s){
                    max=s;
                }
            }
        }
        System.out.println("The sum is "+max);
    }

    public static void prifix_sum(int arr[]){
        int p[]=new int[arr.length];
        p[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            p[i]=p[i-1]+arr[i];
        }

        int max=Integer.MIN_VALUE;
        //print(p);

        for(int i=0;i<p.length;i++){
            for(int j=i;j<p.length;j++){
                int s;
                if(i==0){
                    s=p[j];
                }
                else{
                    s=p[j]-p[i-1];
                }

                if(max<s){
                    max=s;
                }
            }
        }

        System.out.println("The maximum sum is "+max);
    }

    public static void kiddans(int arr[]){
        int max=Integer.MIN_VALUE;

        int c=0;

        for(int i=0;i<arr.length;i++){
            c=c+arr[i];
            if(max<c){
                max=c;
            }
            if(c<0){
                c=0;
            }
        }

        System.out.println("The maximum sum is "+max);
    }

    public static void trapping_water(int arr[]){
        int l_arr[]=new int[arr.length];
        l_arr[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            l_arr[i]=Math.max(l_arr[i-1],arr[i]);
        }

        int r_arr[]=new int[arr.length];
        r_arr[arr.length-1]=arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--){
            r_arr[i]=Math.max(r_arr[i+1], arr[i]);
        }

        int total=0;

        for(int i=0;i<arr.length;i++){
            int h=Math.min(l_arr[i],r_arr[i]);

            total=total+(h-arr[i]);
        }

        System.out.println("The total water is "+total);
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
        System.out.println();
        // System.out.println("Enter the serching element");
        // int k=sc.nextInt();
        // leaner_serch(arr, k);

        //largest(arr);

        //binary_serch(arr, k);

        // reverse(arr);
        // print(arr);
        //pair(arr);
        //sub_arr(arr);
        //sum_sub_arr(arr);
        //prifix_sum(arr);

        //kiddans(arr);
        trapping_water(arr);
    }
}
