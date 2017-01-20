package ru.ganev.sorting.impl;

import java.util.Arrays;

import ru.ganev.sorting.AbstractSort;
import ru.ganev.sorting.SortingMode;

import static ru.ganev.sorting.utils.SortingHelper.createComparator;

/**
 * Implementation of tree sort algorithm
 */
public class TreeSort extends AbstractSort {

    public TreeSort(SortingMode mode) {
        super(mode);
    }

    @Override
    public int[] sort(int[] array) {
        Tree tree = new Tree();
        Arrays.stream(array).forEach(tree::insert);
        int[] result = new int[array.length];
        tree.toArray(tree.root, result, 0);
        return result;
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;

        private Node(int value) {
            this.value = value;
        }

    }

    private class Tree {

        private Node root;

        private Tree() {
            this.root = null;
        }

        private void insert(int id) {
            Node newNode = new Node(id);
            if (root == null) {
                root = newNode;
                return;
            }
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (createComparator(TreeSort.this.getMode()).compare(id, current.value)) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }

        private void toArray(Node node, int[] array, int position) {
            if (node != null) {
                toArray(node.left, array, position);
                array[position++] = node.value;
                toArray(node.right, array, position);
            }
        }
    }


}
