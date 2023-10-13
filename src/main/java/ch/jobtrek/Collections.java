package ch.jobtrek;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
     /* @param nombres Une liste d'entiers
     * @return Une liste contenant les entiers de la liste originale, sans les doublons, triée par fréquence d'occurrence
     * doublons, triés par fréquence d'occurrence
     */

    public static List<Integer> frequencyOfApparition(List<Integer> numbers) {
        // Créez une carte pour stocker la fréquence d'occurrence de chaque nombre
        Map<Integer, Long> frequencyMap = numbers.stream()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

        // Créez une liste d'entiers en triant par fréquence d'occurrence, puis par valeur
        List<Integer> result = numbers.stream()
                .distinct() // Élimine les doublons
                .sorted(Comparator.comparingLong((Integer a) -> frequencyMap.get(a)).thenComparingInt(a -> a))
                .collect(Collectors.toList());

        return result;



    }

    /**
     * @param numbers Une liste, contenant une liste de nombres
     * @return La somme de tous les nombres, mais tous les nombres impairs doivent être multipliés par deux avant la somme.
     * La somme doit retourner zéro s'il n'y a pas de nombres.
     */
    public static Integer sumArrays(List<List<Integer>> numbers) {
        var sortie = 0;
        for (var a : numbers) {
            for (var b:a) {
                if (b%2==1) {
                    sortie += 2*b;
                }
                else {
                    sortie += b;
                }
            }
        }
        return sortie;
    }

    /**
     * @param students A hashmap containing students name as key, and student grade as value
     * @return The student with the best grade in the map
     */
    public static String bestStudent(Map<String, Integer> students) {
        return ""; // Replace with your code here
    }
}