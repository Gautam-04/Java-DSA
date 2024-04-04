package Aoa_Practical;


import java.util.Arrays;

public class Sortings {
    public static void main(String[] args) {
        int[] arr = {2,5,4,8,7,6,5,8,99,545,656,215,336,12,55,698,45};
        int n = arr.length;
//        System.out.println(Arrays.toString(arr));
//        BubbleSort(arr,n);
//        System.out.println(Arrays.toString(arr));
//        SelectionSort(arr,n);
        System.out.println(Arrays.toString(arr));
        InsertionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleSort(int[] arr,int n){
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int[] arr,int n){
        for(int i = 0;i<n-1;i++){
            int mini = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }

            if(mini != i){
                int temp = arr[mini];
                arr[mini] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void InsertionSort(int[] arr,int n){
        for(int i = 1;i<n;i++){
            int j = i;
            while(j >= 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
