package com.homePrac.sortingAlgo;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = {90,30,70,40,50,10,60,150,100};
		QuickSort quickSort = new QuickSort();
		int lb = 0,ub = arr.length-1;
		quickSort.sortArray(arr,lb,ub);
		quickSort.printSort(arr);
	}
	
	public void sortArray(int arr[],int lb, int ub) {
		System.out.println("lb: "+lb+" ub:"+ub);
		if(lb < ub){
		int loc = partition(arr,lb,ub);
			System.out.println("loc: "+loc);
		sortArray(arr,lb,loc-1);
		sortArray(arr,loc+1,ub);
		}
	}
	
	public int partition(int arr[],int low,int high){
		int pivot = arr[high];
		System.out.println("pivot: "+pivot);
		int i = (low -1);
		System.out.println("i: "+i);
		for (int j = low; j <= high- 1; j++)
		{
			// If current element is smaller than the pivot
			if (arr[j] < pivot)
			{
				i++;    // increment index of smaller element
//				swap(arr[i], arr[j]);
				System.out.println(arr[i]+ " "+arr[j]);
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
//		swap(arr[i + 1],arr[high]);
		int temp = arr[high];
		arr[high] = arr[i+1];
		arr[i+1] = temp;
		return (i + 1);
	}
	
//	public int partition(int a[],int lb,int ub){
//		int pivot = a[lb];
//		int start = lb;
//		int end = ub;
//		while(start < end){
//
//			if (a[start]<=pivot){
//				start++;
//			}
//
//			if (a[end] > pivot){
//				end--;
//			}
//
//			if(start<end){
//				int temp = a[start];
//				a[start] = a[end];
//				a[end] = temp;
//			}
//
//		}
//		int temp = a[lb];
//		a[lb] = a[end];
//		a[end] = temp;
//		return end;
//
//	}
	
	public void swap(int a,int b){
		int temp = a;
		a = b;
		b = temp;
	}
	
	public void printSort(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}
