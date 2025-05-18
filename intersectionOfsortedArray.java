public class intersectionOfsortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 4, 6, 8};

        int i = 0, j = 0;

        System.out.print("Intersection of arrays: ");
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}

    

