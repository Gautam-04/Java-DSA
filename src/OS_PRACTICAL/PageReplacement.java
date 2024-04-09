package OS_PRACTICAL;

import java.util.*;

public class PageReplacement {
    public static int fifoPageReplacement(int frames, int[] references) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> pageTable = new HashSet<>();
        int misses = 0;

        for (int ref : references) {
            if (pageTable.contains(ref)) {
                continue;
            } else {
                if (queue.size() == frames) {
                    int removedPage = queue.poll();
                    pageTable.remove(removedPage);
                }
                queue.offer(ref);
                pageTable.add(ref);
                misses++;
            }
        }
        return misses;
    }

    public static int optimalPageReplacement(int frames, int[] references) {
        List<Integer> pageTable = new ArrayList<>();
        int misses = 0;

        for (int ref : references) {
            if (pageTable.contains(ref)) {
                continue;
            } else {
                if (pageTable.size() == frames) {
                    List<int[]> future = Arrays.asList(references).subList(Arrays.asList(references).indexOf(pageTable.get(pageTable.size() - 1)) + 1, references.length);
                    Integer toRemove = null;
                    for (int p : pageTable) {
                        if (!future.contains(p)) {
                            toRemove = p;
                            break;
                        }
                    }
                    pageTable.remove(toRemove);
                }
                pageTable.add(ref);
                misses++;
            }
        }
        return misses;
    }

    public static int lruPageReplacement(int frames, int[] references) {
        LinkedHashMap<Integer, Integer> pageTable = new LinkedHashMap<>(frames, 0.75f, true);
        int misses = 0;

        for (int ref : references) {
            if (pageTable.containsKey(ref)) {
                continue;
            } else {
                pageTable.put(ref, null);
                misses++;
            }
        }
        return misses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of frames: ");
        int frames = scanner.nextInt();
        System.out.print("Enter the reference string: ");
        String[] referencesString = scanner.next().split("\\s+");
        int[] references = Arrays.stream(referencesString).mapToInt(Integer::parseInt).toArray();
        scanner.close();

        System.out.println("FIFO Page Replacement:");
        System.out.println("No. of misses = " + fifoPageReplacement(frames, references));

        System.out.println("\nOptimal Page Replacement:");
        System.out.println("No. of misses = " + optimalPageReplacement(frames, references));

        System.out.println("\nLRU Page Replacement:");
        System.out.println("No. of misses = " + lruPageReplacement(frames, references));
    }
}


