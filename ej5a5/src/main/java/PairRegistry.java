import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Registro genérico de datos (nombre + cifra)
 * --------------------------------------------
 * Se desea implementar un sistema que permita asociar un nombre (por ejemplo, de una persona o producto)con una cifra numérica (por ejemplo, unidades vendidas, puntuación, ingresos...).
 *
 * Para ello se debe:
 * 1. Crear una clase Pair<T, U> que almacene dos valores relacionados: uno de tipo T (nombre), otro de tipo U (cifra).
 * 2. Crear una clase PairRegistry<T, U> que contenga una lista de objetos Pair<T, U> y permita las siguientes operaciones:
 *
 * - void addPair(T first, U second)
 *     → Añade una nueva pareja (nombre + cifra) al registro.
 *
 * - void printAll()
 *     → Muestra todas las parejas almacenadas en formato: nombre - cifra.
 *
 * - U getValueByKey(T key)
 *     → Devuelve la cifra asociada al nombre dado. Si no existe, devuelve null.
 *
 * - U sumValues()
 *     → Devuelve la suma total de todas las cifras. Solo funciona si U es Integer.
 *
 * EJEMPLO:
 * --------
 * PairRegistry<String, Integer> sales = new PairRegistry<>();
 * sales.addPair("Shirt", 20);
 * sales.addPair("Trousers", 15);
 * sales.addPair("Shoes", 30);
 *
 * sales.printAll();
 * System.out.println("Total sold: " + sales.sumValues());
 * System.out.println("Shirt sales: " + sales.getValueByKey("Shirt"));
 *
 * // Salida esperada:
 * // Shirt - 20
 * // Trousers - 15
 * // Shoes - 30
 * // Total sold: 65
 * // Shirt sales: 20
 */

public class PairRegistry<T, U> {

    // TODO: create a list to store Pair<T, U> objects
    List<Pair<T, U>> list;

    public PairRegistry() {
        // TODO: initialize the list
        list = new ArrayList<>();
    }

    // TODO: add a new Pair<T, U> to the list
    public void addPair(T first, U second) {
        list.add(new Pair<>(first, second));
    }

    // TODO: print all pairs in the format: name - value
    public void printAll() {
        for (Pair<T, U> pair : list) {
            System.out.println(pair.getFirst() + " - " + pair.getSecond());
        }
    }

    // TODO: find the value associated with the given key
    public U getValueByKey(T key) {
        for (Pair<T, U> pair : list) {
            if (pair.getFirst().equals(key)) {
                return pair.getSecond();
            }
        }
        return null;
    }

    // TODO: return the total sum if U is Integer, otherwise return null
    public Number sumValues() {
        int sum = 0;
        for (Pair<T, U> pair : list) {
            if (pair.getSecond() instanceof Number number) {
                sum += number.intValue();
            }
        }

        return sum;
    }

    // -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
/*    public static void main(String[] args) {
        PairRegistry<String, Integer> sales = new PairRegistry<>();
        sales.addPair("Shirt", 20);
        sales.addPair("Trousers", 15);
        sales.addPair("Shoes", 30);

        sales.printAll();
        System.out.println("Total sold: " + sales.sumValues());
        System.out.println("Shirt sales: " + sales.getValueByKey("Shirt"));
    }*/
    // Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
    // -------------------------------------------------------------
}