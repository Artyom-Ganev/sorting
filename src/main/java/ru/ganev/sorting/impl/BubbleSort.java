package ru.ganev.sorting.impl;

import ru.ganev.sorting.AbstractSort;
import ru.ganev.sorting.SortingMode;

import static ru.ganev.sorting.utils.SortingHelper.copyArray;
import static ru.ganev.sorting.utils.SortingHelper.createComparator;

/**
 * The Implementation of Bubble sort
 *
 * @author Ganev Artyom
 */
public class BubbleSort extends AbstractSort {

    public BubbleSort(SortingMode mode) {
        super(mode);
    }

    @Override
    public int[] sort(final int[] input) {
        int[] array = copyArray(input);
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (createComparator(this.getMode()).compare(array[j], array[j + 1])) {
                    final int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        return array;
    }
}
