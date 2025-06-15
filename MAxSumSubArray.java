public class MAxSumSubArray {
    public static void main(String[] args) {
         int[][] mat = {
            {1, 2, -1},
            {-3, 4, 5},
            {2, -6, 1}
        };
        int n = mat.length;
        int m = mat[0].length;
        int maxSum = mat [0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int p = i; p < n; p++) {
                    for (int q = j; q < m; q++) {
                        int sum = 0;
                        for (int x = i; x <= p; x++) {
                            for (int y = j; y <= q; y++) {
                                sum += mat[x][y];
                            }
                        }
                        if (sum > maxSum) {
                            maxSum = sum;
                        }
                    }
                }
            }
        }

        System.out.println("Maximum submatrix sum: " + maxSum);
    }
    
}
