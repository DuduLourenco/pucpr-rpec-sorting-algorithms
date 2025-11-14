import utils.FileReader;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        section("Aleatório", "aleatorio");
        section("Crescente", "crescente");
        section("Decrescente", "decrescente");

        OrderAndProgress orderAndProgress = new OrderAndProgress();

        Integer[] teste = {7,2,12,8,3};

        orderAndProgress.InsertionSort(teste, 0);
    }

    public static void section(String name, String baseFileName) {
        System.out.println("Section " + name);
        System.out.println("Base file name: " + baseFileName);
        FileReader fileReader = new FileReader();

        Integer[] set100 = fileReader.readLines(baseFileName + "_100.csv");
        Integer[] set1000 = fileReader.readLines(baseFileName + "_1000.csv");
        Integer[] set10000 = fileReader.readLines(baseFileName + "_10000.csv");

        OrderAndProgress orderAndProgress = new OrderAndProgress();

        System.out.println("> 100 Linhas");

        long bb_100_start = System.nanoTime();
        orderAndProgress.BubbleSort(set100, 0);
        long bb_100_end = System.nanoTime();
        long bb_100_ns = printMetrics("BubbleSort   ", bb_100_start, bb_100_end);

        long insert_100_start = System.nanoTime();
        orderAndProgress.InsertionSort(set100, 0);
        long insert_100_end = System.nanoTime();
        long insert_100_ns = printMetrics("InsertionSort", insert_100_start, insert_100_end);

        System.out.println("\n> 1000 Linhas");

        long bb_1000_start = System.nanoTime();
        orderAndProgress.BubbleSort(set1000, 0);
        long bb_1000_end = System.nanoTime();
        long bb_1000_ns = printMetrics("BubbleSort   ", bb_1000_start, bb_1000_end);

        long insert_1000_start = System.nanoTime();
        orderAndProgress.InsertionSort(set1000, 0);
        long insert_1000_end = System.nanoTime();
        long insert_1000_ns = printMetrics("InsertionSort", insert_1000_start, insert_1000_end);

        System.out.println("\n> 10000 Linhas");

        long bb_10000_start = System.nanoTime();
        orderAndProgress.BubbleSort(set10000, 0);
        long bb_10000_end = System.nanoTime();
        long bb_10000_ns = printMetrics("BubbleSort   ", bb_10000_start, bb_10000_end);

        long insert_10000_start = System.nanoTime();
        orderAndProgress.InsertionSort(set10000, 0);
        long insert_10000_end = System.nanoTime();
        long insert_10000_ns = printMetrics("InsertionSort", insert_10000_start, insert_10000_end);

        System.out.println("---");
    }

    private static long printMetrics(String label, long startNs, long endNs) {
        long elapsedNs = endNs - startNs;

        System.out.printf(
                "%s -> %d ns\n",
                label, elapsedNs
        );

        return elapsedNs;
    }
}