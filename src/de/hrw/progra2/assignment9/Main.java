package de.hrw.progra2.assignment9;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {

        File myFile = new File("C:\\Users\\Dell\\Desktop\\gameData.csv");


        VideogameManager videogameManager = new VideogameManager();
        videogameManager.readFileBufferedWithEncoding(myFile, "windows-1252");
        System.out.println(videogameManager);

    }

}
