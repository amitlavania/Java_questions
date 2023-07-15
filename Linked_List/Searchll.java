public class Searchll {
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

    public void addFirst(int data) {
        // step 1 create new node
        Node newNode = new Node(data);
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
        if (head == null) {
            head = tail = null;

        }
        tail.next = newNode;
        tail = newNode;
    }

    public int itrsearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        // size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;

        }
        return idx + 1;
    }

    public int recsearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        Searchll ll = new Searchll();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        // ll.addLast(5);
        ll.add(2, 9);
        // ll.print();
        // System.out.println(ll.itrsearch(2));
        System.out.println(ll.recsearch(3));

        // 5->4->3->2->1
    }
}