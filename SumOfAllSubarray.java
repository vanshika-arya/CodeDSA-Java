public class SumOfAllSubarray {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int totalsum=0;
        for(int i=0; i<arr.length; i++){
            int currentsum=0;
            for(int j=0; j<arr.length; j++){
                currentsum+=arr[j];
                totalsum+=currentsum;
            }
        }
        System.out.println(totalsum);
    }
    
}
