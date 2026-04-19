class StackLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d){ data=d; }
    }

    Node top;

    void push(int x){
        Node n=new Node(x);
        n.next=top;
        top=n;
    }

    void pop(){
        if(top==null) return;
        top=top.next;
    }

    void display(){
        Node t=top;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }

    public static void main(String[] args){
        StackLinkedList s=new StackLinkedList();
        s.push(5); s.push(10);
        s.pop();
        s.display();
    }
}