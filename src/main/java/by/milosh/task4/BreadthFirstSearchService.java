package by.milosh.task4;

import by.milosh.core.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchService {

    public String bfs(Tree tree) {
        StringBuilder str = new StringBuilder();
        Queue<Tree.Node> queue = new LinkedList<>();
        Tree.Node node = tree.getRoot();
        if (node != null) {
            queue.add(node);
        }
        while (!queue.isEmpty()) {
            node = queue.poll();
            str.append(node.getKey());
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
        return str.toString();
    }
}
