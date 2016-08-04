package ru.ganev.sorting.tests;

import org.junit.Test;
import ru.ganev.sorting.AbstractSortTest;
import ru.ganev.sorting.Sort;
import ru.ganev.sorting.impl.InsertionSort;
import ru.ganev.sorting.utils.TestUtil;

public class TestInsertionSort extends AbstractSortTest {

    private static final Sort SORT = InsertionSort.getInstance();

    @Test
    @Override
    public void testAscending() {
        TestUtil.testAscending(SORT, 99);
    }

    @Test
    @Override
    public void testDescending() {
        TestUtil.testDescending(SORT, 99);
    }

}
