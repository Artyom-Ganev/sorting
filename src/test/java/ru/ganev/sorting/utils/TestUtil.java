package ru.ganev.sorting.utils;

import java.util.Arrays;
import java.util.Random;

import ru.ganev.sorting.Sort;

import static org.junit.Assert.assertArrayEquals;
import static ru.ganev.sorting.utils.SortingHelper.copyArray;

/**
 * Sorting algorithms test utility
 */
public final class TestUtil {

    private TestUtil() {
    }

    public static void testAscending(final Sort sort, final int size) {
        final int[] unsorted = createUnsorted(size);
        assertArrayEquals(createAscending(unsorted), sort.sort(unsorted));
    }

    public static void testDescending(final Sort sort, final int size) {
        final int[] unsorted = createUnsorted(size);
        assertArrayEquals(createDescending(unsorted), sort.sort(unsorted));
    }

    private static int[] createUnsorted(final int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
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
