package ru.ganev.sorting;

/**
 * Sorting helper class
 *
 * @author Ganev Artyom
 */
public final class Helper {

    private Helper() {
    }

    /**
     * Returns lambda-expression suitable for sorting mode
     *
     * @param mode comparison mode from {@link Mode} enum
     * @return lambda-expression implementing {@link ru.ganev.sorting.IntegerComparator#compare(int, int)}
     */
    public static IntegerComparator createComparator(Mode mode) {
        switch (mode) {
            case ASC: {
                return (o1, o2) -> o1 > o2;
            }
            case DESC: {
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

    /**
     * Swap two array values
     *
     * @param array  source array
     * @param index1 first value index
     * @param index2 second value index
     */
    public static void swap(final int[] array, final int index1, final int index2) {
        if (index1 != index2) {
            // should swap only if indexes are different
            final int t = array[index1];
            array[index1] = array[index2];
            array[index2] = t;
        }
    }
}
