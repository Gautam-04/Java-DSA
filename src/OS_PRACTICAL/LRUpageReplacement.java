package OS_PRACTICAL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class LRUpageReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of frames: ");
        int frames = scanner.nextInt();

        System.out.print("Enter the reference string: ");
        String[] references = scanner.next().split(" ");

        int[] hitsMisses = lruPageReplacement(frames, references);
        System.out.println("No. of hits = " + hitsMisses[0]);
        System.out.println("No. of misses = " + hitsMisses[1]);
    }

    public static int[] lruPageReplacement(int frames, String[] references) {
        int hits = 0;
        int misses = 0;
        LinkedHashMap<String, Integer> pageTable = new LinkedHashMap<>(frames, 0.75f, true);

        for (String ref : references) {
            if (pageTable.containsKey(ref)) {
                hits++;
                // Update the access order by removing and re-inserting the entry
                pageTable.remove(ref);
                pageTable.put(ref, null);
            } else {
                if (pageTable.size() == frames) {
                    // Remove the least recently used page
                    String lruKey = pageTable.entrySet().iterator().next().getKey();
                    pageTable.remove(lruKey);
                }
                pageTable.put(ref, null);
                misses++;
            }
        }

        return new int[]{hits, misses};
    }
}
