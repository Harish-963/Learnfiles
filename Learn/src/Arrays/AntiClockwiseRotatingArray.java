package Arrays;

import java.util.Arrays;

public class AntiClockwiseRotatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,2,4,5,6,7};
		int count=3;
		System.out.println("Original array : "+Arrays.toString(arr));
		System.out.println("AntiClock wise rotated array : "+Arrays.toString(rotationAntiClockwiseArray(arr, count)));
	}
	

	
	public static int[] rotationAntiClockwiseArray(int arr[], int count)
	{
		for(int i=0;i<count;i++)
		{
			int temp=arr[0];
			for(int i1=0;i1<arr.length-1;i1++)
			{
				arr[i1]=arr[i1+1];
			}
			arr[arr.length-1]=temp;
		}
		return arr;
	}

}
