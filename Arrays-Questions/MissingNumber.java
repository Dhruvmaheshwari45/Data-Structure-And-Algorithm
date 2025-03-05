package MissingNumberInArray;

public class MissingNumber {
	public static int missingnumber(int n,int[]a) {
		int sum = (n*(n+1))/2;
		int s2=0;
		for(int i=0;i<n-1;i++) {
			s2 += a[i];
		}
		int missingnum = sum-s2;
		return missingnum;
	}
	public static void main(String[] args) {
		int n = 5;
		int[] a = {1,2,3,5};
		int ans = missingnumber(n,a);
		System.out.println(ans);
	}
}
