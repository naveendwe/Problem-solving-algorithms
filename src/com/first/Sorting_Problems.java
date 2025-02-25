package com.first;

public class Sorting_Problems {

    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 1};
        quickSort(arr,0,arr.length-1);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //bubble sort algorithm
    public static void bubbleSort(int[] arr) {
        int leng = arr.length;
        for (int i = 0; i < leng - 1; i++) {
            for (int j = 0; j < leng - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }

    //selection sort algorithm
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[i];//traversing order
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        printArray(arr);
    }

    //insertion sort algorithm
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // select an key value
            int j = i - 1; // get an integer value for comparison
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        printArray(arr);
    }

    //quick sort algorithm
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low - 1);
        for(int j = low; j < high; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
