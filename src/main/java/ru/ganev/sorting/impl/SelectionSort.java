package ru.ganev.sorting.impl;

import ru.ganev.sorting.Sort;
import ru.ganev.sorting.SortingMode;

import static ru.ganev.sorting.utils.SortingHelper.copyArray;
import static ru.ganev.sorting.utils.SortingHelper.createComparator;

/**
 * Implementation of selection sort algorithm
 */
public class SelectionSort implements Sort {

    private static final SelectionSort INSTANCE = new SelectionSort();

    private SelectionSort() {
    }

    public static SelectionSort getInstance() {
        return INSTANCE;
    }

    @Override
    public int[] sort(final int[] input, final SortingMode mode) {
        int[] array = copyArray(input);
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            boolean f = false;
            for (int j = i + 1; j < array.length; j++) {
                if (createComparator(mode).compare(array[min], array[j])) {
                    min = j;
                    f = true;
                }
            }
            if (f) {
                int t = array[i];
                array[i] = array[min];
                array[min] = t;
            }
        }
        return array;
    }
}
