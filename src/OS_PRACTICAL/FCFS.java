package OS_PRACTICAL;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class FCFSProcess {
    int id, at, bt, starttime, ct, wt, tat;

    public FCFSProcess(int id, int at, int bt) {
        this.id = id;
        this.at = at;
        this.bt = bt;
    }
}

public class FCFS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of processes: ");
        int n = in.nextInt();

        FCFSProcess[] FCFSProcesses = new FCFSProcess[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the arrival time and burst time for process " + (i + 1) + ": ");
            int at = in.nextInt();
            int bt = in.nextInt();
            FCFSProcesses[i] = new FCFSProcess(i + 1, at, bt);
        }

        Arrays.sort(FCFSProcesses, Comparator.comparingInt(o -> o.at));

        double totalWaitingTime = 0, totalTurnaroundTime = 0;
        System.out.println("\nPROCESS\tAT\tBT\tCT\tTAT\tWT");
        for (FCFSProcess p : FCFSProcesses) {
            p.starttime = (p == FCFSProcesses[0]) ? p.at : Math.max(p.at, FCFSProcesses[p.id - 2].ct);
            p.ct = p.starttime + p.bt;
            p.tat = p.ct - p.at;
            p.wt = p.tat - p.bt;

            totalTurnaroundTime += p.tat;
            totalWaitingTime += p.wt;

            System.out.println(p.id + "\t" + p.at + "\t" + p.bt + "\t" + p.ct + "\t" + p.tat + "\t" + p.wt);
        }

        System.out.println("Average Waiting Time: " + (totalWaitingTime / n));
        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / n));
    }
}
