package by.milosh.task2;

import by.milosh.core.Tree;
import by.milosh.entity.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeepServiceTest {

    DeepService deepService = new DeepService();

    @Test
    public void testDeepInteger() {
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(4);
        tree.insert(3);
        tree.insert(2);
        tree.insert(1);
        tree.insert(6);
        int deep = deepService.deep(tree);
        int expectedDeep = 5;
        assertEquals(deep, expectedDeep);
    }

    @Test
    public void testDeepChar() {
        Tree tree = new Tree();
        tree.insert('f');
        tree.insert('d');
        tree.insert('g');
        tree.insert('c');
        tree.insert('e');
        int nodes = deepService.deep(tree);
        int expectedNodes = 3;
        assertEquals(nodes, expectedNodes);
    }

    @Test
    public void testDeepString() {
        Tree tree = new Tree();
        tree.insert("hello");
        tree.insert("world");
        tree.insert("sasha");
        tree.insert("alexander");
        tree.insert("belarus");
        tree.insert("minsk");
        int nodes = deepService.deep(tree);
        int expectedNodes = 4;
        assertEquals(nodes, expectedNodes);
    }

    @Test
    public void testDeepObject() {
        Tree tree = new Tree();
        tree.insert(new Person("smith", "john"));
        tree.insert(new Person("smith", "aaron"));
        tree.insert(new Person("williams", "william"));
        tree.insert(new Person("johnson", "william"));
        int nodes = deepService.deep(tree);
        int expectedNodes = 3;
        assertEquals(nodes, expectedNodes);
    }
}
