package OS_PRACTICAL;
import java.util.*;
public class EXP_10 {
        public static void fifo(int[] pages, int capacity) {
            int[] set = new int[capacity];
            int faults = 0;
            int rear = 0;
            Arrays.fill(set, -1);
            for (int i = 0; i < pages.length; i++) {
                boolean found = false;
                for (int j = 0; j < capacity; j++) {
                    if (set[j] == pages[i]) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    set[rear] = pages[i];
                    rear = (rear + 1) % capacity;
                    faults++;
                }
            }
            int hits = pages.length - faults;
            System.out.println("FIFO: Hits = " + hits + ", Faults = " + faults);
        }

        public static void lru(int[] pages, int capacity) {
            int[] cache = new int[capacity];
            int[] counters = new int[capacity];
            int faults = 0;
            Arrays.fill(cache, -1);
            for (int i = 0; i < pages.length; i++) {
                boolean found = false;
                for (int j = 0; j < capacity; j++) {
                    if (cache[j] == pages[i]) {
                        found = true;
                        counters[j] = i + 1;
                        break;
                    }
                }
                if (!found) {
                    int min = Integer.MAX_VALUE;
                    int replaceIndex = -1;
                    for (int j = 0; j < capacity; j++) {
                        if (counters[j] < min) {
                            min = counters[j];
                            replaceIndex = j;
                        }
                    }
                    cache[replaceIndex] = pages[i];
                    counters[replaceIndex] = i + 1;
                    faults++;
                }
            }
            int hits = pages.length - faults;
            System.out.println("LRU: Hits = " + hits + ", Faults = " + faults);
        }

        public static void optimal(int[] references, int frames) {
            int hits = 0;
            int misses = 0;
            ArrayList<Integer> pageTable = new ArrayList<>();

            for (int ref : references) {
                if (pageTable.contains(ref)) {
                    hits++;
                    pageTable.remove((Integer) ref);
                    pageTable.add(ref);
                } else {
                    if (pageTable.size() == frames) {
                        ArrayList<Integer> future = new ArrayList<>();
                        for (int i = pageTable.size(); i < references.length; i++) {
                            future.add(references[i]);
                        }
                        Integer toRemove = null;
                        for (Integer p : pageTable) {
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

            System.out.println("Optimal: Hits = " + hits + ", Faults = " + misses);
        }

        public static void main(String[] args) {
            int[] pages = {2,3,4,2,3,5,3,5,7,8,3,1};
            int capacity = 3;
            fifo(pages, capacity);
            lru(pages, capacity);
            optimal(pages, capacity);
        }
}
