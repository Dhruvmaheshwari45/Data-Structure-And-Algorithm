package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	public static List<List<Integer>> triplet(int n,int[]arr){
		Set<List<Integer>> st = new HashSet<>();
		
		for(int i=0;i<n;i++) {
			Set<Integer> hashset = new HashSet<>();
			
			for(int j=i+1;j<n;j++) {
				int third = -(arr[i]+arr[j]);
				
				
				if(hashset.contains(third)) {
					List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
					temp.sort(null);
					st.add(temp);
				}
				hashset.add(arr[j]);
			}
		}
		List<List<Integer>> ans = new ArrayList<>();
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {12,53,64,1,2,6,5,9,10};
		int n = arr.length;
		List<List<Integer>> ans = triplet(n, arr);
		for(List<Integer> an : ans) {
			System.out.print("[");
			for(Integer i : an) {
				System.out.print(i +" ");
			}
			System.out.println("]");
		}
		System.out.println();
	}
}
