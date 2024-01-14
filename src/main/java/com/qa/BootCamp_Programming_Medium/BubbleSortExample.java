package com.qa.BootCamp_Programming_Medium;


	public class BubbleSortExample {
	    static void bubbleSort(int[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap elements if they are in the wrong order
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        
	        int[] arr = { 95, 34, 25, 12, 22, 11, 90 };

	       
	        bubbleSort(arr);

	        System.out.print("Sorted Array: ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}


