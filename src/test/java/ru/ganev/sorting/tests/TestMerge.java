package ru.ganev.sorting.tests;

import org.junit.jupiter.api.Test;
import ru.ganev.sorting.AbstractTest;
import ru.ganev.sorting.TestUtil;

import static ru.ganev.sorting.Mode.ASC;
import static ru.ganev.sorting.Mode.DESC;

/**
 * Merge sort Test
 *
 * @author Ganev Artyom
 */
public class TestMerge extends AbstractTest {

    @Test
    @Override
    public void testAscending() {
        TestUtil.testAscending(new ru.ganev.sorting.impl.Merge(ASC));
    }

    @Test
    @Override
    public void testDescending() {
        TestUtil.testDescending(new ru.ganev.sorting.impl.Merge(DESC));
    }

}
