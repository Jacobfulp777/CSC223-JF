package csc223.jf;

public class BinaryTree implements Tree {

    TreeNode root;

    public BinaryTree(char data){
        root = new TreeNode(data);


    }

    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree('A');
        tree.insert('B');
        tree.insert('C');
        tree.insert('D');
        tree.insert('E');

        System.out.println("level order" + tree.levelorder());
    }


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
    @Override
    public String levelorder(){
        String treeString = new String();

        NodeArrayQueue queue = new NodeArrayQueue(10);
        queue.enqueue(root);        


        TreeNode currNode = this.root;
        while (queue.isEmpty() == false){
            currNode = queue.dequeue();
            treeString += currNode.data;

            if (currNode.left != null){
                queue.enqueue(currNode.left);
            } 

            if (currNode.right != null){
                queue.enqueue(currNode.right);
            }
        }
        return treeString;

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
    @Override
    public String preorder(TreeNode currNode){
        String strNodes = new String();
        if (currNode != null){
            strNodes += currNode.data;
            preorder(currNode.left);
            preorder(currNode.right);
        }
        return strNodes;
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
    @Override
    public String inorder(TreeNode currNode){
        String strNodes = new String();
        if (currNode != null){
            inorder(currNode.left);
            strNodes += currNode.data;
            inorder(currNode.right);
        }
        return strNodes;
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
    @Override 
    public String postorder(TreeNode currNode){
        String strNodes = new String();
        if (currNode != null){
            inorder(currNode.left);
            inorder(currNode.right);
            strNodes += currNode.data;
        }
        return strNodes;
    }
    
    
       /**
        * Insert an item into the tree,
        * using level order traversal to find the correct position
        * If the tree is empty, insert the item at the root node.
        */
    @Override 
    public void insert(char item){
        TreeNode newNode = new TreeNode(item);

        if (this.root == null){
                this.root = newNode;
        }
        else{
            
            TreeNode currNode = this.root;

            NodeArrayQueue queue = new NodeArrayQueue(10);
            queue.enqueue(root);

            while (!queue.isEmpty()){

                if (currNode.left != null){
                    queue.enqueue(currNode.left);
                } else {
                    currNode.left = newNode;                                                                             

                }

                if (currNode.right != null){
                    queue.enqueue(currNode.right);
                } else{
                    currNode.right = newNode;
                }

                }
                currNode = queue.dequeue();
                    
            }

       }
    
    
       // Check if the tree contains an item
    @Override
    public boolean search(char item, TreeNode currNode){
    if (currNode == null){
        return false;
    } else{
        boolean leftCheck = search(item, currNode.left);
        boolean rightCheck = search(item, currNode.right);
        return currNode.data == item || leftCheck || rightCheck;
        
        }
        
       }
    
    
       // Get the number of nodes in the tree
    @Override
    public int size(TreeNode currNode){
    if (currNode == null){
        return 0;
    } else{
        int leftSz = size(currNode.left);
        int rightSz = size(currNode.right);
        return 1 + (leftSz + rightSz);
        
        }
        
    }
    
       // Check if the tree is empty
    @Override
    public boolean isEmpty(){
        return this.root == null;

    }
    
    
       // Get the height of the tree (number of nodes along the longest path from the root node down to the farthest leaf node)
    @Override
    public int height(TreeNode currNode){
    if (currNode == null){
        return 0;
    } else{
        int leftHeight = height(currNode.left);
        int rightHeight = height(currNode.right);
        return 1 + Math.max(leftHeight, rightHeight);
        
    }

    }
    
}
