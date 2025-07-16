public class StrassenMatrixMultiplication {
    public static void main(String[] args) {
        // Input matrices (2x2)
        int[][] A = { {1, 2}, {3, 4} };
        int[][] B = { {5, 6}, {7, 8} };

        // Strassen's Multiplication
        int[][] C = strassenMultiply(A, B);

        // Print the result
        System.out.println("Product Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] strassenMultiply(int[][] A, int[][] B) {
        int a = A[0][0];
        int b = A[0][1];
        int c = A[1][0];
        int d = A[1][1];

        int e = B[0][0];
        int f = B[0][1];
        int g = B[1][0];
        int h = B[1][1];

        // 7 products
        int p1 = a * (f - h);
        int p2 = (a + b) * h;
        int p3 = (c + d) * e;
        int p4 = d * (g - e);
        int p5 = (a + d) * (e + h);
        int p6 = (b - d) * (g + h);
        int p7 = (a - c) * (e + f);

        // Result matrix
        int[][] C = new int[2][2];
        C[0][0] = p5 + p4 - p2 + p6;
        C[0][1] = p1 + p2;
        C[1][0] = p3 + p4;
        C[1][1] = p1 + p5 - p3 - p7;

        return C;
    }
}