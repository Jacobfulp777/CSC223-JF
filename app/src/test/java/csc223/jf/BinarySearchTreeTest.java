package csc223.jf;
import javax.xml.transform.TransformerConfigurationException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;
import java.util.List;

public class BinarySearchTreeTest {
    BinarySearchTree testTree;

    @BeforeEach
    void setup(){
        testTree = new BinarySearchTree(1);

        testTree.insert(2);
        testTree.insert(3);
        testTree.insert(4);
        testTree.insert(5);
    }

    @Test
    public void testInsert(){
        testTree.insert(6);
        assertTrue(testTree.search(6));
    }

    @Test
    public void testDelete(){
        testTree.delete(2);
        assertFalse(testTree.search(2));
    }

    @Test
    public void testSearch(){
        assertTrue(testTree.search(2));
        assertFalse(testTree.search(7));
    }
    
    @Test
    public void testUpdate(){
        testTree.update(3,9);
        assertTrue(testTree.search(9));
    }

    @Test
    public void testInOrder(){
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(nums, testTree.inOrder());
    }

    @Test
    public void testToBST(){
        int[] numsBST = {11, 12, 13, 14, 15};
        assertTrue(testTree.search(13));
        assertTrue(testTree.search(11));
        assertTrue(testTree.search(15));
    }

    @Test
    public void testLowestAncestor(){
        assertEquals(3, testTree.lowestCommonAncestor(2, 4));
    }
}
