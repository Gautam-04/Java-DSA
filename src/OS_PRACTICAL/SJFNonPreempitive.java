package OS_PRACTICAL;
import java.util.Arrays;
import java.util.Scanner;


class SJFnonProcess{
    int id;
    int arrivalTime;
    int burstTime;
    int startTime;
    int completionTime;
    int waitingTime;
    int turnaroundTime;

}

public class SJFNonPreempitive {
    public static void sort(SJFnonProcess[] processes) {
        Arrays.sort(processes, (p1, p2) -> p1.arrivalTime - p2.arrivalTime);
    }

    public static void displayHeader() {
        System.out.println("\nProcess\tArrival Time\tBurst Time\tStart Time\tCompletion Time\tWaiting Time\tTurnaround Time");
    }

    public static void displayProcess(SJFnonProcess p) {
        System.out.println(p.id + "\t\t" + p.arrivalTime + "\t\t\t" + p.burstTime + "\t\t\t" +
                p.startTime + "\t\t\t" + p.completionTime + "\t\t\t" + p.waitingTime + "\t\t\t" + p.turnaroundTime);
    }

    public static void calculateAverages(SJFnonProcess[] processes, double[] averages) {
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        for (SJFnonProcess p : processes) {
            totalWaitingTime += p.waitingTime;
            totalTurnaroundTime += p.turnaroundTime;
        }
        averages[0] = (double) totalWaitingTime / processes.length;
        averages[1] = (double) totalTurnaroundTime / processes.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();

        SJFnonProcess[] processes = new SJFnonProcess[n];

        System.out.println("Enter arrival time and burst time for each process:");
        for (int i = 0; i < n; i++) {
            System.out.print("Process " + (i + 1) + ": ");
            processes[i] = new SJFnonProcess();
            processes[i].id = i + 1;
            processes[i].arrivalTime = scanner.nextInt();
            processes[i].burstTime = scanner.nextInt();
        }

        sort(processes);

        int currentTime = 0;
        for (SJFnonProcess p : processes) {
            p.startTime = currentTime;
            p.completionTime = currentTime + p.burstTime;
            p.waitingTime = p.startTime - p.arrivalTime;
            p.turnaroundTime = p.completionTime - p.arrivalTime;
            currentTime = p.completionTime;
        }

        double[] averages = new double[2];
        displayHeader();
        for (SJFnonProcess p : processes) {
            displayProcess(p);
        }
        calculateAverages(processes, averages);
        System.out.println("\nAverage Waiting Time: " + averages[0]);
        System.out.println("Average Turnaround Time: " + averages[1]);

        scanner.close();
    }

}
