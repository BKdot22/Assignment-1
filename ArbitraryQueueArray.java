package problem2;

public class ArbitraryQueueArray {

	private Object[] arr;
	private int n;
	private int top;
	
	public void ArbitraryQueueArray(int cap) {
		n = cap;
        arr = new Object[n];
        top = -1;
	}
	
	 public void push(int data) {
	        if (isFull()){
	            expandArray();      //if array is full then increase its capacity
	        }
	        arr[++top] = data;
	 }
	 public boolean isFull() {
		 if (n == top+1)
	            return true;
	        else
	            return false;
	 }
	 public void expandArray() {
		 int curr_size = top + 1;
	        Object[] new_array = new Object[curr_size * 2];
	        for(int i=0;i<curr_size;i++){
	            new_array[i] = arr[i];
	 }
	 }
	 public Object pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	        else {
	            reduceSize();                 //function to check if size can be reduced
	            return arr[top--];
	            }
	        }
	 
	 public void reduceSize() {
	        int curr_length = top+1;
	        if (curr_length < n / 2) {
	            Object[] new_array = new Object[n / 2];
	            System.arraycopy(arr, 0, new_array, 0, new_array.length);
	            arr = new_array;
	            n = new_array.length;
}
}
	 public boolean isEmpty() {
	        if (top == -1)
	            return true;
	        else
	            return false;
	        }
	 }