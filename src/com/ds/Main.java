package com.ds;

public class Main {

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int arr1[] = { 3, 66, 15, 2, 10, 4 };
        int arr2[] = { 11, 4, 33, 87, 2, 15 };

        System.out.println("Given Array");
        printArray(arr);

        //MERGE SORT
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nMerge sorted array");
        printArray(arr);

        System.out.println("*******************************");

        //QUICK SORT
        System.out.println("\nGiven Array");
        printArray(arr1);

        QuickSort ob1 = new QuickSort();
        ob1.sort(arr1, 0, arr.length - 1);

        System.out.println("\nQuick sorted array");
        printArray(arr1);

        System.out.println("*******************************");

        //INSERTION SORT
        System.out.println("\nGiven Array");
        printArray(arr2);

        InsertionSort ob2 = new InsertionSort();
        ob2.sort(arr2);

        System.out.println("\nInsertion sorted array");
        printArray(arr2);
    }
}


