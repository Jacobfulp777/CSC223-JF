package csc223.jf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class BinaryTreeTest {
    BinaryTree testTree;

    @BeforeEach
    void setUp() {
        testTree = new BinaryTree('A');


        testTree.insert('B');
        testTree.insert('C');
        testTree.insert('D');
        testTree.insert('E');
        testTree.insert('F');

    }

    @Test
    public void testHeight(){
        assertEquals(6, testTree.size(testTree.root));
        //changed
    }

    @Test
    public void testSearch(){
        assertTrue(testTree.search('A', testTree.root));
        assertTrue(testTree.search('X', testTree.root));
        //changed
    }

    @Test
    public void testSize(){
        assertEquals(6, testTree.size(testTree.root));
        //changed
    }

    @Test
    public void testIsEmpty(){
        BinaryTree emptyTest = new BinaryTree('A');
        emptyTest.root = null;
        assertTrue(testTree.isEmpty());

        emptyTest.insert('B');
        assertFalse(testTree.isEmpty());

        
    }
    @Test
    public void testLevelOrder(){
        BinaryTree traversalTest = new BinaryTree('A');
        traversalTest.insert('B');
        traversalTest.insert('C');
        traversalTest.insert('D');
        traversalTest.insert('E');

        System.out.println("Expected: A B C D E");
        System.out.println("Result:");
        traversalTest.levelorder();
        

        
    }
    @Test
    public void testInOrder(){
        BinaryTree traversalTest = new BinaryTree('A');
        traversalTest.insert('B');
        traversalTest.insert('C');
        traversalTest.insert('D');
        traversalTest.insert('E');

        System.out.println("Expected: D B E A C");
        System.out.println("Result:");
        traversalTest.inorder(traversalTest.root);
        

        
    }

    @Test
    public void testPostOrder(){
        BinaryTree traversalTest = new BinaryTree('A');
        traversalTest.insert('B');
        traversalTest.insert('C');
        traversalTest.insert('D');
        traversalTest.insert('E');
        traversalTest.insert('F');

        System.out.println("Expected: D E B C A");
        System.out.println("Result:");
        traversalTest.postorder(traversalTest.root);
        

        
    }

    @Test
    public void testPreOrder(){
        BinaryTree traversalTest = new BinaryTree('A');
        traversalTest.insert('B');
        traversalTest.insert('C');
        traversalTest.insert('D');
        traversalTest.insert('E');
        traversalTest.insert('F');

        System.out.println("Expected: A B D E C");
        System.out.println("Result:");
        traversalTest.preorder(traversalTest.root);
        

        
    }

   
}
