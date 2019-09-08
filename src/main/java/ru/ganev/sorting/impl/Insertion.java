package ru.ganev.sorting.impl;

import ru.ganev.sorting.Abstract;
import ru.ganev.sorting.Mode;

import static ru.ganev.sorting.Helper.copyArray;
import static ru.ganev.sorting.Helper.createComparator;

/**
 * The Implementation of Insertion sort
 *
 * @author Ganev Artyom
 */
public final class Insertion extends Abstract {

    public Insertion(Mode mode) {
        super(mode);
    }

    @Override
    public int[] sort(final int[] input) {
        int[] array = copyArray(input);
        for (int out = 1; out < array.length; out++) {
            int current = array[out];
            int in = out - 1;
            while (in >= 0 && this.compare(array[in], current)) {
                array[in + 1] = array[in];
                in--;
            }
            array[in + 1] = current;
        }
        return array;
    }

}
