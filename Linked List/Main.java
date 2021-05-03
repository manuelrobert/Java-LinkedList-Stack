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

    public void traverse() {
        if(head == null){
            System.out.println("Linked List empty");
        }else{
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
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.traverse();
    }
}
