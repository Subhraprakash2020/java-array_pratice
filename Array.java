import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int n,i;
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("How many element entered\n");
        n = sc.nextInt();
        System.out.println("Enter the element");
        for( i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(" array is");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
