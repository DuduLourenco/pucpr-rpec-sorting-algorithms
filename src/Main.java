import utils.FileReader;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        String[] aleatorio_100 = fileReader.readLines("aleatorio_100.csv");

        for (String line : aleatorio_100) {
            //TODO: fazer algo
        }
    }
}