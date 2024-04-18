import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            // Create FileReader and BufferedReader to read the input text file
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Create FileWriter and BufferedWriter to write the output text file
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Create a HashMap to store word frequencies
            Map<String, Integer> wordFrequencyMap = new HashMap<>();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\s+");

                // Update word frequency map
                for (String word : words) {
                    word = word.toLowerCase(); // Convert to lowercase to handle case-insensitive counts
                    wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                }
            }

            // Close the BufferedReader
            bufferedReader.close();

            // Write word frequencies to the output file
            for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
                bufferedWriter.write(entry.getKey() + ": " + entry.getValue());
                bufferedWriter.newLine();
            }

            // Close the BufferedWriter
            bufferedWriter.close();

            System.out.println("Word frequencies have been written to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
