public class RotatedOrNot {
    public static void main(String[] args) {
        int[] arr = {30,40,50,10,20};
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Array is sorted");
        } else if (count == 1) {
            System.out.println("Array is rotated");
        } else {
            System.out.println("Array is not sorted and not rotated");
        }
    }
    
}
