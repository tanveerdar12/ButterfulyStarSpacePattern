import java.util.Scanner;

public class StarSpacePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=4;
        for(int i=1;i<=n;i++) {
            //LHS stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");

            }
            //for spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            } //RHS stars
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");

            }
            System.out.println(" ");
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*" +" ");
            }
            for(int j=1; j<= 2*(n-i);j++){
                System.out.print(" ");
            } for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+ " ");
            }
            System.out.println(" ");

        }
    }
}
