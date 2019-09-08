package ru.ganev.sorting;

import static ru.ganev.sorting.Helper.createComparator;

/**
 * Sorting Algorithm base class
 *
 * @author Ganev Artyom
 */
public abstract class Abstract implements ISort {

    private final Mode mode;

    /**
     * @param mode sorting mode from {@link Mode}
     */
    public Abstract(Mode mode) {
        this.mode = mode;
    }

    /**
     * @return current sorting mode
     */
    protected Mode getMode() {
        return mode;
    }

    /**
     * Compare to values with Comparator appropriate to current sorting mode
     *
     * @param value1 first value
     * @param value2 second value
     * @return comparision result
     */
    protected boolean compare(final int value1, final int value2) {
        return createComparator(this.getMode()).compare(value1, value2);
    }
}
