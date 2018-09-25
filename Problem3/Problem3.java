package problem1;

public class Problem3 {
	package problem1;

import problem1.ArbitraryQueue.Node;

public class ArbitraryQueue(int) {

		public ArbitraryQueue() {
			// TODO Auto-generated constructor stub
		
		 private int n;// size of the stack
		 private Node first;
		 private Node last;
		 private Node sorted;
		 private Node head;
		 
		    public class Node {
		        private int object;
		        private Node next;
		        public int data;
		        private Node(int d) { 
		        	data=d;
		        	next=null;     
		        	
		        }
		    }

		 public boolean isEmpty() {
		        return first == null;
		 }
	public void push(int data)
		 {
		 Node oldfirst = first;
		 first = new Node(0);
		 first.data = data;
		 first.next = oldfirst;
		 }
	
	
	public int pop() {
		int object = first.object;
		 first = first.next;
		 return object;
	}

	public int dequeue()
	{
		int object = first.object;
		first = first.next;
		if (isEmpty()) last = null;
		return object;
	}

	public int Traverse(int index) {
		Node current = first;
		int count = 0;
		while (current != null) {
			if (count==index)
				return current.data;
			count++;
			current=current.next;
						
		}
				
	return 0;	
		
	}
		
	
	void insertionSort(Node ref)  
    { 
       Node a = new Node(0) ; // fake head
        sorted = null; 
        Node current = ref;; 
        while (current != null)  
        { Node next = current.next;
        Node b = a;
        while(b.next!=null && b.next.data<current.data)
        b=b.next;
        current.next=b.next;
        b.next=current;
        current=next;
        System.out.println("Switced"b"with"current );
        }
            
    } 
	
		}
public static void main(String[] args) {
	// TODO Auto-generated method stub
}
