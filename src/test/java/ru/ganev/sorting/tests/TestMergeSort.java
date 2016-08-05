package ru.ganev.sorting.tests;

import org.junit.Test;
import ru.ganev.sorting.AbstractSortTest;
import ru.ganev.sorting.impl.MergeSort;
import ru.ganev.sorting.utils.TestUtil;

import static ru.ganev.sorting.SortingMode.ASCENDING;
import static ru.ganev.sorting.SortingMode.DESCENDING;

public class TestMergeSort extends AbstractSortTest {

    @Test
    @Override
    public void testAscending() {
        TestUtil.testAscending(new MergeSort(ASCENDING), 99);
    }

    @Test
    @Override
    public void testDescending() {
        TestUtil.testDescending(new MergeSort(DESCENDING), 99);
    }

}
