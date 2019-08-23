package by.milosh.task1;

import by.milosh.core.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class NodeCountService {

    public int countNodes(Tree tree) {
        return count(tree.getRoot());
    }

    private int count(Tree.Node node) {
        return node == null ? 0 : count(node.getLeft()) + 1 + count(node.getRight());
    }

    public int countNodesLoop(Tree tree) {
        Queue<Tree.Node> queue = new LinkedList<>();
        int count = 0;
        queue.add(tree.getRoot());
        while (!queue.isEmpty()) {
            count++;
            Tree.Node tempNode = queue.poll();
            if (tempNode.getLeft() != null) {
                queue.add(tempNode.getLeft());
            }
            if (tempNode.getRight() != null) {
                queue.add(tempNode.getRight());
            }
        }
        return count;
    }
}
