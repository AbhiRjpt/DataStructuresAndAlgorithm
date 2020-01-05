package com.homePrac.searchingAlgo;

public class BinarySearch {
	public static void main(String[] args) {
		int target =50;
		int arr[] = {30,40,50,60,100};
		BinarySearchTest bst = new BinarySearchTest(target,arr);
		int res = bst.findingElementUsingBinarySearch();
		if(res == -1) {
			System.out.println("Num not found");
		}else {System.out.println("Number found at index: "+res);}
	}
}

class BinarySearchTest{
	private int target;
	private int arr[];
	
	public BinarySearchTest(int target, int[] arr) {
		this.target = target;
		this.arr = arr;
	}
	
	public int getTarget() {
		return target;
	}
	
	public int[] getArr() {
		return arr;
	}
	
	public int findingElementUsingBinarySearch(){
		int max = this.arr.length-1;
		int min = 0;
		int mid;
		int count = 0;
		while(max >= min){
			mid = (max+min)/2;
			count++;
			if(this.arr[mid] == target){
				System.out.println("Num of steps req for search: "+count);
				return mid;
			} else if(this.arr[mid] > target){
				max = mid-1;
			} else {
			min = mid+1;	
			}
		}
		return -1;
	}
}