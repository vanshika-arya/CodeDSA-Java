

public class NumOccurrence {
    public static void main(String[] args) {
        int arr[]={1,3,4,1,2,3,2,0,2};
        int target=2;
        int count=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]==target)
           count++;
        }
        System.out.println(target+": "+count+" times");
    }
    
}
