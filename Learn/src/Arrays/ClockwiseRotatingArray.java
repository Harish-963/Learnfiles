package Arrays;

import java.util.Arrays;

public class ClockwiseRotatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,2,4,5,6,7};
		int count=3;
		System.out.println("Original array : "+Arrays.toString(arr));
		System.out.println("Clock wise rotated array : "+Arrays.toString(rotationClockwiseArray(arr, count)));
	}
	
	public static int[] rotationClockwiseArray(int arr[], int count)
	{
		for(int i=0;i<count;i++)
		{
			int temp=arr[arr.length-1];
			for(int i1=arr.length-1;i1>0;i1--)
			{
				arr[i1]=arr[i1-1];
			}
			arr[0]=temp;
		}
		return arr;
	}


}
