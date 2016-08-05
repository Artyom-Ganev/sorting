package ru.ganev.sorting;

public abstract class AbstractSort implements Sort {

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
    public SortingMode getMode() {
        return mode;
    }
}
