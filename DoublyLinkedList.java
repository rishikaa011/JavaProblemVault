class DoublyLinkedList {
    static class Node {
        int data;
        Node prev,next;
        Node(int d){ data=d; }
    }

    Node head;

    void insert(int d){
        Node n=new Node(d);
        if(head==null){ head=n; return; }
        Node temp=head;
        while(temp.next!=null) temp=temp.next;
        temp.next=n;
        n.prev=temp;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList d=new DoublyLinkedList();
        d.insert(1); d.insert(2); d.insert(3);
        d.display();
    }
}