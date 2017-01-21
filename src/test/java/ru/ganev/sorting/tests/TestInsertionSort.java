package ru.ganev.sorting.tests;

import org.junit.Test;
import ru.ganev.sorting.AbstractSortTest;
import ru.ganev.sorting.impl.InsertionSort;
import ru.ganev.sorting.utils.TestUtil;

import static ru.ganev.sorting.SortingMode.ASCENDING;
import static ru.ganev.sorting.SortingMode.DESCENDING;

public class TestInsertionSort extends AbstractSortTest {

    @Test
    @Override
    public void testAscending() {
        TestUtil.testAscending(new InsertionSort(ASCENDING));
    }

    @Test
    @Override
    public void testDescending() {
        TestUtil.testDescending(new InsertionSort(DESCENDING));
    }

}
