public class Checkpalin {

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

        // public void addLast(int data) {
    
        //     Node newNode = new Node(data);
        //     if (head == null) {
        //         head = tail = null;
    
        //     }
        //     tail.next = newNode;
        //     tail = newNode;
        // }
        
    
        public Node findmid(Node head)
        {
            Node slow=head;
            Node fast=head;
            while( fast!=null && fast.next!=null )
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
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
    
        public boolean checkpalindrome()
        {
            if(head==null ||head.next==null)
            {
                return true;
            }
            //step 1 find mid 
           Node mid= findmid(head);
    
            //step 2 reverse 2nd half
            Node prev=null;
             Node curr=mid;
             Node next;
             while(curr!=null)
             {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
             }
             Node right=prev;
             Node left=head;
            //step 3 check left half & right half
    
            while(right!=null)
            {
                if(left.data!=right.data)
                {
                    return false;
    
                }
                left=left.next;
                right=right.next;
    
            }
            return true;
        }
        public static void main(String[] args) {
            Checkpalin ll = new Checkpalin();
            ll.addFirst(1);
            ll.addFirst(2);
            ll.addFirst(2);
            // ll.addFirst(1);
            ll.print();
            System.out.println(ll.checkpalindrome());
          
            
        }
        
    }

