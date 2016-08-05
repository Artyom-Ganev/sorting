package ru.ganev.sorting.tests;

import org.junit.Test;
import ru.ganev.sorting.AbstractSortTest;
import ru.ganev.sorting.impl.SelectionSort;
import ru.ganev.sorting.utils.TestUtil;

import static ru.ganev.sorting.SortingMode.ASCENDING;
import static ru.ganev.sorting.SortingMode.DESCENDING;

public class TestSelectionSort extends AbstractSortTest {

    @Test
    @Override
    public void testAscending() {
        TestUtil.testAscending(new SelectionSort(ASCENDING), 99);
    }

    @Test
    @Override
    public void testDescending() {
        TestUtil.testDescending(new SelectionSort(DESCENDING), 99);
    }
}
