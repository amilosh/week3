package by.milosh.core;

public class Tree<T extends Comparable<T>> {

    private Node<T> root = null;

    public Node getRoot() {
        return root;
    }

    public static class Node<T extends Comparable<T>> {
        private T key;
        private Node<T> left;
        private Node<T> right;

        public Node(T key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }

        public T getKey() {
            return key;
        }

        public void setKey(T key) {
            this.key = key;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    // Insert
    public void insert(T key) {
        root = insertNode(root, key);
    }

    private Node insertNode(Node<T> root, T key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key.compareTo(root.getKey()) < 0) {
            root.left = insertNode(root.left, key);
        } else if (key.compareTo(root.getKey()) > 0) {
            root.right = insertNode(root.right, key);
        }
        return root;
    }

    public void insertByParentKey(T parentKey, T key) {
        Node parent = searchByKey(parentKey);
        if (parent.key.compareTo(key) > 0) {
            parent.left = new Node(key);
        } else if (parent.key.compareTo(key) < 0) {
            parent.right = new Node(key);
        }
    }

    // Search
    public Node searchByKey(T key) {
        return search(root, key);
    }

    private Node search(Node<T> node, T key) {
        if (node == null || (node.key.compareTo(key) == 0)) {
            return node;
        } else if (key.compareTo(root.getKey()) < 0) {
            return search(node.left, key);
        } else if (key.compareTo(root.getKey()) > 0) {
            return search(node.right, key);
        }
        return null;
    }
}
