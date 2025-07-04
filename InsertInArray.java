
    public class InsertInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        int[] newArr = new int[n + 1];

        int insertElement = 25;
        int position = 2;

        // Copy elements before the position
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element
        newArr[position] = insertElement;

        // Copy the remaining elements
        for (int i = position; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print new array
        System.out.print("New Array: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}


