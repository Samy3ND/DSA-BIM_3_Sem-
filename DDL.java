class Node {
    Node prev;
    int info;
    Node next;
}

class DLL {
    Node head = null;
    Node tail = null;

    void display() {
        if (head == null) {
            System.out.println("DLL is empty.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    void search(int key) {
        if (head == null) {
            System.out.println("Empty List");
        } else {
            Node n = head;
            int flag = 0, counter = 1;
            while (n != null) {
                if (n.info == key) {
                    System.out.println("Found at: " + counter);
                    flag++;
                    break;
                }
                counter++;
                n = n.next;
            }
            if (flag == 0)
                System.out.println("Not Found");
        }
    }

    void add_head(int n) {
        Node node = new Node();
        node.info = n;
        if (head == null) {
            head = tail = node;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
        }
    }

    void add_tail(int n) {
        Node node = new Node();
        node.info = n;
        if (head == null) {
            head = tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }

    void add_pos(int n, int pos) {
        Node node = new Node();
        node.info = n;

        if (head == null) {
            System.out.println("DLL is empty.");
        } else {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
                if (temp == null) {
                    System.out.println("Given position is out of range of DLL.");
                    return;
                }
            }
            if (temp.next != null) {
                temp.next.prev = node;
            }
            node.next = temp.next;
            temp.next = node;
            node.prev = temp;
        }
    }

    void del_head() {
        if (head == null)
            System.out.print("Empty List");
        else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        }
    }

    void del_tail() {
        if (head == null)
            System.out.print("Empty List");
        else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
        }
    }

    void del_pos(int p) {
        if (head == null)
            System.out.print("Empty List");
        else if (head == tail) {
            head = tail = null;
        } else {
            Node n = head;
            for (int i = 1; i < p - 1; i++) {
                n = n.next;
            }
            if (n.next != null) {
                n.next.prev = null;
                n.next = n.next.next;
                if (n.next != null) {
                    n.next.prev = n;
                }
            }
        }
    }
}

class DDL {
    public static void main(String[] args) {
        DLL d = new DLL();
        d.add_head(5);
        d.add_tail(6);
        d.add_head(7);
        d.add_pos(9, 1);
        d.display();
        d.search(5);
        d.display();
        d.del_head();
        d.display();
        d.del_tail();
        d.display();
        d.del_pos(1);
        d.display();
    }
}
