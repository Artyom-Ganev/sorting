package ru.ganev.sorting.impl;

import ru.ganev.sorting.Sort;
import ru.ganev.sorting.SortingMode;
import ru.ganev.sorting.utils.SortingHelper;

/**
 * Implementation of merge sort algorithm
 */
public final class MergeSort implements Sort {

    private static final MergeSort INSTANCE = new MergeSort();

    private MergeSort() {
    }

    public static MergeSort getInstance() {
        return INSTANCE;
    }

    @Override
    public int[] sort(final int[] input, final SortingMode mode) {
        return mergeSort(SortingHelper.copyArray(input), 0, input.length - 1);
    }

    private static int[] mergeSort(int[] array, int begin, int end) {
        if (begin < end) {
            final int mid = (begin + end) / 2;
            mergeSort(array, begin, mid);
            mergeSort(array, mid + 1, end);
            merge(array, begin, mid, end);
        }
        return array;
    }

    private static void merge(int[] array, int begin, int mid, int end) {
        final int lSize = mid - begin + 1;
        final int rSize = end - mid;
        int[] left = new int[lSize];
        int[] right = new int[rSize];
        System.arraycopy(array, begin, left, 0, lSize);
        System.arraycopy(array, mid, right, 0, lSize);
//        int i, j = 0;
//        for (int k = begin; k < end; k++) {
//            if(left[i] <= right[j]) {
//
//            }
//        }
    }

}
