package ru.ganev.sorting.tests;

import org.junit.jupiter.api.Test;
import ru.ganev.sorting.AbstractSortTest;
import ru.ganev.sorting.impl.TreeSort;
import ru.ganev.sorting.utils.TestUtil;

import static ru.ganev.sorting.SortingMode.ASC;
import static ru.ganev.sorting.SortingMode.DESC;

/**
 * Tree sort Test
 *
 * @author Ganev Artyom
 */
public class TestTreeSort extends AbstractSortTest {

    @Test
    @Override
    public void testAscending() {
        TestUtil.testAscending(new TreeSort(ASC), 5);
    }

    @Test
    @Override
    public void testDescending() {
        TestUtil.testDescending(new TreeSort(DESC), 5);
    }
}
