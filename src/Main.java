import utils.FileReader;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        section("Aleatório", "aleatorio");
        section("Crescente", "crescente");
        section("Decrescente", "decrescente");
    }

    public static void section(String name, String baseFileName) {
        System.out.println("Section " + name);
        System.out.println("Base file name: " + baseFileName);
        FileReader fileReader = new FileReader();

        Integer[] set100 = fileReader.readLines(baseFileName + "_100.csv");
        Integer[] set1000 = fileReader.readLines(baseFileName + "_1000.csv");
        Integer[] set10000 = fileReader.readLines(baseFileName + "_10000.csv");

        OrderAndProgress orderAndProgress = new OrderAndProgress();

        long set100_start = System.nanoTime();
        orderAndProgress.BubbleSort(set100, 0);
        long set100_end = System.nanoTime();
        printMetrics("Tempo '"+name+"' 100 linhas", set100_start, set100_end);

        long set1000_start = System.nanoTime();
        orderAndProgress.BubbleSort(set1000, 0);
        long set1000_end = System.nanoTime();
        printMetrics("Tempo '"+name+"' 1000 linhas", set1000_start, set1000_end);

        long set10000_start = System.nanoTime();
        orderAndProgress.BubbleSort(set10000, 0);
        long set10000_end = System.nanoTime();
        printMetrics("Tempo '"+name+"' 10000 linhas", set10000_start, set10000_end);

        System.out.println("---");
    }

    private static void printMetrics(String label, long startNs, long endNs) {
        long elapsedNs = endNs - startNs;

        System.out.printf(
                "%s -> %d ns\n",
                label, elapsedNs
        );
    }
}