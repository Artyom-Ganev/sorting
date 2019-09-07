package ru.ganev.sorting.tests;

import org.junit.jupiter.api.Test;
import ru.ganev.sorting.AbstractSortTest;
import ru.ganev.sorting.impl.BubbleSort;
import ru.ganev.sorting.utils.TestUtil;

import static ru.ganev.sorting.SortingMode.ASC;
import static ru.ganev.sorting.SortingMode.DESC;

/**
 * Bubble sort Test
 *
 * @author Ganev Artyom
 */
public class TestBubbleSort extends AbstractSortTest {

    @Test
    @Override
    public void testAscending() {
        TestUtil.testAscending(new BubbleSort(ASC));
    }

    @Test
    @Override
    public void testDescending() {
        TestUtil.testDescending(new BubbleSort(DESC));
    }

}
