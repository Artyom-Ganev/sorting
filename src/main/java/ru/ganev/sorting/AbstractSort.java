package ru.ganev.sorting;

/**
 * Sorting Algorithm base class
 *
 * @author Ganev Artyom
 */
public abstract class AbstractSort implements ISort {

    private final SortingMode mode;

    /**
     * @param mode sorting mode from {@link ru.ganev.sorting.SortingMode}
     */
    public AbstractSort(SortingMode mode) {
        this.mode = mode;
    }

    /**
     * @return current sorting mode
     */
    protected SortingMode getMode() {
        return mode;
    }
}
