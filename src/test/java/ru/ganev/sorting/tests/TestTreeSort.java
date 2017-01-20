package ru.ganev.sorting.tests;

import org.junit.Ignore;
import org.junit.Test;
import ru.ganev.sorting.AbstractSortTest;
import ru.ganev.sorting.impl.TreeSort;
import ru.ganev.sorting.utils.TestUtil;

import static ru.ganev.sorting.SortingMode.ASCENDING;
import static ru.ganev.sorting.SortingMode.DESCENDING;

public class TestTreeSort extends AbstractSortTest {

    @Ignore
    @Test
    @Override
    public void testAscending() {
        TestUtil.testAscending(new TreeSort(ASCENDING), 5);
    }

    @Ignore
    @Test
    @Override
    public void testDescending() {
        TestUtil.testDescending(new TreeSort(DESCENDING), 99);
    }
}