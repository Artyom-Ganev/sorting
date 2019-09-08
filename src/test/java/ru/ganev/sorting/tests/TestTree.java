package ru.ganev.sorting.tests;

import org.junit.jupiter.api.Test;
import ru.ganev.sorting.AbstractTest;
import ru.ganev.sorting.TestUtil;
import ru.ganev.sorting.impl.tree.Sort;

import static ru.ganev.sorting.Mode.ASC;
import static ru.ganev.sorting.Mode.DESC;

/**
 * Tree sort Test
 *
 * @author Ganev Artyom
 */
public class TestTree extends AbstractTest {

    @Test
    @Override
    public void testAscending() {
        TestUtil.testAscending(new Sort(ASC), 5);
    }

    @Test
    @Override
    public void testDescending() {
        TestUtil.testDescending(new Sort(DESC), 5);
    }
}
