
public class Problem2{
void merge(int[] a, int sizei, int sizej) {
  int temp;
  int ii = 0;
  int ji = sizei;
  int flength = sizei+sizej;

  for (int f = 0; f < (flength-1); f++) {
    if (sizei == 0 || sizej == 0)
      break;

    if (a[ii] < a[ji]) {
      ii++;
      sizei--;
    }
    else {
      temp = a[ji];

      for (int z = (ji-1); z >= ii; z--)
        a[z+1] = a[z];  
      ii++;

      a[f] = temp;

      ji++;
      sizej--;
    }
  }
}
void mergesort(int[] a, int arraySize) {
	  int listsize, xsize;

	  for (listsize = 1; listsize <= arraySize; listsize*=2) {
	    for (int i = 0, j = listsize; (j+listsize) <= arraySize; i += (listsize*2), j += (listsize*2)) {
	    	int b[] = new int[arraySize]; 
	        for (int x=0; i<arraySize; x++) 
	            b[x] = a[x]; 
	      merge(b, listsize, listsize);
	    }
	  }


	  listsize /= 2;

	  xsize = arraySize % listsize;
	   a = new int[arraySize-xsize];
	   int c[] = new int[arraySize]; 
	   
       // Copy elements of a[] to b[] 
       for (int y=0; y<arraySize; y++) 
           c[y] = b[arraySize-xsize]; 
	  if (xsize > 1)
	    mergesort(c, xsize);

	  merge(b, listsize, xsize);
}

public static void main(String args[]) {
	
	
	
}
}