package ru.ganev.sorting.tests;

import org.junit.Test;
import ru.ganev.sorting.AbstractSortTest;
import ru.ganev.sorting.Sort;

public class TestMergeSort extends AbstractSortTest {

    private static final Sort SORT = MergeSort.getInstance();

    @Test
    @Override
    public void testAscending() {
//        TestUtil.testAscending(SORT, 10);
    }

    @Test
    @Override
    public void testDescending() {
//        TestUtil.testDescending(SORT, 10);
    }

}
