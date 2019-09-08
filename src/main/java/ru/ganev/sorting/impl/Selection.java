package ru.ganev.sorting.impl;

import ru.ganev.sorting.Abstract;
import ru.ganev.sorting.Mode;

import static ru.ganev.sorting.Helper.copyArray;
import static ru.ganev.sorting.Helper.createComparator;
import static ru.ganev.sorting.Helper.swap;

/**
 * The Implementation of Selection Sort
 *
 * @author Ganev Artyom
 */
public class Selection extends Abstract {

    public Selection(Mode mode) {
        super(mode);
    }

    @Override
    public int[] sort(final int[] input) {
        int[] array = copyArray(input);
        int len = array.length;
        for (int out = 0; out < len - 1; out++) {
            int start = out;
            for (int in = out + 1; in < len; in++) {
                if (createComparator(this.getMode()).compare(array[start], array[in])) {
                    start = in;
                }
            }
            swap(array, out, start);
        }
        return array;
    }
}
