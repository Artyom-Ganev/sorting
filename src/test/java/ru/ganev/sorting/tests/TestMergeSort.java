package ru.ganev.sorting.tests;

import org.junit.jupiter.api.Test;
import ru.ganev.sorting.AbstractSortTest;
import ru.ganev.sorting.impl.MergeSort;
import ru.ganev.sorting.utils.TestUtil;

import static ru.ganev.sorting.SortingMode.ASC;
import static ru.ganev.sorting.SortingMode.DESC;

/**
 * Merge sort Test
 *
 * @author Ganev Artyom
 */
public class TestMergeSort extends AbstractSortTest {

    @Test
    @Override
    public void testAscending() {
        TestUtil.testAscending(new MergeSort(ASC));
    }

    @Test
    @Override
    public void testDescending() {
        TestUtil.testDescending(new MergeSort(DESC));
    }

}
