import java.util.Hashtable;
import java.util.Map;

public class Hello {
    public static void main(String[] args) {
        Hello obj = new Hello();

        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.traverse();

        obj.deleteNode(3);
        System.out.println("Deleting the data");
        obj.traverse();
    }

    Node head;

    void insert(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    void traverse() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    Node deleteNode(int data) {
        Node n = head;

        if (n.data == data) {
            return head.next;
        }

        while (n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
            }
            n = n.next;
        }

        return head;
    }
}

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
    }
}

