package OS_PRACTICAL;

import java.util.*;

class Process {
    int id, arrivalTime, burstTime, remainingTime, completionTime;

    Process(int id, int arrivalTime, int burstTime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
    }
}
public class RoundRobin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();
        Process[] processes = new Process[n];

        System.out.print("Enter time quantum: ");
        int timeQuantum = scanner.nextInt();

        System.out.println("Enter arrival time and burst time for each process:");
        for (int i = 0; i < n; i++) {
            System.out.print("Process " + (i + 1) + ": ");
            int arrivalTime = scanner.nextInt();
            int burstTime = scanner.nextInt();
            processes[i] = new Process(i + 1, arrivalTime, burstTime);
        }

        roundRobin(processes, timeQuantum);

        scanner.close();
    }
    public static void roundRobin(Process[] processes, int timeQuantum) {
        int n = processes.length;
        int currentTime = 0, completedProcesses = 0, totalWaitingTime = 0, totalTurnaroundTime = 0;

        System.out.println("Process\tAT\tBT\tCT\tTAT\tWT");
        while (completedProcesses < n) {
            for (Process process : processes) {
                if (process.remainingTime > 0) {
                    int slice = Math.min(process.remainingTime, timeQuantum);
                    currentTime += slice;
                    process.remainingTime -= slice;

                    if (process.remainingTime == 0) {
                        process.completionTime = currentTime;
                        int turnaroundTime = currentTime - process.arrivalTime;
                        int waitingTime = turnaroundTime - process.burstTime;
                        totalWaitingTime += waitingTime;
                        totalTurnaroundTime += turnaroundTime;
                        completedProcesses++;

                    }
                }

            }
        }
        Arrays.sort(processes, Comparator.comparingInt(p -> p.id));

        for (Process process : processes) {
            int turnaroundTime = process.completionTime - process.arrivalTime;
            int waitingTime = turnaroundTime - process.burstTime;
            System.out.println(process.id + "\t" + process.arrivalTime + "\t"
                    + process.burstTime + "\t" + process.completionTime + "\t"
                    + turnaroundTime + "\t" + waitingTime);
        }
        System.out.println("Average Waiting Time: " + (float) totalWaitingTime / n);
        System.out.println("Average Turnaround Time: " + (float) totalTurnaroundTime / n);

    }
}
