public class Problem4{
	
    void swap(int arr[], int a, int b) 
    { 
        int temp = arr[a]; 
        arr[a] = arr[b]; 
        arr[b] = temp; 
    } 
  
 
    void Problem4A(int[] a, int arraySize) 
    { 
        for (int i = 1; i < arraySize; i+=2) 
        { 
            if (i>0 && a[i-1] < a[i] ) 
                swap(a, i-1, i); 
  
            if (i<arraySize-1 && a[i] > a[i+1] ) 
                swap(a, i, i + 1); 
        } 
    } 
  
public static void main(String args[]) {
     int[] a = new int [7]; 
     int arraySize = a.length; 
     Problem4A( a,arraySize); 
     for (int i : a) 
         System.out.print(i+" "); 
	
}
}
