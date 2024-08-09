import java.io.*;
import java.nio.file.*;
public class TransactionProcessor {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\sathwika.kintali\\Desktop\\java\\Transaction.txt";
        String outputFile = "C:\\Users\\sathwika.kintali\\Desktop\\java\\Filtered_Transaction.txt";
        double thresholdAmount = 70000.00;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputFile));
             BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] transactionDetails = line.split(",");
                double transactionAmount = Double.parseDouble(transactionDetails[2]);
                if (transactionAmount > thresholdAmount) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
           e.printStackTrace();
        }
    }
}
