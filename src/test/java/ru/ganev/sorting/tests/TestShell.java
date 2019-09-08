package ru.ganev.sorting.tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.ganev.sorting.AbstractTest;
import ru.ganev.sorting.TestUtil;
import ru.ganev.sorting.impl.Shell;

import static ru.ganev.sorting.Mode.ASC;
import static ru.ganev.sorting.Mode.DESC;

/**
 * Quick sort Test
 *
 * @author Ganev Artyom
 */
@Disabled("In work")
public class TestShell extends AbstractTest {
    @Test
    @Override
    public void testAscending() {
        TestUtil.testAscending(new Shell(ASC));
    }

    @Test
    @Override
    public void testDescending() {
        TestUtil.testDescending(new Shell(DESC));
    }
}
