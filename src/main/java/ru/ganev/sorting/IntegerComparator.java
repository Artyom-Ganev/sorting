package ru.ganev.sorting;

/**
 * Functional Interface for integers comparision
 *
 * @author Ganev Artyom
 */
@FunctionalInterface
public interface IntegerComparator {

    /**
     * Compares two integer values
     *
     * @param i1 first integer value
     * @param i2 second integer value
     * @return comparison result
     */
    boolean compare(int i1, int i2);
}
