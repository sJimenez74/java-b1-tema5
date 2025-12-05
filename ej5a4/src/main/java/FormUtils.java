import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Procesamiento de respuestas en un sistema de formularios de usuario
 * --------------------------------------------------------------------
 * Una empresa tecnológica gestiona una plataforma online con múltiples formularios
 * (registro, encuestas, feedback, etc.). Para analizar las respuestas introducidas por
 * los usuarios, el equipo de desarrollo quiere crear una clase llamada FormUtils con
 * métodos genéricos reutilizables.
 *
 * Se deben implementar los siguientes métodos:
 *
 * 1. <T> boolean contains(T[] array, T value)
 *    Devuelve true si el valor está presente en el array.
 *
 * 2. <T> int countItems(T[] array)
 *    Devuelve el número total de elementos del array.
 *
 * 3. <T> boolean areEqual(T value1, T value2)
 *    Devuelve true si ambos valores son iguales (equals).
 *
 * 4. <T> int countOccurrences(T[] array, T value)
 *    Devuelve cuántas veces aparece un valor dentro del array.
 *
 * 5. <T> List<T> removeNulls(T[] array)
 *    Devuelve una nueva lista sin valores null del array original.
 *
 * EJEMPLO:
 * --------
 * String[] languages = {"Java", "Python", "C++"};
 * System.out.println(FormUtils.contains(languages, "Python"));           // true
 *
 * String[] ratings = {"good", "very good", "excellent"};
 * System.out.println(FormUtils.countItems(ratings));                     // 3
 *
 * System.out.println(FormUtils.areEqual("pass123", "pass123"));         // true
 *
 * String[] votes = {"yes", "no", "yes", "maybe", "yes"};
 * System.out.println(FormUtils.countOccurrences(votes, "yes"));         // 3
 *
 * String[] responses = {"ok", null, "ok", "skip", null};
 * System.out.println(FormUtils.removeNulls(responses));                 // [ok, ok, skip]
 */

public class FormUtils {

    public static <T> boolean contains(T[] array, T value) {
        // TODO: return true if value is in array
        for (T element : array) {
            if (Objects.equals(element, value)) return true;
        }
        return false;
    }

    public static <T> int countItems(T[] array) {
        // TODO: return the total number of items in array
        return array.length;
    }

    public static <T> boolean areEqual(T value1, T value2) {
        // TODO: return true if value1 and value2 are equal
        return Objects.equals(value1, value2);
    }

    public static <T> int countOccurrences(T[] array, T value) {
        // TODO: return how many times value appears in array
        int times = 0;
        for (T element : array) {
            if (Objects.equals(element, value)) times++;
        }
        return times;
    }

    public static <T> List<T> removeNulls(T[] array) {
        // TODO: return a new list excluding all null values
        List<T> noNull = new ArrayList<>();
        for (T element : array) {
            if (element != null) noNull.add(element);
        }
        return noNull;
    }

    // -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
/*    public static void main(String[] args) {
        String[] languages = {"Java", "Python", "C++"};
        System.out.println(FormUtils.contains(languages, "Python")); // true

        String[] ratings = {"good", "very good", "excellent"};
        System.out.println(FormUtils.countItems(ratings));           // 3

        System.out.println(FormUtils.areEqual("pass123", "pass123")); // true

        String[] votes = {"yes", "no", "yes", "maybe", "yes"};
        System.out.println(FormUtils.countOccurrences(votes, "yes")); // 3

        String[] responses = {"ok", null, "ok", "skip", null};
        System.out.println(FormUtils.removeNulls(responses)); // [ok, ok, skip]
    }*/
	// Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
	// -------------------------------------------------------------
}
