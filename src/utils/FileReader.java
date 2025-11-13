package utils;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {
    private final String baseFilePath = "src/inputs/";

    public String[] readLines(String fileName) {
        String filePath = baseFilePath + fileName;
        EArrayList<String> lines = new EArrayList<>();

        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().equals("Value")) {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }

        return lines.toArray(new String[0]);
    }
}
