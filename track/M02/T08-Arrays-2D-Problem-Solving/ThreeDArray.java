import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a[][][] = new int[3][3][5];

        System.out.println("Enter array elements:");

        for(int  i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                for(int k=0; k<a[i][j].length; k++){
                    a[i][j][k] = scan.nextInt();
                }
            }
        }

        for(int  i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                for(int k=0; k<a[i][j].length; k++){
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        scan.close();
    }
}
