public class IterationBubbleSort {
    public void sort(int[] array) {
        boolean hasChange;
        for (int i = 0; i < array.length; i++) {
            hasChange = false;

            for (int j = i; j < array.length - 1; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    hasChange = true;
                }
            }

            if (!hasChange) {
                return;
            }
        }

        return;
    }
}
