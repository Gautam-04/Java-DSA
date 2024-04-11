package OS_PRACTICAL;

import java.util.*;

class NPPSProcess {
    int id;
    int priority;
    int burstTime;
    int waitingTime;
    int turnaroundTime;

    NPPSProcess(int id, int priority, int burstTime) {
        this.id = id;
        this.priority = priority;
        this.burstTime = burstTime;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
    }
}


public class nonPreemptivePriorityScheduling {
    public static void main(String[] args) {
        NPPSProcess[] NPPSProcesses = {
                new NPPSProcess(1, 3, 10),
                new NPPSProcess(2, 1, 1),
                new NPPSProcess(3, 3, 2),
                new NPPSProcess(4, 1, 1),
                new NPPSProcess(5, 2, 5),
        };

        Arrays.sort(NPPSProcesses, Comparator.comparingInt(r -> r.priority));

        int currentTime = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        System.out.println("ProcessId\tPriority\tBurst Time\tWaiting Time\tTurnaround Time");
        for (NPPSProcess NPPSProcess : NPPSProcesses) {
            NPPSProcess.waitingTime = currentTime;
            NPPSProcess.turnaroundTime = NPPSProcess.waitingTime + NPPSProcess.burstTime;
            totalWaitingTime += NPPSProcess.waitingTime;
            totalTurnaroundTime += NPPSProcess.turnaroundTime;
            System.out.println(NPPSProcess.id + "\t" + NPPSProcess.priority + "\t\t" + NPPSProcess.burstTime + "\t\t" + NPPSProcess.waitingTime + "\t\t" + NPPSProcess.turnaroundTime);
            currentTime += NPPSProcess.burstTime;
        }

        double averageWaitingTime = (double) totalWaitingTime / NPPSProcesses.length;
        double averageTurnaroundTime = (double) totalTurnaroundTime / NPPSProcesses.length;

        System.out.println("\nAverage Waiting Time: " + averageWaitingTime);
        System.out.println("Average Turnaround Time: " + averageTurnaroundTime);

    }

}
