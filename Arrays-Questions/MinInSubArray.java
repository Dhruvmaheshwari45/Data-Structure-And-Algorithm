package MinInSubArray;

public class MinInSubArray {
	public static int findMin(int[] arr) {
		int low =0; int right=arr.length-1;
		int ans=Integer.MAX_VALUE;
		while(low<=right) {
			int mid=(low+right)/2;
			//if left half is sorted
			
			if(arr[low]<=arr[mid]) {
				ans = Math.min(ans, arr[low]);
				low=mid+1;
			}
			
			//if right half is sorted
			else {
				ans=Math.min(ans, arr[right]);
				right=mid-1;
			}
			
		}
		return ans;
	}
	public static void main(String[] args) {
		int[]arr = {1,2,4,3,5,6,7,3,9};
		int ans = findMin(arr);
		System.out.println("THe Minimum element is = "+ans);
	}
}
