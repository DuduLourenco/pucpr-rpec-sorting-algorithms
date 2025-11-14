public class OrderAndProgress {
    public void BubbleSort(Integer[] array, Integer count) {
        if (count == array.length) {
            return;
        }

        for (int i = 0; i < array.length - count; i++) {
            if (i >= array.length - count - 1) {
                BubbleSort(array, count + 1);
            } else {
                Integer current = array[i];
                Integer next = array[i + 1];

                if (current > next) {
                    array[i + 1] = current;
                    array[i] = next;
                }
            }
        }
    }

    public void InsertionSort(Integer[] array, Integer count) {
        if (count == array.length - 1) {
            return;
        }

        Integer picked = array[count + 1];
        for (int i = count; i >= 0; i--) {
            Integer current = array[i];

            if (current > picked) {
                array[i] = picked;
                array[i + 1] = current;
            }
        }

        InsertionSort(array, count + 1);
    }

    public void QuickSort(Integer[] array) {}
}
