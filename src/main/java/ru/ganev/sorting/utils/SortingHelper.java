package ru.ganev.sorting.utils;

import ru.ganev.sorting.IntegerComparator;
import ru.ganev.sorting.SortingMode;

/**
 * Sorting helper class
 */
public final class SortingHelper {

    private SortingHelper() {
    }

    /**
     * Returns lamda-expression suitable for sorting mode
     *
     * @param mode comparison mode from {@link ru.ganev.sorting.SortingMode} enum
     * @return lamda-expression implementing {@link ru.ganev.sorting.IntegerComparator#compare(int, int)}
     */
    public static IntegerComparator createComparator(SortingMode mode) {
        switch (mode) {
            case ASCENDING: {
                return (o1, o2) -> o1 > o2;
            }
            case DESCENDING: {
                return (o1, o2) -> o1 < o2;
            }
            default:
                throw new IllegalArgumentException("Incorrect sorting mode: " + mode.name());
        }
    }

    /**
     * Returns full array copy
     *
     * @param input input array
     * @return output array
     */
    public static int[] copyArray(final int[] input) {
        int[] array = new int[input.length];
        System.arraycopy(input, 0, array, 0, input.length);
        return array;
    }
}
