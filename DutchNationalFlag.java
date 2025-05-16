public class DutchNationalFlag {
    public static void main(String[] args) {
       int[] arr = {2, 0, 1, 2, 0, 1};

        int count0 = 0, count1 = 0, count2 = 0;

        //  Count how many 0s, 1s, and 2s
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count0++;
            else if (arr[i] == 1) count1++;
            else count2++;
        }

        //  Overwrite the array
        for (int i = 0; i < count0; i++) arr[i] = 0;
        for (int i = count0; i < count0 + count1; i++) arr[i] = 1;
        for (int i = count0 + count1; i < arr.length; i++) arr[i] = 2;
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
    
    

