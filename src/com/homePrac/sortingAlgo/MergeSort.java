package com.homePrac.sortingAlgo;

public class MergeSort {
	public static void main(String[] args) {
		int arr[] = {90,30,70,40,50,10,60,150,100};
		mergeSort(arr);
		printSortedArray(arr);
		
	}
	
	private static void mergeSort(int[] arr) {
		int n = arr.length;
		if(n<2){
			return;
		}
		int mid = n/2;
		System.out.println("mid: "+mid);
		int[] leftArray  = new int[mid];
		int[] rightArray = new int[n-mid];
		System.out.println(mid-1);
		System.out.println(n-1);
		for(int i = 0;i<mid;i++){
			leftArray[i] = arr[i];
		}
		
		for(int i = mid;i<n;i++){
			rightArray[i-mid] = arr[i];
		}
		System.out.println("Left ARRAY");
		for(int i = 0;i<=leftArray.length-1;i++){
			System.out.println(leftArray[i]);
		}
		System.out.println("RIGHT ARRAY");
		for(int i = 0;i<=rightArray.length-1;i++){
			System.out.println(rightArray[i]);
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray,rightArray,arr);
		
	}
	
	private static void merge(int[] leftArray, int[] rightArray, int[] arr) {
		int lengthOfLeftArray = leftArray.length;
		int lengthOfRightArray = rightArray.length;
		int i=0,j=0,k=0;
		
		while (i<lengthOfLeftArray && j<lengthOfRightArray){
			if(leftArray[i] <= rightArray[j]){
				arr[k] = leftArray[i];
				i++;
			}else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while (i<lengthOfLeftArray){
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while (j<lengthOfRightArray){
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
	
	public static void printSortedArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
}
