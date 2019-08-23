package by.milosh.task3;

import by.milosh.core.Tree;

public class DepthFirstSearchService {

    public String preOrderSearch(Tree tree) {
        return preOrder(tree.getRoot(), new StringBuilder()).toString();
    }

    private StringBuilder preOrder(Tree.Node node, StringBuilder str) {
        return node == null ? new StringBuilder() : str.append(node.getKey())
                .append(preOrder(node.getLeft(), new StringBuilder()))
                .append(preOrder(node.getRight(), new StringBuilder()));
    }

    public String inOrderSearch(Tree tree) {
        return inOrder(tree.getRoot(), new StringBuilder()).toString();
    }

    private StringBuilder inOrder(Tree.Node node, StringBuilder str) {
        return node == null ? new StringBuilder() : str.append(inOrder(node.getLeft(), new StringBuilder()))
                .append(node.getKey())
                .append(inOrder(node.getRight(), new StringBuilder()));
    }

    public String postOrderSearch(Tree tree) {
        return postOrder(tree.getRoot(), new StringBuilder()).toString();
    }

    private StringBuilder postOrder(Tree.Node node, StringBuilder str) {
        return node == null ? new StringBuilder() : str.append(postOrder(node.getLeft(), new StringBuilder()))
                .append(postOrder(node.getRight(), new StringBuilder()))
                .append(node.getKey());
    }
}
