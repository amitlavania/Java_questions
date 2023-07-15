import java.util.*;

public class Addf {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step 1 create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // newnode next =head
        newNode.next = head;
        // newnode =head
        head = newNode;

    }

    public void addLast(int data) {

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = null;

        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removefirst() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
        
    }

    public int removel() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        Node prev = head;

        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Addf ll = new Addf();
        ll.addFirst(1);

        ll.addFirst(2);

        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.add(2, 9);
        ll.print();
        ll.removefirst();
        ll.print();
        ll.removel();
        ll.print();
        System.out.println(ll.size);
        // 5->4->3->2->1
    }
}
