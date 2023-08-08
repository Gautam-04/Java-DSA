package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {5,4,3,21,9,84,1};
        Sorting(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void Sorting(int[] arr,int s,int e){
        if(e - s == 1){
            return;
        }
        int mid = (s + e)/2;
        Sorting(arr,s,mid);
        Sorting(arr,mid,e);

        merge(arr,s,mid,e);
    }

    private static void merge(int[] arr, int s, int m, int e){
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while(i < m && j< e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //it may be possible that one arrays is not completed
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
arr[s + l] = mix[l];
        }
    }
}
