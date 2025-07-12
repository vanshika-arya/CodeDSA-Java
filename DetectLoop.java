class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectLoop {
    Node head;

    // Add node at end
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Function to create a loop manually for testing
    public void createLoop() {
        if (head == null) return;

        Node temp = head;
        Node joinNode = null;

        int count = 1;
        while (temp.next != null) {
            if (count == 3) {
                joinNode = temp; // store 3rd node
            }
            temp = temp.next;
            count++;
        }

        temp.next = joinNode; // last node connects to 3rd node
    }

    // Detect loop using Floyd’s Cycle Detection
    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // loop found
            }
        }

        return false;
    }

    public static void main(String[] args) {
        DetectLoop list = new DetectLoop();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.createLoop(); // comment this to test "no loop"

        if (list.hasLoop()) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}
