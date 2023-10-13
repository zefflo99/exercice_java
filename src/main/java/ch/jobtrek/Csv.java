package ch.jobtrek;

import ch.jobtrek.sbb.Tunnel;
import ch.jobtrek.sbb.Tunnelable;

import java.io.File;
import java.net.URI;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Csv {

    /**
     * This method reads the CSV file, and parse each lines to create a list of objects that represent a tunnel.
     *
     * @param filePath The path to the CSV file
     * @return A List of objects that implements the Tunnelable interface. You need to create this special class.
     */
    public static List<Tunnelable> importCSVfile(URI filePath) {
        // Permet d'ouvrire un flux de ligne qui vient du CSV
        try (var file = Files.lines(Paths.get(filePath))) {
            // permet de ignorer le première ligne du fichier
            return file.skip(1)
                    // je divise chaque ligne en un tableau de chaine en utilisant ;
                    .map(line -> line.split(";"))
                    // je transforme les tableau en des objet tunnel
                    .map(line -> new Tunnel(
                            // j'utilise la deuxième colonne pour le nom du tunnel
                            line[1],
                            // j'utilise la troisième colonne pour la longueur
                            Double.parseDouble(line[2]) / 1000,
                            // j'utilise la quatrième colonne pour l'année de construction
                            Integer.parseInt(line[3]),
                            // j'utilise la neuvième colonne pour toute les autre information
                            line[8]
                    ))
                    //je collecte les objets tunnel qui est dans une liste
                    .collect(Collectors.toList());
            // si il y a une erreur
        } catch (IOException ex) {
            return List.of();
        }

    }


    /**
     * Sort the list of tunnels provided, and pick de 10 longest
     *
     * @param tunnels A List of tunnels
     * @return A List containing only the 10 longest tunnels
     */
    public static List<Tunnelable> tenLongestTunnels(List<Tunnelable> tunnels) {
        return tunnels.stream()
                .sorted(Comparator.comparing(Tunnelable::getKilometerLength, Comparator.reverseOrder()))
                .limit(10)
                .toList();

    }

    /**
     * @param tunnels List of tunnels
     * @return The computed average of the length of all tunnels
     */
    public static double computeAverageLength(List<Tunnelable> tunnels) {
        return 0; // Replace with your code here
    }

    /**
     * @param tunnels List of tunnels
     * @return A Map with the year as key and the number of tunnels as value
     */
    public static Map<Integer, Long> tunnelsByYears(List<Tunnelable> tunnels) {
        return Map.of(); // Replace with your code here
    }

    /**
     * @param tunnels List of tunnels
     * @return The year in which the most tunnels were built
     */
    public static int yearWithBiggestTunnelBuilds(List<Tunnelable> tunnels) {
        return 0; // Replace with your code here
    }

}