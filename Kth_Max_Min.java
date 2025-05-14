import java.util.Scanner;

public class Kth_Max_Min {
    public static void main(String[] args) {
        int arr[]={45,78,56,12,4,23};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of k: ");
        int k=sc.nextInt();
        //sorting of array
        for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
             }
        }
        System.out.println(k+"th min: "+arr[k-1]);
        System.out.println(k+"th max: "+ arr[arr.length-k]);
    }
    
}
