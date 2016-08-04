package ru.ganev.sorting.impl;

import ru.ganev.sorting.Sort;
import ru.ganev.sorting.SortingMode;

import static ru.ganev.sorting.utils.SortingHelper.copyArray;
import static ru.ganev.sorting.utils.SortingHelper.createComparator;

/**
 * Implementation of insertion sort algorithm
 */
public final class InsertionSort implements Sort {

    private static final InsertionSort INSTANCE = new InsertionSort();

    private InsertionSort() {
    }

    public static InsertionSort getInstance() {
        return INSTANCE;
    }

    @Override
    public int[] sort(final int[] input, final SortingMode mode) {
        int[] array = copyArray(input);
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && createComparator(mode).compare(array[i], key)) {
                array[i + 1] = array[i];
                array[i] = key;
                i--;
            }
        }
        return array;
    }

}
