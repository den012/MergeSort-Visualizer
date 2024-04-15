package com.example.mergesortvisual;
import java.util.List;

public class Sorter {
    public static void mergeSort(int[] arr, List<ArrayState> states, int left, int right){
        if(left < right){
            int middle = (left + right) / 2;

            mergeSort(arr, states, left, middle);
            mergeSort(arr, states, middle + 1, right);

            merge(arr, states, left, middle, right);
        }
    }

    public static void merge(int[] arr, List<ArrayState> states, int left, int middle, int right){
        int size1 = middle - left + 1;
        int size2 = right - middle;

        int[] leftArray = new int[size1];
        int[] rightArray =new int[size2];

        System.arraycopy(arr, left, leftArray, 0, size1);
        System.arraycopy(arr, middle + 1, rightArray, 0, size2);

        int i = 0;
        int j = 0;
        int k = left;

        while (i < size1 && j < size2){
            if(leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            }
            else {
                arr[k] = rightArray[j];
                j++;
            }
            states.add(new ArrayState(arr.clone(), k, i < size1 ? left + i : -1));
            k++;
        }
        while(i < size1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < size2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
