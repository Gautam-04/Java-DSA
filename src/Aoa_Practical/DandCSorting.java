package Aoa_Practical;

import java.util.Arrays;

public class DandCSorting {
    public static void main(String[] args) {
        int[] arr = {2,5,4,8,7,6,5,8,99,545,656,215,336,12,55,698,45};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        QuickSort(arr,n-1,0);
        System.out.println(Arrays.toString(arr));
//        arr = Sort(arr);
//        System.out.println(Arrays.toString(arr));
    }

    public static void QuickSort(int[] arr,int high,int low){
        int s = low;
        int h = high;

        if(low>=high){
            return;
        }

        int mid = s + (h-s)/2;
        int pivot = arr[mid];

        while(s<=h){

            while(arr[s] < pivot){
                s++;
            }
            while(arr[h] > pivot){
                h--;
            }

            if(s<=h){
                int temp = arr[s];
                arr[s] = arr[h];
                arr[h] = temp;
                s++;
                h--;
            }

            QuickSort(arr,h,low);
            QuickSort(arr,high,s);
        }
    }


    public static int[] Sort(int[] arr){
        int mid = arr.length/2;

        if(arr.length == 1){
            return arr;
        }

        int[] left = Sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = Sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0,j = 0, k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;

            }
            k++;
        }

        while(i < first.length){
                mix[k] = first[i];
                k++;
                i++;
        }

        while(j < second.length){
                mix[k] = second[j];
            j++;
                k++;

        }


        return mix;
    }

}
