public class Union_and_Intersection {
    public static void main(String[] args) {
        int arr1[]={12,56,78,54,6};
        int arr2[]={45,12,65,6,78};
        System.out.println("Intersection");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }

            }
        }
        System.out.println("Union");
         for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
            if(arr1[i]!=arr2[i])
            System.out.print(arr2[i]+" ");
         }
        
        
    }
    
}
