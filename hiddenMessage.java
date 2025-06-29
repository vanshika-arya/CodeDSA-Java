public class hiddenMessage {
    public static String extractMessage(char[][] grid) {
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (Character.isUpperCase(grid[i][j]))
                    message.append(grid[i][j]);

        return message.toString();
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'H','e','l','l','o'},
            {'W','o','R','l','d'},
            {'A','b','C','d','!'}
        };
        System.out.println("Hidden Message: " + extractMessage(grid));
    }
}
