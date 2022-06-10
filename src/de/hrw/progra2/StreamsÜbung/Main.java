package de.hrw.progra2.StreamsÜbung;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {

        File myFile = new File("C:\\Users\\Dell\\Desktop\\test.csv");

        Main main = new Main();
        main.readFileBufferedWithEncoding(myFile, StandardCharsets.UTF_8.name());

    }

    public void readFileBufferedWithEncoding(File file, String encoding){
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(file), encoding))) {
            // Read file line by line in given encoding
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
