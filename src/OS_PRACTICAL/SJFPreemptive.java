package OS_PRACTICAL;
import java.util.Scanner;
class SJFPreProcess {
    int id;
    int arrivalTime;
    int burstTime;
    int startTime;
    int completionTime;
    int waitingTime;
    int turnaroundTime;
}

public class SJFPreemptive {
    public static void displayHeader() {
        System.out.println("\nProcess\tArrival Time\tBurst Time\tStart Time\tCompletion Time\tWaiting Time\tTurnaround Time");
    }

    public static void displayProcess(SJFPreProcess p) {
        System.out.println(p.id + "\t\t" + p.arrivalTime + "\t\t\t" + p.burstTime + "\t\t\t" +
                p.startTime + "\t\t\t" + p.completionTime + "\t\t\t" + p.waitingTime + "\t\t\t" + p.turnaroundTime);
    }

    public static void calculateAverages(SJFPreProcess[] SJFPreProcesses, double[] averages) {
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        for (SJFPreProcess p : SJFPreProcesses) {
            totalWaitingTime += p.waitingTime;
            totalTurnaroundTime += p.turnaroundTime;
        }
        averages[0] = (double) totalWaitingTime / SJFPreProcesses.length;
        averages[1] = (double) totalTurnaroundTime / SJFPreProcesses.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();

        SJFPreProcess[] SJFPreProcesses = new SJFPreProcess[n];

        System.out.println("Enter arrival time and burst time for each process:");
        for (int i = 0; i < n; i++) {
            System.out.print("Process " + (i + 1) + ": ");
            SJFPreProcesses[i] = new SJFPreProcess();
            SJFPreProcesses[i].id = i + 1;
            SJFPreProcesses[i].arrivalTime = scanner.nextInt();
            SJFPreProcesses[i].burstTime = scanner.nextInt();
        }

        int completed = 0;
        int currentTime = 0;

        while (completed < n) {
            int shortestIndex = -1;
            int shortestBurst = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (SJFPreProcesses[i].arrivalTime <= currentTime && SJFPreProcesses[i].burstTime < shortestBurst && SJFPreProcesses[i].burstTime > 0) {
                    shortestIndex = i;
                    shortestBurst = SJFPreProcesses[i].burstTime;
                }
            }

            if (shortestIndex == -1) {
                currentTime++;
                continue;
            }

            SJFPreProcess p = SJFPreProcesses[shortestIndex];
            p.startTime = currentTime;
            p.burstTime--;
            currentTime++;
            if (p.burstTime == 0) {
                p.completionTime = currentTime;
                p.waitingTime = p.startTime - p.arrivalTime;
                p.turnaroundTime = p.completionTime - p.arrivalTime;
                completed++;
            }
        }

        double[] averages = new double[2];
        displayHeader();
        for (SJFPreProcess p : SJFPreProcesses) {
            displayProcess(p);
        }
        calculateAverages(SJFPreProcesses, averages);
        System.out.println("\nAverage Waiting Time: " + averages[0]);
        System.out.println("Average Turnaround Time: " + averages[1]);

        scanner.close();
    }

}
