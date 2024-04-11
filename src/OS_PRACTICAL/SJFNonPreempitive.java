package OS_PRACTICAL;
import java.util.*;



class SJFnonProcess{
    int id;
    int at;
    int bt;
    int startTime;
    int ct;
    int tat;

    public SJFnonProcess(int id,int at,int bt){
        this.id = id;
        this.at = at;
        this.bt = bt;
    }
}

public class SJFNonPreempitive {

    public static void main(String[] args) {
        SJFnonProcess[] ps = {
                new SJFnonProcess(1, 0, 10),
                new SJFnonProcess(2, 0, 1),
                new SJFnonProcess(3, 0, 2),
                new SJFnonProcess(4, 0, 1),
                new SJFnonProcess(5, 0, 5),
        };
        int n = ps.length;

        double totalWaitingTime = 0, totalTAT = 0;

        System.out.println("\nProcess\tAT\tBT\tCT\tTAT\tWT");
        Arrays.sort(ps, Comparator.comparingInt(p -> p.bt));

        int currentTime = 0;
        for (SJFnonProcess p : ps) {
            p.startTime = Math.max(p.at, currentTime);
            p.ct = p.startTime + p.bt;
            p.tat = p.ct - p.at;
            currentTime = p.ct;
            totalTAT += p.tat;
            totalWaitingTime += p.tat - p.bt;
        }

        Arrays.sort(ps,Comparator.comparing(p->p.id));

        for (SJFnonProcess p : ps) {
            System.out.println(p.id + "\t" + p.at + "\t" + p.bt + "\t" + p.ct + "\t" + p.tat + "\t" + (p.tat - p.bt));
        }


        System.out.println("Average Waiting Time: " + (totalWaitingTime / ps.length));
        System.out.println("Average Turnaround Time: " + (totalTAT / ps.length));
    }

}
