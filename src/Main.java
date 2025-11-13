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

        String[] set100 = fileReader.readLines(baseFileName + "_100.csv");
        String[] set1000 = fileReader.readLines(baseFileName + "_1000.csv");
        String[] set10000 = fileReader.readLines(baseFileName + "_10000.csv");

        System.out.println(set100.length);
        System.out.println(set1000.length);
        System.out.println(set10000.length);

        System.out.println("---");
    }
}