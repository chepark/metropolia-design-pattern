import java.util.Random;

public class Sorting {
    public static void main(String[] args) {
        int smallSize = 30;
        int largeSize = 100000;
        Random random = new Random();

        // Initialize arrays
        int[] smallArray = new int[smallSize];
        int[] largeArray = new int[largeSize];

        // Fill arrays with random numbers
        for (int i = 0; i < smallSize; i++) {
            smallArray[i] = random.nextInt(smallSize);
        }
        for (int i = 0; i < largeSize; i++) {
            largeArray[i] = random.nextInt(largeSize);
        }

        // Sorting strategies
        Sortable bubbleSort = new BubbleSort();
        Sortable selectionSort = new SelectionSort();
        Sortable mergeSort = new MergeSort();

        // Sort small array
        testSortingStrategy(bubbleSort, smallArray.clone(), "Bubble Sort", "small");
        testSortingStrategy(selectionSort, smallArray.clone(), "Selection Sort", "small");
        testSortingStrategy(mergeSort, smallArray.clone(), "Merge Sort", "small");

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Sorting large arrays...");
        System.out.println("--------------------------------------------------------------------------");

        // Sort large array
        testSortingStrategy(bubbleSort, largeArray.clone(), "Bubble Sort", "large");
        testSortingStrategy(selectionSort, largeArray.clone(), "Selection Sort", "large");
        testSortingStrategy(mergeSort, largeArray.clone(), "Merge Sort", "large");


        System.out.println("DONE!");
    }

    private static void testSortingStrategy(Sortable strategy, int[] array, String strategyName, String arraySize) {
        long startTime = System.currentTimeMillis();
        strategy.sort(array);
        long endTime = System.currentTimeMillis();
        System.out.println(strategyName + " with " + arraySize + " array took " + (endTime - startTime) + " milliseconds.");
    }
}
