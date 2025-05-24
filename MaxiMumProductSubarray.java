public class MaxiMumProductSubarray {
    public static void main(String[] args) {
        int arr[]={10,-2,34,-78,0,14,11};
        int maxproduct=arr[0];
        for(int i=0;i<arr.length;i++){
            int product=1;
            for(int j=i;j<arr.length;j++){
                product*=arr[j];
                if(product>maxproduct)
                 maxproduct=product;
            }
        }
        System.out.println("Maximum Product subarray: "+maxproduct);

    }
    
}
