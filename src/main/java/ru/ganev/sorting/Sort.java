package ru.ganev.sorting;

/**
 * Main interface for all sorting algorithms
 */
public interface Sort {

    /**
     * @param array input array
     * @param mode  sorting mode from {@link ru.ganev.sorting.SortingMode}
     * @return new sorted array
     */
    int[] sort(final int[] array, final SortingMode mode);

}
