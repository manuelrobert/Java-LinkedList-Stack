class Node {
    public int data;
    public Node next;
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node n = new Node();
        n.data = data;
        n.next = null;

        if (head == null) {
            head = n;
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = n;
        }
    }

    public void insertAt(int index, int data) {
        Node n = new Node();
        n.data = data;
        n.next = null;
        if (index == 0) {
            n.next = head;
            head = n;
        } else {
            Node node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            n.next = node.next;
            node.next = n;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            Node t = node.next;
            node.next = t.next;
            t = null;
        }
    }

    public void traverse() {
        if (head == null) {
            System.out.println("Linked List empty");
        } else {
            Node node = head;
            while (node.next != null) {
                System.out.println(node.data);
                node = node.next;
            }
            System.out.println(node.data);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.traverse();
        l.insert(30);
        l.insert(40);
        l.insert(50);
        l.traverse();
        l.insertAt(0, 10);
        l.traverse();
        l.insertAt(1, 20);
        l.traverse();
        l.deleteAt(0);
        l.traverse();
        l.deleteAt(3);
        l.traverse();
    }
}