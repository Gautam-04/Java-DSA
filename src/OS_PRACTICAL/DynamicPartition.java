package OS_PRACTICAL;

import java.util.*;

public class DynamicPartition {
    public static void Bestfit(int[] partitions,int process){
        int index = -1;
        int largestpartition = partitions[0];
        for (int i = 1; i < partitions.length; i++) {
            if(largestpartition >= process && partitions[i] >= process) {
                largestpartition = Math.min(partitions[i],largestpartition);
            }
        }

        for (int i = 0; i < partitions.length; i++) {
            if(largestpartition == partitions[i]){
                index = i+1;
                break;
            }
        }

        System.out.println("Element stored in Best fit at index: " + index);
    }

    public static void main(String[] args) {
        int[] partitions = {200,100,110,800,265,154};
        int process = 110;
        Bestfit(partitions,process);
        WorstFit(partitions,process);
        FirstFit(partitions,process);
    }

    private static void FirstFit(int[] partitions, int process) {
        int index = -1;
        for (int i = 0; i < partitions.length; i++) {
            if(process <= partitions[i]){
                index = i+1;
                break;
            }
        }
        System.out.println("Element stored in first fit at index: " + index);
    }

    private static void WorstFit(int[] partitions, int process) {
        int index = -1;
        int largestpartition = partitions[0];
        for (int i = 1; i < partitions.length; i++) {
            if(largestpartition > process)
                largestpartition = Math.max(partitions[i],largestpartition);
        }

        for (int i = 0; i < partitions.length; i++) {
            if(largestpartition == partitions[i]){
                index = i+1;
                break;
            }
        }

        System.out.println("Element stored in worst fit at index: " + index);
    }
}
