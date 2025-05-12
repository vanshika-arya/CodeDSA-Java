import java.util.Scanner;

public class ReverseinPlaceArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0,k=n-1;
        while(j<k){
            int temp=arr[j];
            arr[j]=arr[k];
            arr[k]=temp;
            j++;
            k--;
        }
        System.out.println("Reverse of Array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}
