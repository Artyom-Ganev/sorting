package ru.ganev.sorting.tests;

import org.junit.jupiter.api.Test;
import ru.ganev.sorting.AbstractSortTest;
import ru.ganev.sorting.impl.QuickSort;
import ru.ganev.sorting.utils.TestUtil;

import static ru.ganev.sorting.SortingMode.ASC;
import static ru.ganev.sorting.SortingMode.DESC;

/**
 * Quick sort Test
 *
 * @author Ganev Artyom
 */
public class TestQuickSort extends AbstractSortTest {
    @Test
    @Override
    public void testAscending() {
        TestUtil.testAscending(new QuickSort(ASC));
    }

    @Test
    @Override
    public void testDescending() {
        TestUtil.testDescending(new QuickSort(DESC));
    }
}
