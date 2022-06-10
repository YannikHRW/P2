package de.hrw.progra2.assignment9;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VideogameManager {

    List<Videogame> videogames = new ArrayList<>();


    private List<String> getFields(String line, char seperator) {

        List<String> fields = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();

        boolean openingString = false;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '"') {
                openingString = !openingString;
            }
            if (openingString) {
                stringBuilder.append(line.charAt(i));
            } else {

                if (i == line.length() - 1) {
                    if (line.charAt(i) == seperator) {
                        fields.add("");
                        fields.add("");
                    } else {
                        stringBuilder.append(line.charAt(i));
                        fields.add(String.valueOf(stringBuilder));
                        stringBuilder.delete(0, stringBuilder.length());
                    }
                } else if (line.charAt(i) == seperator) {
                    fields.add(String.valueOf(stringBuilder));
                    stringBuilder.delete(0, stringBuilder.length());
                } else {
                    stringBuilder.append(line.charAt(i));
                }
            }
        }
        return fields;
    }

    public void readFileBufferedWithEncoding(File file, String encoding) {

        try (LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream(file), encoding))) {

            String line;

            while ((line = reader.readLine()) != null) {
                if (reader.getLineNumber() > 1) {

                    List<String> gameFields = getFields(line, ',');
                    List<String> pubFields = getFields(gameFields.get(1), ';');

                    if (gameFields.size() == 3) {

                        videogames.add(new Videogame(gameFields.get(0), pubFields, gameFields.get(2)));

                    } else {
                        System.err.println("Cannot parse line" + reader.getLineNumber() + ".");
                    }

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Videogame videogame : videogames) {
            stringBuilder.append(videogame.getName() + videogame.getDeveloperStudios() + videogame.getPubDate() + "\n");
        }
        return String.valueOf(stringBuilder);
    }
}
