package queues;
class QueueImp{
	final int size = 10;
	int arr[]=new int[size];
	int front = -1,rear=-1;
	void enqueue(int data)
	{
		if(this.isEmpty())
		{
			front++;
			rear++;
			arr[rear] = data;
		}
		else if(rear==size-1)//if queue is full
		{
			System.out.println("Queue is Full, No space to add");
		}
		else{
//			rear++;
//			arr[rear]=data;
			arr[++rear]=data;
		}
	}
	int dequeue()
	{
//		int x = arr[front];
//		front++;
//		return x;
		if(this.isEmpty())
		{
			System.out.println("Queue is Empty, Nothing to Dequeue");
			return -1;
		}
		if(front==rear)
		{
			int x = arr[front];
			front=-1;
			rear=-1;
			return x;
		}
		return arr[front++];
	}
	int peek()
	{
		if(this.isEmpty()) 
		{
			System.out.println("Queue is Empty, No Peek element");
			return -1;
		}
		return arr[front];
	}
	boolean isEmpty()
	{
//		if(front == -1 && rear == -1) return true;
		return(front == -1 && rear == -1);
	}
}
public class MyQueue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImp q = new QueueImp();
		System.out.println(q.isEmpty());
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		System.out.println(q.isEmpty());
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(5);
		q.enqueue(10);
	}

}
