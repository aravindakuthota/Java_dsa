public class BasicLL {

    static Node head;

    // Node class
    static class Node {
        String data;
        Node next;

        Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // Print linked list
    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    // Length of list
    public static int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Search element
    public static int search(String key) {
        int index = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(key)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    // Update node at index
    public static void updateNode(int index, String newData) {
        Node temp = head;
        int i = 0;

        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        temp.data = newData;
    }

    // Add at end
    public static void addAtEnd(String newData) {
        if (head == null) {
            head = new Node(newData, null);
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(newData, null);
    }

    // Add at start
    public static void addAtStart(String newData) {
        head = new Node(newData, head);
    }

    // Add at middle
    public static void addAtMiddle(String newData, int index) {

        if (index == 0) {
            addAtStart(newData);
            return;
        }

        Node temp = head;
        int i = 0;

        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        temp.next = new Node(newData, temp.next);
    }

    // MAIN
    public static void main(String[] args) {

        // Create list A -> B -> C -> D
        head = new Node("A",
                new Node("B",
                        new Node("C",
                                new Node("D", null))));

        System.out.println("Initial linked list:");
        printList();

        System.out.println("\nLength: " + length());
        System.out.println("Index of C: " + search("C"));

        System.out.println("\nUpdating index 0 to X");
        updateNode(0, "X");
        printList();

        System.out.println("\nAdding E at end");
        addAtEnd("E");
        printList();

        System.out.println("\nAdding F at start");
        addAtStart("F");
        printList();

        System.out.println("\nAdding Y at index 2");
        addAtMiddle("Y", 2);
        printList();
    }
}
