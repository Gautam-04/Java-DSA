package Aoa_Practical;

import java.util.Arrays;
import java.util.Map;

class Job{
    int deadline;
    int profit;

    public Job(int deadline,int profit){
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobProcess {
    public static void scheduleJobs(Job[] jobs){
        Arrays.sort(jobs,(a,b) -> b.profit - a.profit);
        int maxDeadline = 0;

        for(Job job:jobs){
            if(job.deadline > maxDeadline){
                maxDeadline = job.deadline;
            }
        }

        int[] result = new int[maxDeadline];
        boolean[] slots = new boolean[maxDeadline];
        Arrays.fill(result,-1);
        System.out.println("|Deadline|Profit|");

        for(Job job:jobs){
            for(int j = Math.min(maxDeadline-1,job.deadline-1); j >= 0;j--){
                if(!slots[j]){
                    result[j] = job.profit;
                    slots[j] = true;
                    break;
                }
            }
        }
        int totalProfit = 0;
        for(int i = 0; i<maxDeadline;i++){
            totalProfit += result[i];
            System.out.printf("|%d|%d|\n",i+1,result[i]);
        }

        System.out.println("Total profit is: " + totalProfit);
    }

    public static void main(String[] args) {
        Job[] jobs = {
                new Job(4, 70),
                new Job(2, 60),
                new Job(4, 50),
                new Job(3, 40),
                new Job(1, 30),
                new Job(1, 40),
        };

        System.out.println("Job Sequence with Deadlines:");
        scheduleJobs(jobs);

    }
}
