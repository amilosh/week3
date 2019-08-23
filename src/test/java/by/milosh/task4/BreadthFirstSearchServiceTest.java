package by.milosh.task4;

import by.milosh.core.Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BreadthFirstSearchServiceTest {

    BreadthFirstSearchService service = new BreadthFirstSearchService();

    @Test
    public void searchString1() {
        Tree tree = new Tree();
        tree.insert('f');
        tree.insert('b');
        tree.insert('g');
        tree.insert('a');
        tree.insert('d');
        tree.insert('i');
        tree.insert('c');
        tree.insert('e');
        tree.insert('h');
        String bsfSearch = service.bfs(tree);
        String expected = "fbgadiceh";
        assertEquals(bsfSearch, expected);
    }

    @Test
    public void searchString2() {
        Tree tree1 = new Tree();
        tree1.insert('3');
        tree1.insert('2');
        tree1.insert('4');
        tree1.insert('1');
        tree1.insert('7');
        tree1.insert('6');
        tree1.insert('8');
        String bsfSearch = service.bfs(tree1);
        String expected = "3241768";
        assertEquals(bsfSearch, expected);
    }
}
