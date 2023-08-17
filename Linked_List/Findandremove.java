public class Findandremove {

    public static class Node
    {
        int data;
        Node next;
        public  Node(int data)
        {
            this.data=data;
            this.next=null;

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

    public void deletenthfromend(int n)
    {
        int size=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        if(n==size)
        {
            head=head.next; //remove first
            return;
        }
        int i=1;
        int itofind=size-n;
        Node prev=head;
        while(i<itofind)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;

        
    } 
    public static void main(String[] args) {
        Findandremove ll = new Findandremove();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        // ll.addLast(5);
        ll.add(2, 3);
        ll.print();
        ll.deletenthfromend(4);
        ll.print();
        
    }
    
}
