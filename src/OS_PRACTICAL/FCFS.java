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
        FCFSProcess[] ps = {
                new FCFSProcess(1, 0, 10),
                new FCFSProcess(2, 0, 1),
                new FCFSProcess(3, 0, 2),
                new FCFSProcess(4, 0, 1),
                new FCFSProcess(5, 0, 5),
        };

        double totalWaitingTime = 0, totalTAT = 0;

        System.out.println("\nProcess\tAT\tBT\tCT\tTAT\tWT");
        for (FCFSProcess p : ps) {
            p.starttime = (p == ps[0]) ? p.at : Math.max(p.at, ps[p.id - 2].ct);
            p.ct = p.starttime + p.bt;
            p.tat = p.ct - p.at;
            p.wt = p.tat - p.bt;

            totalTAT += p.tat;
            totalWaitingTime += p.wt;
            System.out.println(p.id + "\t" + p.at + "\t" + p.bt + "\t" + p.ct + "\t" + p.tat + "\t" + p.wt);
        }

        System.out.println("Average Waiting Time: " + (totalWaitingTime / ps.length));
        System.out.println("Average Turnaround Time: " + (totalTAT / ps.length));
    }
}
