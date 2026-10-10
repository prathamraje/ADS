package collections.arrays;

public class CustomArray {

	//returns new sized array
	public static int [] resize(int arr[], int s) {
		
		int newResized [] = new int[s];
		
		for(int i=0;i<arr.length;i++) {
			newResized[i] = arr[i];
		}
		
		return newResized;
	}
	
	//insert an element in an Array
	public  static int insert (int arr[],int count, int pos, int element) {
		if(pos>arr.length) {
			return count;
			
		}
		
		if(pos>count) {
			arr[pos]=element;
			return pos++;
		}
		
	    for(int i=count-1;i>=pos;i--) {
		
		arr[i+1]=arr[i];
	    }
	    arr[pos]=element;

	   return count++;
	}

	
	//remove the position

	public static int delete(int[] arr, int n, int pos) {
	    
	    if (pos < 0 || pos >= n || n <= 0) {
	         return n;
	    }
	    
	  
	    for (int i = pos; i < n - 1; i++) {
	        arr[i] = arr[i + 1];
	    }
	    
	    
	    return n - 1;
	}
	
	public static void main(String [] args) {
		
		int arr[]= {10,20,30,40,50};
		
  delete(arr, 5, 20);
  
  for(int nums:arr)
	System.out.println(nums);
	}


}
