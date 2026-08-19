import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        System.out.print("Enter the elements: ");
        for(int i=0; i<=a.length-1; i++){
            a[i] = scan.nextInt();
        }
        System.out.print("Elements of the array: ");
        for(int i=0; i<=a.length-1; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for(int i=0; i<=a.length-1; i++){
            sum += a[i];
        }
        System.out.print("Total: " + sum);

        scan.close();
    }    
}
