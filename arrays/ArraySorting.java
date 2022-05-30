import java.util.Scanner;
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[6];

        
            for(int j=0;j<arr.length;j++){
                System.out.print("Enter Element "+(j+1)+":");
                arr[j]= sc.nextInt();
            }

        
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+"\t");
            }

        Arrays.sort(arr);   //SORTING AN ARRAY

            System.out.print("\n");

        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+"\t");
        }

    }
}
