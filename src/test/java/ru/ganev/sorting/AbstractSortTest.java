package ru.ganev.sorting;

import org.junit.jupiter.api.Assertions;

/**
 * Sorting test base class
 *
 * @author Ganev Artyom
 */
public abstract class AbstractSortTest extends Assertions implements ISortTest {

    public abstract void testAscending();

    public abstract void testDescending();

}
