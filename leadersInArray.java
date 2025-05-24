public class leadersInArray {
    public static void main(String[] args) {
        int a[]={10,9,12,3,14,2,1};
        int n=a.length;
        System.out.println("Leaders in array: ");
        for(int i=0;i<n;i++){
            boolean isleader=true;
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                     isleader= false;
                     break;
                }
            }
            if(isleader){
                System.out.println(a[i]+ " ");
            }
        }

    }
    
}
