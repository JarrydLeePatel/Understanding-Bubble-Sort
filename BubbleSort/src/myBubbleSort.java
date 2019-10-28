public class myBubbleSort 
{ 
    void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
		boolean swapped = true;
        for (int i = 0; i < n-1; i++) 
		{
			if(swapped)
				swapped = false;
			else 
				break;
				
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
					swapped = true;
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
	}
	
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    
    public static void main(String args[]) 
    { 
        myBubbleSort ob = new myBubbleSort(); 
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        ob.bubbleSort(arr); 
        System.out.print("Sorted array :"); 
        ob.printArray(arr); 
    } 
} 