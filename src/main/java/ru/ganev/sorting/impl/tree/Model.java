package ru.ganev.sorting.impl.tree;

/**
 * The model for storing Tree sort data
 *
 * @author Ganev Artyom
 */
final class Model {
    private Node root;

    Model() {
        this.root = null;
    }

    Node getRoot() {
        return this.root;
    }

    /**
     * Insert value into model
     *
     * @param id value
     */
    void insert(int id) {
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

    /**
     * Incremental order traverse
     *
     * @param node   the node to start traverse
     * @param saveTo an array to save values
     * @param index  the index of array to save value
     * @return next index
     */
    int incOrder(Node node, int[] saveTo, int index) {
        if (node.left != null) {
            index = incOrder(node.left, saveTo, index);
        }
        saveTo[index++] = node.data;
        if (node.right != null) {
            index = incOrder(node.right, saveTo, index);
        }
        return index;
    }

    /**
     * Decremental order traverse
     *
     * @param node   the node to start traverse
     * @param saveTo an array to save values
     * @param index  the index of array to save value
     * @return next index
     */
    int decOrder(Node node, int[] saveTo, int index) {
        if (node.right != null) {
            index = decOrder(node.right, saveTo, index);
        }
        saveTo[index++] = node.data;
        if (node.left != null) {
            index = decOrder(node.left, saveTo, index);
        }
        return index;
    }

    private static final class Node {
        private int data;
        private Node left;
        private Node right;

        private Node(int data) {
            this.data = data;
        }
    }
}
