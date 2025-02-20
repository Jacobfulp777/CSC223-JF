package csc223.jf;



public class BinaryTree implements Tree {

    TreeNode root;

    /** Get the level order traversal of the tree
         *
         * For example, the level order traversal of the following tree:
         *
         *    A
         *   / \
         *  B   C
         *
         * is "ABC"
         */
        public String levelorder();{

        }
     
     
        //** Get the preorder traversal of the tree: root -> left -> right
        //*
        //* For example, the preorder traversal of the following tree:

       // *
       // *     A
        //*    / \
        //*  B   C
        //* / \
        //* D E
        //*
        //* is "ABDEC"
        //*/
       public String preorder();{

       }
    
    
       /** Get the inorder traversal of the tree: left -> root -> right
        *
        * For example, the inorder traversal of the following tree:
        *
        *        A
        *       / \
        *      B   C
        *     / \
        *    D   E
        *
        * is "DBEAC"
        */
       public String inorder();{

       }
    
    
       /**
        * Get the postorder traversal of the tree:
        *  left -> right -> root
        *
        * For example, the postorder traversal of the following tree:
        *
        *      A
        *     / \
        *   B   C
        *  / \
        *  D E
        *
        * is "DEBCA"
        */
       public String postorder();{

       }
    
    
       /**
        * Insert an item into the tree,
        * using level order traversal to find the correct position
        * If the tree is empty, insert the item at the root node.
        */
       public void insert(char item);{

       }
    
    
       // Check if the tree contains an item
       public boolean search(char item);{

       }
    
    
       // Get the number of nodes in the tree
       public int size();{

       }
    
    
       // Check if the tree is empty
       public boolean isEmpty();{

       }
    
    
       // Get the height of the tree (number of nodes along the longest path from the root node down to the farthest leaf node)
       public int height();{

       }
    
}
