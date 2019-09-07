package ru.ganev.sorting.tests;

import org.junit.jupiter.api.Test;
import ru.ganev.sorting.AbstractSortTest;
import ru.ganev.sorting.impl.SelectionSort;
import ru.ganev.sorting.utils.TestUtil;

import static ru.ganev.sorting.SortingMode.ASC;
import static ru.ganev.sorting.SortingMode.DESC;

/**
 * Selection Sort Test
 *
 * @author Ganev Artyom
 */
public class TestSelectionSort extends AbstractSortTest {

    @Test
    @Override
    public void testAscending() {
        TestUtil.testAscending(new SelectionSort(ASC));
    }

    @Test
    @Override
    public void testDescending() {
        TestUtil.testDescending(new SelectionSort(DESC));
    }
}
