package com.homePrac.sortingAlgo;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = {90,30,70,40,50,10,60,150,100};
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sortArray(arr);
		insertionSort.printSort(arr);
	}
	
	public void sortArray(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n - 1; i++) {
			int j = i-1;
			int temp = arr[i];
			while(j>=0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	
	public void printSort(int arr[]){
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			System.out.print(arr[i] + " ");
		}
	}
}
