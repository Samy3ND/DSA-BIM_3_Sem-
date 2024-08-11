class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }
}

class Circular {
    private Node head; // head node of the list
    private Node tail; // tail node of the list

    // insert node at beginning of the list
    void insBeg(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
            node.prev = tail;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
            node.next = head;
            head.prev = tail;
        }
    }

    // insert node at end of the list
    void insEnd(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
            node.prev = tail;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
            node.next = head;
            head.prev = tail;
        }
    }

    // insert node in between two nodes
    void insBet(int pos, int data) {
        Node node = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        node.prev = temp;
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
    }

    // delete node from beginning of the list
    void delBeg() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    // delete node from end of the list
    void delEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
    }

    // delete node in between two nodes
    void delBet(int pos) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
        }
    }

    // display the linked list
    void show() {
        if (head == null) {
            System.out.println("List is null");
        } else {
            Node temp = head;
            do {
                System.out.print(" " + temp.data);
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println();
    }
}

public class CircularLL {
    public static void main(String[] args) {
        Circular l = new Circular();
        System.out.println("Insertion at Beginning");
        l.insBeg(5);
        l.insBeg(3);
        l.show();
        System.out.println("Insertion at the End");
        l.insEnd(2);
        l.show();
        System.out.println("Insertion in Between");
        l.insBet(2, 3);
        l.show();
        System.out.println("Deletion at Beginning");
        l.delBeg();
        l.show();
        System.out.println("Deletion at the End");
        l.delEnd();
        l.show();
        System.out.println("Deletion in Between nodes");
        l.delBet(2);
        l.show();
    }
}