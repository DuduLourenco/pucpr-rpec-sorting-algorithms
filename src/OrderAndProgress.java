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
                break;
            }
        }

        InsertionSort(array, count + 1);
    }


    public void QuickSort(Integer[] array, int initialIndex, int finalIndex) {
        if  (initialIndex > array.length - 1) {
            return;
        }

        Integer pivot = array[finalIndex];
        int lastLowestIndex = initialIndex;

        for (int i = initialIndex; i < finalIndex; i++) {
            Integer current = array[i];

            if (current < pivot) {
                array[i] = array[lastLowestIndex];
                array[lastLowestIndex] = current;
                lastLowestIndex++;
            }
        }

        array[finalIndex] = array[lastLowestIndex];
        array[lastLowestIndex] = pivot;

        if (lastLowestIndex < finalIndex) {
            //direita
            QuickSort(array, lastLowestIndex + 1, finalIndex);
        }

        if(initialIndex < lastLowestIndex) {
            //esquerda
            QuickSort(array, initialIndex, lastLowestIndex - 1);
        }
    }
}
