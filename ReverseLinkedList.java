class ReverseLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d){ data=d; }
    }

    static Node reverse(Node head){
        Node prev=null, curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void main(String[] args){
        Node a=new Node(1);
        a.next=new Node(2);
        a.next.next=new Node(3);

        a=reverse(a);

        Node t=a;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
}