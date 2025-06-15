public class TwoDSubArraySum {
    public static void main(String[] args) {
        int[][] mat = {{1, 2,3},{4, 5,6}, {7,8,9} };

        int n = mat.length;
        int m = mat[0].length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int topLeft = (i + 1) * (j + 1);
                int bottomRight = (n - i) * (m - j);
                totalSum += mat[i][j] * topLeft * bottomRight;
            }
        }

        System.out.println("Total sum of all submatrices: " + totalSum);
    }
}
