package by.milosh.task3;

import by.milosh.core.Tree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepthFirstSearchServiceTest {

    DepthFirstSearchService service = new DepthFirstSearchService();

    Tree tree1 = new Tree();
    Tree tree2 = new Tree();

    @Before
    public void before() {
        tree1.insert('f');
        tree1.insert('b');
        tree1.insert('g');
        tree1.insert('a');
        tree1.insert('d');
        tree1.insert('i');
        tree1.insert('c');
        tree1.insert('e');
        tree1.insert('h');

        tree2.insert('3');
        tree2.insert('2');
        tree2.insert('4');
        tree2.insert('1');
        tree2.insert('7');
        tree2.insert('6');
        tree2.insert('8');
    }

    @Test
    public void testPreOrder1() {
        String preOrderSearch = service.preOrderSearch(tree1);
        String expectedString = "fbadcegih";
        assertEquals(preOrderSearch, expectedString);
    }

    @Test
    public void testInOrder1() {
        String preOrderSearch = service.inOrderSearch(tree1);
        String expectedString = "abcdefghi";
        assertEquals(preOrderSearch, expectedString);
    }

    @Test
    public void testPostOrder1() {
        String preOrderSearch = service.postOrderSearch(tree1);
        String expectedString = "acedbhigf";
        assertEquals(preOrderSearch, expectedString);
    }

    @Test
    public void testPreOrder2() {
        String preOrderSearch = service.preOrderSearch(tree2);
        String expectedString = "3214768";
        assertEquals(preOrderSearch, expectedString);
    }

    @Test
    public void testInOrder2() {
        String preOrderSearch = service.inOrderSearch(tree2);
        String expectedString = "1234678";
        assertEquals(preOrderSearch, expectedString);
    }

    @Test
    public void testPostOrder2() {
        String preOrderSearch = service.postOrderSearch(tree2);
        String expectedString = "1268743";
        assertEquals(preOrderSearch, expectedString);
    }
}
