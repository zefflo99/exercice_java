package ch.jobtrek;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Collections {

    /**
     * @param array Un tableau qui contient des chaînes de différentes longueurs
     * @param size La taille de la chaîne utilisée pour découper le tableau en morceaux
     * @return Un tableau contenant deux tableaux, l'un avec les chaînes inférieures et égales à la taille, et l'autre avec les chaînes plus longues que la taille, et l'autre avec les chaînes plus longues que la taille.
     * de la taille, et un autre avec les chaînes plus longues que la taille
     */
    public static List<List<String>> chunkArrayByStringSize(List<String> array, int size) {

        var petit = new ArrayList<String>();
        var grand = new ArrayList<String>();


        for (var element : array) {

            if (element.length() <size) {
                petit.add(element);
            }else {
                grand.add(element);
            }
        }
        return List.of(petit, grand); // Remplacer par votre code ici
    }

    /**
     * @param numbers A list of integers
     * @return A list containing the integers of the original list, without
     * duplicates, sorted by frequency of occurrence
     */
    public static List<Integer> frequencyOfApparition(List<Integer> numbers) {
        return List.of(); // Replace with your code here
    }

    /**
     * @param numbers A list, containing list of numbers
     * @return The sum of all numbers, but all odd numbers should be multiplied by two before sum
     * Should return zero if there is no numbers
     */
    public static Integer sumArrays(List<List<Integer>> numbers) {
        return 3; // Replace with your code here
    }

    /**
     * @param students A hashmap containing students name as key, and student grade as value
     * @return The student with the best grade in the map
     */
    public static String bestStudent(Map<String, Integer> students) {
        return ""; // Replace with your code here
    }
}