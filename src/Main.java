import utils.FileReader;

public class Main {
    public static void main(String[] args) {
        section("Aleatório", "aleatorio");
        section("Crescente", "crescente");
        section("Decrescente", "decrescente");
    }

    public static void section(String name, String baseFileName) {
        System.out.println("Tipo '" + name + "':");
        FileReader fileReader = new FileReader();

        Integer[] set100 = fileReader.readLines(baseFileName + "_100.csv");
        Integer[] set1000 = fileReader.readLines(baseFileName + "_1000.csv");
        Integer[] set10000 = fileReader.readLines(baseFileName + "_10000.csv");

        OrderAndProgress orderAndProgress = new OrderAndProgress();

        System.out.println("\n> 100 Linhas");

        Integer[] bb_set100 = set100.clone();
        long bb_100_start = System.nanoTime();
        orderAndProgress.BubbleSort(bb_set100, 0);
        long bb_100_end = System.nanoTime();
        long bb_100_ns = printMetrics("BubbleSort   ", bb_100_start, bb_100_end);

        Integer[] insert_set100 = set100.clone();
        long insert_100_start = System.nanoTime();
        orderAndProgress.InsertionSort(insert_set100, 0);
        long insert_100_end = System.nanoTime();
        long insert_100_ns = printMetrics("InsertionSort", insert_100_start, insert_100_end);

        Integer[] quick_set100 = set100.clone();
        long quick_100_start = System.nanoTime();
        orderAndProgress.QuickSort(quick_set100, 0, quick_set100.length - 1);
        long quick_100_end = System.nanoTime();
        long quick_100_ns = printMetrics("QuickSort    ", quick_100_start, quick_100_end);

        System.out.println("\n> 1000 Linhas");

        Integer[] bb_set1000 = set1000.clone();
        long bb_1000_start = System.nanoTime();
        orderAndProgress.BubbleSort(bb_set1000, 0);
        long bb_1000_end = System.nanoTime();
        long bb_1000_ns = printMetrics("BubbleSort   ", bb_1000_start, bb_1000_end);

        Integer[] insert_set1000 = set1000.clone();
        long insert_1000_start = System.nanoTime();
        orderAndProgress.InsertionSort(insert_set1000, 0);
        long insert_1000_end = System.nanoTime();
        long insert_1000_ns = printMetrics("InsertionSort", insert_1000_start, insert_1000_end);

        Integer[] quick_set1000 = set1000.clone();
        long quick_1000_start = System.nanoTime();
        orderAndProgress.QuickSort(quick_set1000, 0, quick_set1000.length - 1);
        long quick_1000_end = System.nanoTime();
        long quick_1000_ns = printMetrics("QuickSort    ", quick_1000_start, quick_1000_end);

        System.out.println("\n> 10000 Linhas");

        Integer[] bb_set10000 = set1000.clone();
        long bb_10000_start = System.nanoTime();
        orderAndProgress.BubbleSort(bb_set10000, 0);
        long bb_10000_end = System.nanoTime();
        long bb_10000_ns = printMetrics("BubbleSort   ", bb_10000_start, bb_10000_end);

        Integer[] insert_set10000 = set1000.clone();
        long insert_10000_start = System.nanoTime();
        orderAndProgress.InsertionSort(insert_set10000, 0);
        long insert_10000_end = System.nanoTime();
        long insert_10000_ns = printMetrics("InsertionSort", insert_10000_start, insert_10000_end);

        Integer[] quick_set10000 = set1000.clone();
        long quick_10000_start = System.nanoTime();
        orderAndProgress.QuickSort(quick_set10000, 0, quick_set10000.length - 1);
        long quick_10000_end = System.nanoTime();
        long quick_10000_ns = printMetrics("QuickSort    ", quick_10000_start, quick_10000_end);

        System.out.println("\n------------------------------------------------------\n");
    }

    private static long printMetrics(String label, long startNs, long endNs) {
        long elapsedNs = endNs - startNs;
        double ms = (double) elapsedNs / 1_000_000;

        System.out.printf(
                "%-14s | %12d ns | %10.3f ms%n",
                label, elapsedNs, ms
        );

        return elapsedNs;
    }
}