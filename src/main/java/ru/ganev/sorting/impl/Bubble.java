package ru.ganev.sorting.impl;

import ru.ganev.sorting.Abstract;
import ru.ganev.sorting.Mode;

import static ru.ganev.sorting.Helper.copyArray;
import static ru.ganev.sorting.Helper.createComparator;
import static ru.ganev.sorting.Helper.swap;

/**
 * The Implementation of Bubble sort
 *
 * @author Ganev Artyom
 */
public class Bubble extends Abstract {

    public Bubble(Mode mode) {
        super(mode);
    }

    @Override
    public int[] sort(final int[] input) {
        int[] array = copyArray(input);
        for (int out = array.length - 1; out > 1; out--) {
            for (int in = 0; in < out; in++) {
                if (this.compare(array[in], array[in + 1])) {
                    swap(array, in, in + 1);
                }
            }
        }
        return array;
    }
}
