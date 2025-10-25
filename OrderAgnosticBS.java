public class OrderAgnosticBS {
	
	public static void main(String[] args) {
		
		int arr[] = {-1, 0, 5, 12, 34, 54, 65, 75, 88, 90}; //ASC
		
		int arr2[] = {99, 89, 65, 33, 23, 12, 11, 4, 1, 0}; //DESC
		
		int target = 0;
		int ans = orderAgnosticBS(arr2, target);
		
		System.out.println( ans == -1
							? "Target not found!!!" 
							: "Target found at index = " + ans + ".");
		
	}
	
	public static int orderAgnosticBS(int arr[], int target)
	{
		
		int start = 0;
		int end = arr.length - 1;
		boolean asc = arr[start] < arr[end];
		
		while(start <= end)
		{
			int mid = start + (end - start) / 2;

			if (target == arr[mid]) 
			{
				return mid;
			} 
			
			if (asc) 
			{
				if(target < arr[mid])
				{
					end = mid - 1;
				}
				else
				{
					start = mid + 1;
				}
			} 
			else 
			{
				if(target > arr[mid])
				{
					end = mid - 1;
				}
				else
				{
					start = mid + 1;
				}
			}
			 
		}
		
		return -1;
	}

}
