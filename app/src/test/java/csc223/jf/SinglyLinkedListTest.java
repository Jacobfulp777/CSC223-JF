package csc223.jf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class SinglyLinkedListTest{

    SinglyLinkedList testList;


    @BeforeEach
    public void setup() {
        testList = new SinglyLinkedList();
        
    }

    @Test
    // Insert an item at the end of the list for unsorted lists
    public void insert(){
        char[] testArray = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < testArray.length; i++){
            testList.insert(testArray[i]);
            assertEquals(testArray[i], testList.getLast());
        }
    }
    @Test
    // Removes an item from the list
    public void remove(){
        testList.insert('a');
        //System.out.println(testList);
        testList.remove('a');
        //System.out.println(testList);
        assertFalse(testList.contains('a'));
        

    }
    @Test
    // Get the first item, return '☠' if the list is empty
    public void getFirst(){
        testList.insert('a');
        assertEquals('a', testList.getFirst());
    }
    @Test
    // Get the last item, return '☠' if the list is empty
    public void getLast(){
        testList.insert('a');
        assertEquals('a', testList.getLast());
    }
    @Test
    // Get an item at a specific index, return '☠' if index is out of bounds
    public void get(int index){
        assertEquals('a', testList.get(0));
    }

    @Test
    // Get the size of the list
    public void size(){
        testList.insert('a');
        testList.insert('b');
        assertEquals(2, testList.size());
    }

    @Test
    // Check if the list is empty
    public void isEmpty(){
        SinglyLinkedList emptyList = new SinglyLinkedList();
        assertTrue(emptyList.isEmpty());
    }

    @Test
    // Clear the list
    public void clear(){
        testList.clear();
        assertTrue(testList.isEmpty());
    }

    @Test
    // Check if the list contains an item
    public void contains(char item){
        testList.insert('b');
        assertTrue(testList.contains('b'));
    }

    @Test
    // Get the index of an item, if it exists else return -1
    public void indexOf(char item){
        assertEquals(0, testList.indexOf('a'));
    }

    @Test
    // Get the last index of an item, if it exists else return -1
    public void lastIndexOf(char item){
        testList.insert('a');
        testList.insert('b');
        testList.insert('c');
        assertEquals(3, testList.lastIndexOf('c'));
    }

    @Test
    // Reverse the list
    public void reverse(){
        char[] reversedList = {'e','d','c','b','a'};
        for (int i =0; i < reversedList.length; i++){
            assertEquals(reversedList[i], testList.get(i));
        }

    }

    @Test
    // Creates and returns a String representation of the list
    // e.g. `A -> B -> C -> D` should return "ABCD"
    public void toStringTest(){
        String testString = "A -> B -> C -> D -> E";
        assertEquals(testString, testList.toString());
    }
}


