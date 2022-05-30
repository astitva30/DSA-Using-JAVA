import java.util.Scanner;

public class LinearSearch {

    public static int Search(int array[],int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
            
        }
        return -1;
    }
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
            System.out.println();

            int index=Search(arr,33);
            System.out.println(index+1);
    }
}
