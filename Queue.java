class Queue{
    int rear=-1;
    int front=-1;
    int max=4;
    int[] queue=new int[max];
    
    void enqueue(int el)
    {
        if(rear==max-1){
            System.out.println("queue is full");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear++;
        queue[rear]=el;
    }
    void dequeue()
    {
        if(front==-1 || front==rear+1){
            System.out.println("empty queue");
        }
        else{
            System.out.println("element deleted:"+queue[front]);
            front++;
        }
    }
    void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(queue[i]);
        }
    }
    public static void main (String[] args) {
       Queue obj = new Queue();
       obj.enqueue(2);
       obj.enqueue(4);
       obj.enqueue(6);
       obj.enqueue(8);
       obj.dequeue();
       obj.display();
    }
}