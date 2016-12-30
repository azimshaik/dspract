package com.ds.azim;

public class m_sort {
	
	public static void merg_helper(int[] a){
		merge_sort(a,0,a.length-1);
	}
	public static void merge_sort(int[] a, int low, int high){
		if(low>=high){
			return;
		}else{
			int mid = low/2 + high/2;
			merge_sort(a,low,mid);
			merge_sort(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}
	public static void merge(int[] a, int low, int mid, int high){
		int[] temp = new int[high-low+1];
		int left = low;
		int right = mid+1;
		int k = 0; //index for the temp array
		while(left<=mid && right<=high){
			if(a[left]<a[right]){
				temp[k] = a[left];
				left++;
			}else{
				temp[k] = a[right];
				right++;
			}
			k++;
		}
		if(left<=mid){
			while(left<=mid){
				temp[k] = a[left];
				left++;
				k++;
			}
		}else{
			while(right<=high){
				temp[k] = a[right];
				right++;
				k++;
			}
		}
		for(int i=0 ;i<temp.length;i++){
			a[low+i] = temp[i];
		}
	}
	public static void main(String[] args){
		int[] a = {23,4,76,-7,-4};
		merg_helper(a);
		for(int m=0 ; m<a.length; m++){
			System.out.print(a[m]+",");
		}
	}
}
