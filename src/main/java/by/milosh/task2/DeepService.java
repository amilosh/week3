package by.milosh.task2;

import by.milosh.core.Tree;

public class DeepService {

    public int deep(Tree tree) {
        return treeDeep(tree.getRoot());
    }

    private int treeDeep(Tree.Node node) {
        return node == null ? 0 : 1 + Math.max(treeDeep(node.getLeft()), treeDeep(node.getRight()));
    }
}
