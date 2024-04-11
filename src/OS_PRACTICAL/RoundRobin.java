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
        Process[] ps = {
                new Process(1, 0, 10),
                new Process(2, 0, 1),
                new Process(3, 0, 2),
                new Process(4, 0, 1),
                new Process(5, 0, 5),
        };
        int n = ps.length;
        int timeQuantam = 1;
        System.out.print("The Time quantum required is: " + timeQuantam);

        double totalWaitingTime = 0, totalTAT = 0;
        int completedProcess = 0,current = 0;

        System.out.println("\nProcess\tAT\tBT\tCT\tTAT\tWT");
        while(completedProcess<n){
            for(Process p : ps){
                if(p.remainingTime > 0){
                    int slice = Math.min(p.remainingTime,timeQuantam);
                    current += slice;
                    p.remainingTime -= slice;

                    if(p.remainingTime == 0){
                        p.completionTime = current;
                        int tat = current - p.arrivalTime;
                        int wt = tat - p.burstTime;
                        totalTAT += tat;
                        totalWaitingTime += wt;
                        completedProcess++;
                    }
                }
            }
        }

        for (Process p : ps) {
            int turnaroundTime = p.completionTime - p.arrivalTime;
            int waitingTime = turnaroundTime - p.burstTime;
            System.out.println(p.id + "\t" + p.arrivalTime + "\t"
                    + p.burstTime + "\t" + p.completionTime + "\t"
                    + turnaroundTime + "\t" + waitingTime);
        }

        System.out.println("Average Waiting Time: " + (totalWaitingTime / ps.length));
        System.out.println("Average Turnaround Time: " + (totalTAT / ps.length));
    }

}
