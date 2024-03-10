public class BubbleSort implements Sortable{
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1]) {
                    // swap temp and arr[i]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }
}
