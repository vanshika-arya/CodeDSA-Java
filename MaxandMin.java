import java.util.Scanner;

public class MaxandMin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter elements of an array: ");
        for(int i=0;i<n; i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum element: "+ max);
        System.out.println("Minimum element "+ min);
    }
}