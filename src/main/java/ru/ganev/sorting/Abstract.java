package ru.ganev.sorting;

/**
 * Sorting Algorithm base class
 *
 * @author Ganev Artyom
 */
public abstract class Abstract implements ISort {

    private final Mode mode;

    /**
     * @param mode sorting mode from {@link Mode}
     */
    public Abstract(Mode mode) {
        this.mode = mode;
    }

    /**
     * @return current sorting mode
     */
    protected Mode getMode() {
        return mode;
    }
}
