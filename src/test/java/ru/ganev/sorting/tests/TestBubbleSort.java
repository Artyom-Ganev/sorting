package ru.ganev.sorting.tests;

import org.junit.Test;
import ru.ganev.sorting.AbstractSortTest;
import ru.ganev.sorting.impl.BubbleSort;
import ru.ganev.sorting.utils.TestUtil;

import static ru.ganev.sorting.SortingMode.ASCENDING;
import static ru.ganev.sorting.SortingMode.DESCENDING;

public class TestBubbleSort extends AbstractSortTest {

    @Test
    @Override
    public void testAscending() {
        TestUtil.testAscending(new BubbleSort(ASCENDING));
    }

    @Test
    @Override
    public void testDescending() {
        TestUtil.testDescending(new BubbleSort(DESCENDING));
    }

}
