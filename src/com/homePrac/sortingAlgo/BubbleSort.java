package com.homePrac.sortingAlgo;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {90,30,70,40,50,10,60,150,100};
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sortArray(arr);
		bubbleSort.printSort(arr);
	}
	
	public void sortArray(int arr[]){
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			boolean flag = false;
			for(int j=0;j<n-1-i;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(!flag){
				break;
			}
		}
		
	}
	
	public void printSort(int arr[]){
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			System.out.print(arr[i] + " ");
		}
	}
}
