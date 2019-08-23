package by.milosh.task1;

import by.milosh.core.Tree;
import by.milosh.entity.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NodeCountServiceTest {

    NodeCountService nodeCountService = new NodeCountService();

    @Test
    public void countNodesInteger() {
        Tree tree = new Tree();
        tree.insert(8);
        tree.insert(3);
        tree.insert(10);
        tree.insert(1);
        tree.insert(6);
        tree.insert(14);
        tree.insert(4);
        tree.insert(7);
        tree.insert(13);
        int nodes = nodeCountService.countNodes(tree);
        int expectedNodes = 9;
        assertEquals(nodes, expectedNodes);
    }

    @Test
    public void countNodesChar() {
        Tree tree = new Tree();
        tree.insert('f');
        tree.insert('d');
        tree.insert('g');
        tree.insert('c');
        tree.insert('e');
        int nodes = nodeCountService.countNodes(tree);
        int expectedNodes = 5;
        assertEquals(nodes, expectedNodes);
    }

    @Test
    public void countNodesString() {
        Tree tree = new Tree();
        tree.insert("hello");
        tree.insert("world");
        tree.insert("sasha");
        tree.insert("alexander");
        tree.insert("belarus");
        tree.insert("minsk");
        int nodes = nodeCountService.countNodes(tree);
        int expectedNodes = 6;
        assertEquals(nodes, expectedNodes);
    }

    @Test
    public void countNodesObject() {
        Tree tree = new Tree();
        tree.insert(new Person("smith", "john"));
        tree.insert(new Person("smith", "aaron"));
        tree.insert(new Person("williams", "william"));
        tree.insert(new Person("johnson", "william"));
        int nodes = nodeCountService.countNodes(tree);
        int expectedNodes = 4;
        assertEquals(nodes, expectedNodes);
    }

    @Test
    public void countNodesLoop() {
        Tree tree = new Tree();
        tree.insert(8);
        tree.insert(3);
        tree.insert(10);
        tree.insert(1);
        tree.insert(6);
        tree.insert(14);
        tree.insert(4);
        tree.insert(7);
        tree.insert(13);
        int nodes = nodeCountService.countNodesLoop(tree);
        int expectedNodes = 9;
        assertEquals(nodes, expectedNodes);
    }
}
