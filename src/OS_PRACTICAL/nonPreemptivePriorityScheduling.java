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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int numNPPSProcesses = scanner.nextInt();
        List<NPPSProcess> NPPSProcesses = new ArrayList<>();

        for (int i = 0; i < numNPPSProcesses; i++) {
            System.out.println("Enter details for process " + (i + 1) + ":");
            System.out.print("Priority: ");
            int priority = scanner.nextInt();
            System.out.print("Burst Time: ");
            int burstTime = scanner.nextInt();
            NPPSProcesses.add(new NPPSProcess((i+1), priority, burstTime));
        }

        Collections.sort(NPPSProcesses, Comparator.comparingInt(p -> p.priority));

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

        double averageWaitingTime = (double) totalWaitingTime / NPPSProcesses.size();
        double averageTurnaroundTime = (double) totalTurnaroundTime / NPPSProcesses.size();

        System.out.println("\nAverage Waiting Time: " + averageWaitingTime);
        System.out.println("Average Turnaround Time: " + averageTurnaroundTime);

        scanner.close();
    }

}
