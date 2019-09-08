package ru.ganev.sorting.impl;

import java.util.Arrays;

import ru.ganev.sorting.Abstract;
import ru.ganev.sorting.Mode;

import static ru.ganev.sorting.Helper.createComparator;

/**
 * The Implementation of Merge sort
 *
 * @author Ganev Artyom
 */
public final class Merge extends Abstract {

    public Merge(Mode mode) {
        super(mode);
    }

    @Override
    public int[] sort(final int[] input) {
        int size = input.length;
        if (size < 2) {
            return input;
        }
        int mid = size / 2;
        return merge(sort(Arrays.copyOfRange(input, 0, mid)),
                sort(Arrays.copyOfRange(input, mid, size)));
    }

    private int[] merge(int[] left, int[] right) {
        int leftSize = left.length;
        int rightSize = right.length;
        int l = 0, r = 0;
        int size = leftSize + rightSize;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            if (r < rightSize && l < leftSize) {
                if (this.compare(left[l], right[r])) {
                    array[i] = right[r++];
                } else {
                    array[i] = left[l++];
                }
            } else if (r < rightSize) {
                array[i] = right[r++];
            } else {
                array[i] = left[l++];
            }
        }
        return array;
    }
}
