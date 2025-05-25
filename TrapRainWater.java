public class TrapRainWater {
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        int n= height.length;
        int water=0;
        for(int i=1;i<n-1; i++){
            int leftMax=height[i];
            for(int j=0;j<i;j++){
                if(leftMax<height[j]){
                    leftMax=height[j];
                }
            }
            int rightMax=height[i];
            for(int j=i+1;j<n;j++){
                if(height[j]>rightMax)
                rightMax=height[j];
            }
            int minHeight;
            if(leftMax<rightMax)
            minHeight=leftMax;
            else
            minHeight=rightMax;
            if(minHeight>height[i])
            water+=minHeight-height[i];
        }
        System.out.println("Trapped Water: "+water);
    }
    
}
