/**
 * Generic Pair class
 * ------------------
 * Represents a pair of values: one of type T and another of type U.
 *
 * This class is used by PairRegistry to associate a name (e.g., String) with a number (e.g., Integer).
 */

public class Pair<T, U> {
    public T first;
    public U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    // TODO: declare two public attributes named 'first' and 'second'

    // TODO: implement a constructor that takes two parameters (first and second) and assigns them
}
