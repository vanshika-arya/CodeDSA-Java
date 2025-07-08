public class hamilton {
    static int V = 4; // Number of vertices
    static int[][] graph = {
        {0, 1, 1, 1},
        {1, 0, 1, 0},
        {1, 1, 0, 1},
        {1, 0, 1, 0}
    };
    static int[] path = new int[V];

    public static void main(String[] args) {
        // Start from vertex 0
        path[0] = 0;

        // Initialize remaining path positions as -1
        for (int i = 1; i < V; i++) {
            path[i] = -1;
        }

        if (solve(1)) {
            printPath();
        } else {
            System.out.println("No Hamiltonian Cycle found.");
        }
    }

    static boolean solve(int pos) {
        // Base case: all vertices are included
        if (pos == V) {
            // Check if last vertex is connected to the first
            return graph[path[pos - 1]][path[0]] == 1;
        }

        // Try each vertex as the next step
        for (int v = 1; v < V; v++) {
            if (isSafe(v, pos)) {
                path[pos] = v;

                if (solve(pos + 1))
                    return true;

                // Backtrack
                path[pos] = -1;
            }
        }

        return false;
    }

    static boolean isSafe(int v, int pos) {
        // Check if this vertex is connected to the previous one
        if (graph[path[pos - 1]][v] == 0)
            return false;

        // Check if it is already in the path
        for (int i = 0; i < pos; i++) {
            if (path[i] == v)
                return false;
        }

        return true;
    }

    static void printPath() {
        System.out.print("Hamiltonian Cycle: ");
        for (int i = 0; i < V; i++) {
            System.out.print(path[i] + " ");
        }
        System.out.println(path[0]); // to complete the cycle
    }
    
}
