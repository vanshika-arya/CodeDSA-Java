public class IfSorted {
    public static void main(String[] args) {
         int arr[]={2,3,4,5,6};
    boolean sorted= true;
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1])
        sorted=false;
    }
    System.out.println(sorted);
    }
    
}
