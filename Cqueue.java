public class Cqueue
{
int max= 10;
int queue[] = new int[max];
int front=-1,rear=-1;
void enqueue(int data)
{
    if((rear+1)%max == front)
        System.out.println("Queue Full");
    else
    {
        if(front == -1)
            front = 0;
        rear = (rear+1)%max;
        queue[rear] = data;
    }
}

void dequeue()
{
if(front==-1)
System.out.println("Queue Empty");
else if(front==rear){
    front=rear=-1;}
else
front=(front+1)%max;
}
void find(int key)
{
if(front==-1)
System.out.println("Queue is Empty");
else
{
int flag=0,counter=1;
for(int i=front;i<=rear;i++)
{

if(key==queue[i])
{
System.out.println(key+ " Found at position: "+counter);
flag++;
break;
}
counter++;
}
if(flag==0)
System.out.println(key+" Not Found in queue");
}
}
void show()
{
if(front==-1)
System.out.println("Queue is Empty");
else
{
for(int i=front;i<=rear;i++)
{
System.out.print(queue[i]+" ");
}
}
}
public static void main(String[] args)
{
Cqueue q = new Cqueue();
q.enqueue(10);
q.enqueue(9);
q.enqueue(8);
q.enqueue(7);
q.enqueue(6);
System.out.println("The  circular queue is :");
q.show();
System.out.println();
q.dequeue();
System.out.println ("The  circular queue after dequeuing: ");
q.show();
System.out.println();
q.find(9);
q.find(8);
}

}