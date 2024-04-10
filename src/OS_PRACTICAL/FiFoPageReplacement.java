package OS_PRACTICAL;

import java.util.*;

public class FiFoPageReplacement {
    public static int[] fifoPageReplacement(int frames, List<Integer> references) {
        int hits = 0;
        int misses = 0;
        List<Integer> queue = new ArrayList<>();
        Set<Integer> pageTable = new HashSet<>();

        for (Integer ref : references) {
            if (pageTable.contains(ref)) {
                hits++;
            } else {
                if (queue.size() == frames) {
                    int removedPage = queue.remove(0);
                    pageTable.remove(removedPage);
                }
                queue.add(ref);
                pageTable.add(ref);
                misses++;
            }
        }

        return new int[]{hits, misses};
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of frames: ");
        int frames = scanner.nextInt();

        // Consume the newline character
        scanner.nextLine();

        System.out.print("Enter the reference string (space-separated): ");
        String[] referencesArray = scanner.nextLine().trim().split("\\s+");

        List<Integer> references = new ArrayList<>();
        for (String ref : referencesArray) {
            references.add(Integer.parseInt(ref));
        }

        int[] result = fifoPageReplacement(frames, references);
        int hits = result[0];
        int misses = result[1];

        System.out.println("No. of hits = " + hits);
        System.out.println("No. of misses = " + misses);
    }
}
