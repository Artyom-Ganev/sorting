package ru.ganev.sorting.impl;

import ru.ganev.sorting.Abstract;
import ru.ganev.sorting.Mode;

import static ru.ganev.sorting.Helper.copyArray;
import static ru.ganev.sorting.Helper.swap;

/**
 * The Implementation of Quick sort
 *
 * @author Ganev Artyom
 */
public class Quick extends Abstract {
    private int[] array;

    public Quick(Mode mode) {
        super(mode);
    }

    @Override
    public int[] sort(final int[] input) {
        array = copyArray(input);
        this.sort(0, array.length - 1);
        return array;
    }

    /**
     *
     * @param left
     * @param right
     */
    private void sort(final int left, final int right) {
        if (right - left > 0) {
            // first pivot is the last element of array
            int pivot = array[right];
            int index = split(left, right, pivot);
            sort(left, index - 1);
            sort(index + 1, right);
        }
    }

    /**
     * Split array
     *
     * @param left  left pointer start position
     * @param right right pointer start position
     * @param pivot base value to compare with
     * @return base value index
     */
    @SuppressWarnings("StatementWithEmptyBody")
    private int split(final int left, final int right, final int pivot) {
        int l = left - 1;
        int r = right;
        while (true) {
            while (array[++l] < pivot) {
                // move left pointer in direction of array end
            }
            while (r > 0 && array[--r] > pivot) {
                // move right pointer in direction of array start
            }
            if (l >= r) {
                break;
            } else {
                swap(array, l, r);
            }
        }
        swap(array, l, right);
        return l;
    }
}
