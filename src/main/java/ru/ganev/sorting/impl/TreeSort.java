package ru.ganev.sorting.impl;

import java.util.Arrays;

import ru.ganev.sorting.AbstractSort;
import ru.ganev.sorting.SortingMode;

import static ru.ganev.sorting.SortingMode.ASCENDING;

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
        SortingMode mode = TreeSort.this.getMode();
        if (mode == ASCENDING) {
            tree.incOrder(tree.root, result, 0);
        } else {
            tree.decOrder(tree.root, result, 0);
        }
        return result;
    }

    private class Node {
        private int data;
        private Node left;
        private Node right;

        private Node(int data) {
            this.data = data;
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
                if (id < current.data) {
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

        private int incOrder(Node node, int[] saveTo, int index) {
            if (node.left != null) {
                index = incOrder(node.left, saveTo, index);
            }
            saveTo[index++] = node.data;
            if (node.right != null) {
                index = incOrder(node.right, saveTo, index);
            }
            return index;
        }

        private int decOrder(Node node, int[] saveTo, int index) {
            if (node.right != null) {
                index = decOrder(node.right, saveTo, index);
            }
            saveTo[index++] = node.data;
            if (node.left != null) {
                index = decOrder(node.left, saveTo, index);
            }
            return index;
        }
    }
}
