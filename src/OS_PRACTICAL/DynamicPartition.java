package OS_PRACTICAL;

import java.util.*;

public class DynamicPartition {
    public static int[] bestFit(int[] partitions, int[] processes) {
        int[] allocation = new int[processes.length];
        Arrays.fill(allocation, -1);

        for (int i = 0; i < processes.length; i++) {
            int bestIndex = -1;
            for (int j = 0; j < partitions.length; j++) {
                if (partitions[j] >= processes[i]) {
                    if (bestIndex == -1 || partitions[j] < partitions[bestIndex]) {
                        bestIndex = j;
                    }
                }
            }
            if (bestIndex != -1) {
                allocation[i] = bestIndex;
                partitions[bestIndex] -= processes[i];
            }
        }
        return allocation;
    }

    public static int[] firstFit(int[] partitions, int[] processes) {
        int[] allocation = new int[processes.length];
        Arrays.fill(allocation, -1);

        for (int i = 0; i < processes.length; i++) {
            for (int j = 0; j < partitions.length; j++) {
                if (partitions[j] >= processes[i]) {
                    allocation[i] = j;
                    partitions[j] -= processes[i];
                    break;
                }
            }
        }
        return allocation;
    }

    public static int[] worstFit(int[] partitions, int[] processes) {
        int[] allocation = new int[processes.length];
        Arrays.fill(allocation, -1);

        for (int i = 0; i < processes.length; i++) {
            int worstIndex = -1;
            for (int j = 0; j < partitions.length; j++) {
                if (partitions[j] >= processes[i]) {
                    if (worstIndex == -1 || partitions[j] > partitions[worstIndex]) {
                        worstIndex = j;
                    }
                }
            }
            if (worstIndex != -1) {
                allocation[i] = worstIndex;
                partitions[worstIndex] -= processes[i];
            }
        }
        return allocation;
    }

    public static void main(String[] args) {
        int[] partitions = {100, 200, 212, 300, 400, 500};
        int[] processes = {212, 417, 112, 426};
        System.out.println("Partitions: " + Arrays.toString(partitions));
        System.out.println("Processes: " + Arrays.toString(processes));
        System.out.println("\nBest Fit Allocation: " + Arrays.toString(bestFit(partitions.clone(), processes)));
        System.out.println("First Fit Allocation: " + Arrays.toString(firstFit(partitions.clone(), processes)));
        System.out.println("Worst Fit Allocation: " + Arrays.toString(worstFit(partitions.clone(), processes)));
    }
}
