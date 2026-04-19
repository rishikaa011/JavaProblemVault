class LinkedListBasic {
    static class Node {
        int data;
        Node next;
        Node(int d){ data=d; }
    }

    Node head;

    void insert(int d){
        Node n=new Node(d);
        if(head==null){ head=n; return; }
        Node temp=head;
        while(temp.next!=null) temp=temp.next;
        temp.next=n;
    }

    void delete(int key){
        if(head==null) return;
        if(head.data==key){ head=head.next; return; }
        Node temp=head;
        while(temp.next!=null && temp.next.data!=key){
            temp=temp.next;
        }
        if(temp.next!=null) temp.next=temp.next.next;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        LinkedListBasic l=new LinkedListBasic();
        l.insert(1); l.insert(2); l.insert(3);
        l.delete(2);
        l.display();
    }
}