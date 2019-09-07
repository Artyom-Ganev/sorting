package ru.ganev.sorting.utils;

import java.util.Arrays;
import java.util.Random;

import ru.ganev.sorting.ISort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.ganev.sorting.utils.SortingHelper.copyArray;

/**
 * Sorting Algorithm test utility
 *
 * @author Ganev Artyom
 */
public final class TestUtil {

    private static final int DEFAULT_SIZE = 99;

    private TestUtil() {
    }

    /**
     * Test ascending order sorting
     *
     * @param sort sorting algorithm implementation class
     */
    public static void testAscending(final ISort sort) {
        testAscending(sort, DEFAULT_SIZE);
    }

    /**
     * Test ascending order sorting
     *
     * @param sort Algorithm implementation class
     * @param size array size
     */
    public static void testAscending(final ISort sort, final int size) {
        final int[] unsorted = createUnsorted(size);
        assertArrayEquals(createAscending(unsorted), sort.sort(unsorted));
    }

    /**
     * Test descending order sorting
     *
     * @param sort sorting algorithm implementation class
     */
    public static void testDescending(final ISort sort) {
        testDescending(sort, DEFAULT_SIZE);
    }

    /**
     * Test descending order sorting
     *
     * @param sort sorting algorithm implementation class
     * @param size array size
     */
    public static void testDescending(final ISort sort, final int size) {
        final int[] unsorted = createUnsorted(size);
        assertArrayEquals(createDescending(unsorted), sort.sort(unsorted));
    }

    private static int[] createUnsorted(final int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    private static int[] createAscending(final int[] input) {
        int[] array = copyArray(input);
        Arrays.sort(array);
        return array;
    }

    private static int[] createDescending(final int[] input) {
        int[] array = createAscending(input);
        int i = array.length - 1;
        int j = 0;
        while (i >= (array.length / 2)) {
            final int t = array[i];
            array[i] = array[j];
            array[j] = t;
            i--;
            j++;
        }
        return array;
    }
}
