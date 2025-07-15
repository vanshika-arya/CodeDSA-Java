 import java.util.Scanner;
public class MatrixRotate {
    static void rotateMat(int[][] arr,int n){
       int[][] matrix = new int[n][n];
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
              matrix[j][n-1-i]=arr[i][j];
        }
      }
       for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt(); 
        int[][] arr = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        System.out.println("matrix after rotate by 90 degree");
        rotateMat(arr, n);
    }
}