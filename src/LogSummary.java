import java.io.*;
import java.nio.file.*;
import java.util.*;

public class LogSummary {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\sathwika.kintali\\Desktop\\java\\logs.txt";
        String outputFile = "C:\\Users\\sathwika.kintali\\Desktop\\java\\log_summary.txt";
        Map<String, Integer> logLevelCounts = new HashMap<>();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputFile));
             BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] logEntry = line.split(",");
                String logLevel = logEntry[1];
                logLevelCounts.put(logLevel, logLevelCounts.getOrDefault(logLevel, 0) + 1);
            }
            for (Map.Entry<String, Integer> entry : logLevelCounts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
