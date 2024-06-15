public class RecursiveBubbleSort {
    public void sort(int[] array, int n) {
        if (n == array.length) return;
        
        boolean hasChange = false;
        
        for (int i = 0; i < n; i++) {
            if (array[n] < array[i]) {
                int temp = array[n];
                array[n] = array[i];
                array[i] = temp;
                hasChange = true;
            }
        }

        if (!hasChange) return;

        sort(array, n++);

        return;
    }
}
