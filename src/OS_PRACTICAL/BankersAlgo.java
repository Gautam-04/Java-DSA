package OS_PRACTICAL;
import java.util.Arrays;
public class BankersAlgo {
    public static void main(String[] args) {
        int n = 5; // Number of processes
        int m = 3; // Number of resources

        // Allocation Matrix
        int[][] alloc = {
                {0, 1, 0},
                {2, 0, 0},
                {3, 0, 2},
                {2, 1, 1},
                {0, 0, 2}
        };

        // MAX Matrix
        int[][] max = {
                {7, 5, 3},
                {3, 2, 2},
                {9, 0, 2},
                {2, 2, 2},
                {4, 3, 3}
        };

        int[] avail = {3, 3, 2}; // Available Resources
        int[] f = new int[n];
        int[] ans = new int[n];
        int ind = 0;

        for (int k = 0; k < n; k++)
            f[k] = 0;

        int[][] need = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                need[i][j] = max[i][j] - alloc[i][j];

        int y = 0;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                if (f[i] == 0) {
                    boolean flag = true;
                    for (int j = 0; j < m; j++) {
                        if (need[i][j] > avail[j]) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        ans[ind++] = i;
                        for (int z = 0; z < m; z++)
                            avail[z] += alloc[i][z];
                        f[i] = 1;
                    }
                }
            }
        }

        System.out.println("Following is the SAFE Sequence");
        for (int i = 0; i < n - 1; i++)
            System.out.print(" P" + ans[i] + " ->");
        System.out.print(" P" + ans[n - 1]);
    }
}
