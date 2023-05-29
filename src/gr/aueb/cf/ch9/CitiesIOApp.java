package gr.aueb.cf.ch9;


import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Reads from a file with a data format:
 * country 1 city1 city2 city3...
 * country 2 city2 city3 city4...
 *
 * and writes each line in a different output file
 */
public class CitiesIOApp {
    public static void main(String[] args) {
        String line;
        String[] cities;
        File dir = new File("C:\\Users\\user1\\OneDrive\\Documents\\Txtfiles");


        if (!dir.exists()) {
            if (!dir.mkdir()) {
                System.err.println("Error in making dir");
                System.exit(1);
            }
        }

        try (BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\user1\\OneDrive\\Documents\\Txtfiles\\cities.txt"))) {
            while ((line = bf.readLine()) != null) {
                cities = line.split(" +");
                switch (cities[0]) {
                    case "Greece":
                        File grFile = new File(dir + "/" + cities[0].substring(0,2).toLowerCase() + ".txt");
                        PrintStream gr = new PrintStream(grFile, StandardCharsets.UTF_8);
                         print(gr, "GR Cities");
                         print(gr, cities);
                    case "USA":
                        File usaFile = new File(dir + "/" + cities[0].substring(0,2).toLowerCase() + ".txt");
                        PrintStream usa = new PrintStream(usaFile, StandardCharsets.UTF_8);
                        print(usa, "USA Cities");
                        print(usa, cities);
                    case "Germany":
                        File deFile = new File(dir + "/" + cities[0].substring(0,2).toLowerCase() + ".txt");
                        PrintStream de = new PrintStream(deFile, StandardCharsets.UTF_8);
                        print(de, "DE Cities");
                        print(de, cities);
                    default:
                        System.err.println("Error in cities");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void print(PrintStream ps, String message) {
        ps.println(message);
    }

    public static void print(PrintStream ps, String[] tokens) {
        for (int i = 1; i < tokens.length; i++) {
            ps.print(tokens[i] + " ");
        }

    }

}
