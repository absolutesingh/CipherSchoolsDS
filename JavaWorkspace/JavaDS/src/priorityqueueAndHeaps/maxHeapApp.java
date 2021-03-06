package priorityqueueAndHeaps;

import java.security.spec.MGF1ParameterSpec;

class MaxHeap{
	final int capacity = 10;//size
	int size = 0;//nItems
	int arr[] = new int[capacity];
	//functions to get indexes
	int getParentIndex(int childIndex) {return (childIndex-1)/2;}
	int getLeftChildIndex(int parentIndex) {return 2*parentIndex+1;}
	int getRightChildIndex(int parentIndex) {return 2*parentIndex+2;}
	//functions to get values
	int parent(int index) {return arr[getParentIndex(index)];}
	int rightChild(int index) {return arr[getRightChildIndex(index)];}
	int leftChild(int index) {return arr[getLeftChildIndex(index)];}
	//functions to check if parent/children exists
	boolean hasParent(int index) {return getParentIndex(index)>=0;}
	boolean hasLeftChild(int index) {return getLeftChildIndex(index)<size;}
	boolean hasRightChild(int index) {return getRightChildIndex(index)<size;}
	
	int peek()
	{
		if(size==0)
		{
			System.out.println("Nothing in Heap");
			return -1;
		}
		return arr[0];
	}
	//insertion
	void add(int data)
	{
		arr[size] = data;
		size++;
		heapifyUp();
	}
	void swap(int indexOne,int indexTwo)
	{
		int temp=arr[indexOne];
		arr[indexOne]=arr[indexTwo];
		arr[indexTwo]=temp;
	}
	void heapifyUp() {
		int index = size-1;
		while(hasParent(index) && parent(index)<arr[index])
		{
			swap(getParentIndex(index),index);
			index = getParentIndex(index);
		}
	}
	//deletion
	int poll()
	{
		int element = arr[0];
		arr[0]=arr[size-1];
		size--;
		heapifyDown();
		return element;
	}
	void heapifyDown() {
		int index = 0;
		while(hasLeftChild(index)) {
			int largerChildIndex = getLeftChildIndex(index);
			if(hasRightChild(index) && rightChild(index)>leftChild(index))
			{
				largerChildIndex = getRightChildIndex(index);//larger child found
			}
			if(arr[index]>arr[largerChildIndex])
			{
				break; //or return;
			}
			else {
				swap(index, largerChildIndex);
			}
			index = largerChildIndex;
		}
	}
}
public class maxHeapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxHeap mhHeap = new MaxHeap();
		mhHeap.add(10);
		mhHeap.add(5);
		mhHeap.add(3);
		mhHeap.add(2);
		mhHeap.add(4);
		System.out.println(mhHeap.peek());
		System.out.println(mhHeap.poll());
		System.out.println(mhHeap.poll());
	}

}
