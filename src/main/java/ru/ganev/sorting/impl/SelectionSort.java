package ru.ganev.sorting.impl;

import ru.ganev.sorting.AbstractSort;
import ru.ganev.sorting.SortingMode;

import static ru.ganev.sorting.utils.SortingHelper.copyArray;
import static ru.ganev.sorting.utils.SortingHelper.createComparator;

/**
 * Implementation of selection sort algorithm
 */
public class SelectionSort extends AbstractSort {

    public SelectionSort(SortingMode mode) {
        super(mode);
    }

    @Override
    public int[] sort(final int[] input) {
        int[] array = copyArray(input);
        for (int i = 0; i < array.length - 1; i++) {
            int start = i;
            boolean f = false;
            for (int j = i + 1; j < array.length; j++) {
                if (createComparator(this.getMode()).compare(array[start], array[j])) {
                    start = j;
                    f = true;
                }
            }
            if (f) {
                int t = array[i];
                array[i] = array[start];
                array[start] = t;
            }
        }
        return array;
    }
}
