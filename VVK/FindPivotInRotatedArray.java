package VVK;

public class FindPivotInRotatedArray 
{ 
    public static void main(String args[]) 
    { 
       int ar[] = {9,12,15,17,25,28,32,37,3,5,7,8}; 
       int key =28; 
       System.out.println("Index of the element is : "+ pivotedBinarySearch(ar, ar.length, key)); 
    } 
  
    static int pivotedBinarySearch(int arr[], int n, int key) 
    { 
       int pivot = findPivot(arr, 0, n-1); 
        
       // If we didn't find a pivot, then array is not rotated at all 
       if (pivot == -1) 
           return binarySearch(arr, 0, n-1, key); 
        
       // If we found a pivot, then first compare with pivot and then 
       // search in two subarrays around pivot 
       if (arr[pivot] == key) 
           return pivot; 
       if (arr[0] <= key) 
           return binarySearch(arr, 0, pivot-1, key); 
       return binarySearch(arr, pivot+1, n-1, key); 
    } 
       
    static int findPivot(int arr[], int low, int high) 
    { 
       // base cases 
       if (high < low)   
            return -1; 
       if (high == low)  
            return low; 
         
       int mid = (low + high)/2;    
       if (mid < high && arr[mid] > arr[mid + 1]) 
       {
    	   System.out.println("Pivot is=>"+arr[mid]);
           return mid; 
       }
       if (low < mid && arr[mid] < arr[mid - 1]) 
       {
    	   System.out.println("Pivot is=>"+arr[mid-1]);
           return (mid-1); 
       }
       if (arr[low] >= arr[mid]) 
           return findPivot(arr, low, mid-1); 
       return findPivot(arr, mid + 1, high); 
    } 
       
    /* Standard Binary Search function */
    static int binarySearch(int arr[], int low, int high, int key) 
    { 
       if (high < low) 
           return -1; 
         
       int mid = (low + high)/2;   
       if (key == arr[mid]) 
           return mid; 
       if (key > arr[mid]) 
           return binarySearch(arr, (mid + 1), high, key); 
       return binarySearch(arr, low, (mid -1), key); 
    } 
    

} 
