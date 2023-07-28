package BinarySearchQuestions;

public class PeakIndexinaMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 6, 12, 16, 20, 21, 18, 14, 10, 8 };
		int ans = peak(a);
		if (ans == -1) {
			System.out.println("element not found in given array");
		} else
			System.out.println("peak found at index : " + ans);
	}

	public static int peak(int arr[]) {
	int start=0;
	int end=arr.length-1;
	
	while(start<end)
	{
		int mid=start+(end-start)/2;
		if(arr[mid]>arr[mid+1])
			end=mid;
		else
			start=mid+1;
	}
	return start; //you can return start or end as both are pointing to the same element which is peak of the array(biggest element in the array
	
	
	}

}
