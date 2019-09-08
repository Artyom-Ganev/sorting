package ru.ganev.sorting.impl;

import ru.ganev.sorting.Abstract;
import ru.ganev.sorting.Mode;

import static ru.ganev.sorting.Helper.copyArray;
import static ru.ganev.sorting.Helper.createComparator;

/**
 * The Implementation of Shell sort
 *
 * @author Ganev Artyom
 */
public class Shell extends Abstract {
    public Shell(Mode mode) {
        super(mode);
    }

    @Override
    public int[] sort(final int[] input) {
        int[] array = copyArray(input);
        int len = array.length;
        int interval = Shell.calcInterval(len);
        while (interval > 0) {
            for (int outer = interval; outer < len; outer++) {
                int tmp = array[outer];
                int inner = outer;
                while ((inner > interval - 1) && createComparator(this.getMode()).compare(array[inner - interval], tmp)) {
                    array[inner] = array[inner - interval];
                    inner -= interval;
                }
                array[inner] = tmp;
            }
            interval = (interval - 1) / 3;
        }
        return array;
    }

    /**
     * Calc max interval value
     *
     * @param length source array length
     * @return interval value
     */
    private static int calcInterval(final int length) {
        int interval = 1;
        while (interval <= length / 3) {
            interval = interval * 3 + 1;
        }
        return interval;
    }
}
