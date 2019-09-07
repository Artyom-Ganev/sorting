package ru.ganev.sorting.impl;

import ru.ganev.sorting.AbstractSort;
import ru.ganev.sorting.SortingMode;

import static ru.ganev.sorting.utils.SortingHelper.copyArray;
import static ru.ganev.sorting.utils.SortingHelper.createComparator;

/**
 * The Implementation of Insertion sort
 *
 * @author Ganev Artyom
 */
public final class InsertionSort extends AbstractSort {

    public InsertionSort(SortingMode mode) {
        super(mode);
    }

    @Override
    public int[] sort(final int[] input) {
        int[] array = copyArray(input);
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int prevIndex = i - 1;
            while (prevIndex >= 0 && createComparator(this.getMode()).compare(array[prevIndex], current)) {
                array[prevIndex + 1] = array[prevIndex];
                prevIndex--;
            }
            array[prevIndex + 1] = current;
        }
        return array;
    }

}
