package revision;

import java.util.Scanner;

public class pattern {
    public static void start_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void inverted_star(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void half_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void character_pattern(int n){
        char a='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }

    public static void hollow_rectangle(int n,int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void six(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void seven(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void eight(int n){
        int k=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }

    public static void nine(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void ten(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("# ");
            }

            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("# ");
            }

            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void eleven(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void twelve(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void thirteen(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("# ");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print(" #");
            }
            System.out.println();
        }
    }

    public static void forteen(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+i+"  ");
            }
            System.out.println();
        }
    }

    public static void fifteen(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int n=sc.nextInt();

        // System.out.println("Enter the number of column");
        // int m=sc.nextInt();

        System.out.println("Star Pattern");
        start_pattern(n);
        System.out.println("Inverted Star Pattern");
        inverted_star(n);

        System.out.println("Half_pyramid");
        half_pyramid(n);

        System.out.println("Character Pattern");
        character_pattern(n);

        // System.out.println("Hollow_Rectangle");
        // hollow_rectangle(n,m);

        System.out.println("Inverted & Rotated Half Pyramid");
        six(n);

        System.out.println("NVERTED HALF-PYRAMID");
        seven(n);

        System.out.println("FLOYD'S Triangle pattern");
        eight(n);

        System.out.println("0-1 Triangle pattern");
        nine(n);

        System.out.println("BUTTERFLY pattern");
        ten(n);

        System.out.println("SOLID RHOMBUS pattern");
        eleven(n);

        System.out.println("HOLLOW RHOMBUS pattern");
        twelve(n);

        System.out.println("DIAMOND pattern");
        thirteen(n);

        System.out.println("NUMBER PYRAMID pattern");
        forteen(n);

        System.out.println("PALINDROMIC Pattern");
        fifteen(n);

    }
}
