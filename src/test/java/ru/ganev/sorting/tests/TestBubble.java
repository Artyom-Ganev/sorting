package ru.ganev.sorting.tests;

import org.junit.jupiter.api.Test;
import ru.ganev.sorting.AbstractTest;
import ru.ganev.sorting.TestUtil;

import static ru.ganev.sorting.Mode.ASC;
import static ru.ganev.sorting.Mode.DESC;

/**
 * Bubble sort Test
 *
 * @author Ganev Artyom
 */
public class TestBubble extends AbstractTest {

    @Test
    @Override
    public void testAscending() {
        TestUtil.testAscending(new ru.ganev.sorting.impl.Bubble(ASC));
    }

    @Test
    @Override
    public void testDescending() {
        TestUtil.testDescending(new ru.ganev.sorting.impl.Bubble(DESC));
    }

}
