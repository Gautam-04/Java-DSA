package OS_PRACTICAL;
import java.util.*;
class SJFPreProcess {
    int id;
    int at;
    int bt;
    int startTime;
    int ct;
    int tat;
    int remainingTime;

    public SJFPreProcess(int id, int at, int bt) {
        this.id = id;
        this.at = at;
        this.bt = bt;
        this.remainingTime = bt;
    }
}

public class SJFPreemptive {

    public static void main(String[] args) {
        SJFPreProcess[] ps = {
                new SJFPreProcess(1, 0, 10),
                new SJFPreProcess(2, 0, 1),
                new SJFPreProcess(3, 0, 2),
                new SJFPreProcess(4, 0, 1),
                new SJFPreProcess(5, 0, 5),
        };
        int n = ps.length;

        double totalWaitingTime = 0, totalTAT = 0;

        System.out.println("\nProcess\tAT\tBT\tCT\tTAT\tWT");

        Arrays.sort(ps, Comparator.comparingInt(p -> p.at));

        int currentTime = 0;
        int completedProcesses = 0;

        while (completedProcesses < n) {
            int shortestRemainingTime = Integer.MAX_VALUE;
            int shortestIndex = -1;

            for (int i = 0; i < n; i++) {
                if (ps[i].at <= currentTime && ps[i].remainingTime > 0) {
                    if (ps[i].remainingTime < shortestRemainingTime) {
                        shortestRemainingTime = ps[i].remainingTime;
                        shortestIndex = i;
                    }
                }
            }

            if (shortestIndex != -1) {
                SJFPreProcess currentProcess = ps[shortestIndex];
                currentProcess.startTime = currentTime;
                currentTime += 1;
                currentProcess.remainingTime -= 1;
                if (currentProcess.remainingTime == 0) {
                    currentProcess.ct = currentTime;
                    currentProcess.tat = currentProcess.ct - currentProcess.at;
                    totalWaitingTime += currentProcess.tat - currentProcess.bt;
                    totalTAT += currentProcess.tat;
                    completedProcesses++;
                }
            } else {
                currentTime++;
            }
        }

        Arrays.sort(ps, Comparator.comparingInt(p -> p.id));
        for (SJFPreProcess p : ps) {
            System.out.println(p.id + "\t" + p.at + "\t" + p.bt + "\t" + p.ct + "\t" + p.tat + "\t" + (p.tat - p.bt));
        }

        System.out.println("Average Waiting Time: " + (totalWaitingTime / n));
        System.out.println("Average Turnaround Time: " + (totalTAT / n));
    }

}
