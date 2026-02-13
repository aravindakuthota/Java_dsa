public class deleteNode {

    // head must be static because main is static
    public static Node head;

    // Node class
    static class Node {
        String data;
        Node next;

        Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void deleteAtStart() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }



public static void deleteAtIndex(int targetIndex) {

if(targetIndex == 0) {

    //  if (head == null) {
    //         System.out.println("List is empty");
    //         return;
    //     }

    //     head = head.next;
    // }

    deleteAtStart();

}

if(head == null || targetIndex < 0) {
    return;
}

Node temp = head;

for(int i =0; i<targetIndex-1;i++){
    temp = temp.next;
if(temp.next == null){
    System.out.println("Index out of bound");
}

}


temp.next = temp.next.next;


}

    public static void deleteAtEnd() {

    if (head == null) {
            System.out.println("List is empty");
            return;
        }

     
     if (head.next == null) {
            head = null;
            return;
        }



        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next =  null;
    }

    public static void printlist() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        head = new Node("A",
                new Node("B",
                        new Node("C",
                                new Node("D", null))));

        System.out.println("Before Deletion:");
        printlist();

        deleteAtStart();

        System.out.println("After Deletion:");
        printlist();

    deleteAtEnd(); 

    }
}
