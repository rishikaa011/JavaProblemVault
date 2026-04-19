class QueueArray {
    int q[]=new int[5];
    int front=0,rear=-1;

    void enqueue(int x){
        if(rear==4) System.out.println("Full");
        else q[++rear]=x;
    }

    void dequeue(){
        if(front>rear) System.out.println("Empty");
        else front++;
    }

    void display(){
        for(int i=front;i<=rear;i++)
            System.out.print(q[i]+" ");
    }

    public static void main(String[] args){
        QueueArray q=new QueueArray();
        q.enqueue(1); q.enqueue(2);
        q.dequeue();
        q.display();
    }
}