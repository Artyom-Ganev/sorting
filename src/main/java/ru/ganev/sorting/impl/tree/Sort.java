package ru.ganev.sorting.impl.tree;

import java.util.Arrays;

import ru.ganev.sorting.Abstract;
import ru.ganev.sorting.Mode;

import static ru.ganev.sorting.Mode.ASC;

/**
 * The Implementation of Tree sort
 *
 * @author Ganev Artyom
 */
public class Sort extends Abstract {

    public Sort(Mode mode) {
        super(mode);
    }

    @Override
    public int[] sort(int[] array) {
        Model tree = new Model();
        Arrays.stream(array).forEach(tree::insert);
        int[] result = new int[array.length];
        Mode mode = this.getMode();
        if (mode == ASC) {
            tree.incOrder(tree.getRoot(), result, 0);
        } else {
            tree.decOrder(tree.getRoot(), result, 0);
        }
        return result;
    }
}
