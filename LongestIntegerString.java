package AssignmentSolutions;

// Program for longest Integer String
class LongestIntegerString {
	static int max_refernce; // stores the LIS

	static int _lis(int arr[], int n)
	{

		if (n == 1)
			return 1;

		int res, max_ending_here = 1;

		
		for (int i = 1; i < n; i++) {
			res = _lis(arr, i);
			if (arr[i - 1] < arr[n - 1]
				&& res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}

		
		if (max_refernce < max_ending_here)
			max_refernce = max_ending_here;

		
		return max_ending_here;
	}

	
	static int lis(int arr[], int n)
	{
		
		max_refernce = 1;

		
		_lis(arr, n);

		
		return max_refernce;
	}

	
	public static void main(String args[])
	{
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = arr.length;
		System.out.println("Length of longest Integer String is " + lis(arr, n)
						+ "\n");
	}
}