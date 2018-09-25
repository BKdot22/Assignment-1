package problem1;

public class ArbitraryQueue<Object> {

	public ArbitraryQueue() {
		// TODO Auto-generated constructor stub
	}
	 private int n;// size of the stack
	 private Node first;
	 private Node last;
	 
	    private class Node {
	        private Object object;
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
public void push(Object object)
	 {
	 Node oldfirst = first;
	 first = new Node(0);
	 first.object = object;
	 first.next = oldfirst;
	 }
public void enqueue(Object object)
{
	Node oldlast = last;
	last = new Node(0);
	last.object = object;
	last.next = null;
	if (isEmpty()) first = last;
	else oldlast.next = last;
}
public Object pop() {
	Object object = first.object;
	 first = first.next;
	 return object;
}

public Object dequeue()
{
	Object object = first.object;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
