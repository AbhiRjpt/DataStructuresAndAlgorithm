package com.homePrac.searchingAlgo;
public class LinearSearch {
	public static void main(String[] args) {
		 int target =50;
		 int arr[] = {30,40,100,27,50,60};
		 LinearSearch ls = new LinearSearch();
		 int res = ls.linearSearch(arr,target);
		 if(res == -1)
			 System.out.println("Number not found");
		System.out.println("Number found at index: "+res);
	}
	
	public int linearSearch(int arr[],int target){
		for(int i=0;i<arr.length;i++){
			if(target == arr[i]){
				return i;
			}
		}
		return -1;
	}
}
