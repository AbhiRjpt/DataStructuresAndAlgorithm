package com.homePrac.sortingAlgo;

public class SelectionSort {
	public void sortArray(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			System.out.println("i: "+i);
			int minIdx = i;
			for(int j=i+1;j<arr.length;j++){
				System.out.println("j: "+j);
				System.out.println("Array values to be compared: "+arr[minIdx]+" and "+arr[j]);
				if(arr[j] < arr[minIdx]){
					minIdx = j;
				}
			}
			int temp = arr[minIdx];
			System.out.println("temp: "+temp);
			arr[minIdx] = arr[i];
			System.out.println("arr[minIdx]: "+arr[minIdx]);
			arr[i] = temp;
			System.out.println("arr[i]: "+arr[i]);
		}
	
	}
	
	public void printArray(int arr[]){
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
	}
	
	
	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		int arr[] = {12,15,89,5,34,95,10};
		System.out.println("------------PRINTING UNSORTED ARRAY-------------");
		selectionSort.printArray(arr);
		System.out.println("------------SORTING ARRAY-------------");
		selectionSort.sortArray(arr);
		System.out.println("------------PRINTING SORTED ARRAY-------------");
		selectionSort.printArray(arr);
		
	}
}
