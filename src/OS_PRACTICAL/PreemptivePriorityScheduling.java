package OS_PRACTICAL;

import java.util.*;

class PPSProcess {
    int pid;
    int priority;
    int burstTime;
    int remainingTime;
    int waitingTime;
    int turnaroundTime;

    public PPSProcess(int pid, int priority, int burstTime) {
        this.pid = pid;
        this.priority = priority;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
    }
}


public class PreemptivePriorityScheduling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int numPPSProcesses = scanner.nextInt();

        List<PPSProcess> PPSProcesses = new ArrayList<>();
        for (int i = 1; i <= numPPSProcesses; i++) {
            System.out.print("Enter burst time for process " + i + ": ");
            int burstTime = scanner.nextInt();
            System.out.print("Enter priority for process " + i + ": ");
            int priority = scanner.nextInt();
            PPSProcesses.add(new PPSProcess(i, priority, burstTime));
        }

        preemptivePriorityScheduling(PPSProcesses);

        scanner.close();
    }

    public static void preemptivePriorityScheduling(List<PPSProcess> PPSProcesses) {
        int totalTime = 0;
        int completedPPSProcesses = 0;
        double avgWaitingTime = 0;
        double avgTurnaroundTime = 0;

        System.out.println("\nPreemptive Priority Scheduling:");
        System.out.println("PID\tPriority\tBurst Time\tWaiting Time\tTurnaround Time");

        while (completedPPSProcesses < PPSProcesses.size()) {
            PPSProcess selectedPPSProcess = null;
            int highestPriority = Integer.MAX_VALUE;

            for (PPSProcess PPSProcess : PPSProcesses) {
                if (PPSProcess.remainingTime > 0 && PPSProcess.priority < highestPriority) {
                    highestPriority = PPSProcess.priority;
                    selectedPPSProcess = PPSProcess;
                }
            }

            if (selectedPPSProcess == null) {
                totalTime++;
                continue;
            }

            selectedPPSProcess.remainingTime--;
            totalTime++;

            if (selectedPPSProcess.remainingTime == 0) {
                completedPPSProcesses++;
                selectedPPSProcess.turnaroundTime = totalTime;
                selectedPPSProcess.waitingTime = selectedPPSProcess.turnaroundTime - selectedPPSProcess.burstTime;
                avgWaitingTime += selectedPPSProcess.waitingTime;
                avgTurnaroundTime += selectedPPSProcess.turnaroundTime;

                System.out.println(selectedPPSProcess.pid + "\t" + selectedPPSProcess.priority + "\t\t" + selectedPPSProcess.burstTime + "\t\t" +
                        selectedPPSProcess.waitingTime + "\t\t" + selectedPPSProcess.turnaroundTime);
            }
        }

        avgWaitingTime /= PPSProcesses.size();
        avgTurnaroundTime /= PPSProcesses.size();
        System.out.println("\nAverage Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }

}
