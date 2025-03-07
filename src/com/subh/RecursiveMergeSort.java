package com.subh;



import java.util.Arrays;

public class RecursiveMergeSort {

    // Recursive merge sort function
    public static void mergeSort(int[] arr, int start, int end) {
        // Base case: if array size is 1, return
        if (start >= end) {
            return;
        }

        // Calculate the middle index
        int mid = start + (end - start) / 2;

        // Recursively sort the left half
        mergeSort(arr, start, mid);

        // Recursively sort the right half
        mergeSort(arr, mid + 1, end);

        // Merge the sorted halves
        merge(arr, start, mid, end);
    }

    // Function to merge two sorted halves
    public static void merge(int[] arr, int start, int mid, int end) {
        // Temporary array to store the merged result
        int[] temp = new int[end - start + 1];

        int i = start;    // Pointer for the left subarray
        int j = mid + 1;  // Pointer for the right subarray
        int k = 0;        // Pointer for the temporary array

        // Merge elements into the temporary array in sorted order
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the left subarray, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right subarray, if any
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy the merged array back into the original array
        for (int l = 0; l < temp.length; l++) {
            arr[start + l] = temp[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Perform merge sort
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

