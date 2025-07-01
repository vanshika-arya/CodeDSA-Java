public class ElevatorMovement {
    public static void simulateElevator(int[] stops) {
        int current = 1; 

        for (int stop : stops) {
            if (stop > current) {
                for (int i = current + 1; i <= stop; i++)
                    System.out.println("Floor " + i);
            } else if (stop < current) {
                for (int i = current - 1; i >= stop; i--)
                    System.out.println("Floor " + i);
            }
            current = stop;
        }
    }

    public static void main(String[] args) {
        int[] stops = {2, 5, 3};
        simulateElevator(stops);
    }
}
