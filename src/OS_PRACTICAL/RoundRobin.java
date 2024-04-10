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
        Process[] Processes = new Process[n];

        System.out.print("Enter time quantum: ");
        int timeQuantum = scanner.nextInt();

        System.out.println("Enter arrival time and burst time for each process:");
        for (int i = 0; i < n; i++) {
            System.out.print("Process " + (i + 1) + ": ");
            int arrivalTime = scanner.nextInt();
            int burstTime = scanner.nextInt();
            Processes[i] = new Process(i + 1, arrivalTime, burstTime);
        }

        roundRobin(Processes, timeQuantum);

        scanner.close();
    }
    public static void roundRobin(Process[] Processes, int timeQuantum) {
        int n = Processes.length;
        int currentTime = 0, completedProcesses = 0, totalWaitingTime = 0, totalTurnaroundTime = 0;

        System.out.println("Process\tAT\tBT\tCT\tTAT\tWT");
        while (completedProcesses < n) {
            for (Process Process : Processes) {
                if (Process.remainingTime > 0) {
                    int slice = Math.min(Process.remainingTime, timeQuantum);
                    currentTime += slice;
                    Process.remainingTime -= slice;

                    if (Process.remainingTime == 0) {
                        Process.completionTime = currentTime;
                        int turnaroundTime = currentTime - Process.arrivalTime;
                        int waitingTime = turnaroundTime - Process.burstTime;
                        totalWaitingTime += waitingTime;
                        totalTurnaroundTime += turnaroundTime;
                        completedProcesses++;

                    }
                }

            }
        }
        Arrays.sort(Processes, Comparator.comparingInt(p -> p.id));

        for (Process Process : Processes) {
            int turnaroundTime = Process.completionTime - Process.arrivalTime;
            int waitingTime = turnaroundTime - Process.burstTime;
            System.out.println(Process.id + "\t" + Process.arrivalTime + "\t"
                    + Process.burstTime + "\t" + Process.completionTime + "\t"
                    + turnaroundTime + "\t" + waitingTime);
        }
        System.out.println("Average Waiting Time: " + (float) totalWaitingTime / n);
        System.out.println("Average Turnaround Time: " + (float) totalTurnaroundTime / n);

    }
}
