package csc223.jf;


public class BinarySearchTree {

    intTreeNode root;
    
    class intTreeNode{
        intTreeNode left;
        intTreeNode right;
        int data;


        // all methods should be recursive
        public intTreeNode(int data){
            this.left = null;
            this.right = null;
            this.data = data;


        }
    }

    public BinarySearchTree(int data){
        this.root = new intTreeNode(data);
    }

    public intTreeNode insert(int item){
        // Inserts a new element to the BST. If the element is already in the BST, it should not be added again.sa
        if (this.isEmpty()){
            intTreeNode newNode = new intTreeNode(item);
            this.root = newNode;
        }
        return this.insert(item, this.root);
    }


    private intTreeNode insert (int item, intTreeNode currNode){
        
        intTreeNode newNode = new intTreeNode(item);
        if (currNode.data <= item){
            if (currNode.left == null){
                currNode.left = newNode;
            }
            return newNode;
        }
        return insert(item, currNode.left);
        
        } else {
            if (currNode.data >= item){
                if (currNode.right == null){
                    currNode.right = newNode;
                }
                return newNode;
            }
        return insert(item, currNode.left);
            
    }

    public void delete(int item){
        //Deletes an element from the BST. If the element is not in the BST, the method should do nothing.
        
        root = deleteHelper(item, root);
        


    }

    private intTreeNode deleteHelper(int item, intTreeNode currNode){
        if (item < currNode.data && currNode.left.data !=  item){
            deleteHelper(item, currNode.left);

        } else if (item > currNode.data && currNode.right.data != item){
                deleteHelper(item, currNode.right);
        }
        else{
            if (currNode.left == null && currNode.right == null){
                return null;
            }
            else if(currNode.left == null && currNode.right != null){
                return currNode.right;
            }
            else if(currNode.right == null && currNode.left != null) {
                return currNode.left;
            }
            else{
                return findMin(currNode.right);
            }

        } 
        return currNode;
    }


    public intTreeNode findMin(intTreeNode currNode){
        if (currNode.left == null){
            return currNode;
        }
        return findMin(currNode.left);
    }


    public intTreeNode findMax(intTreeNode currNode){
        if (currNode.right == null){
            return currNode;
        }
        return findMax(currNode.right);
    }

    public intTreeNode search(int item){
        // Returns true if the BST contains the specified element, and false otherwise.
        return searchHelper(root, item);


    }

    private intTreeNode searchHelper(intTreeNode currNode, int item){
        if (currNode == null || currNode.data == item){
            return currNode;
        }

        if (item > currNode.data){
            return searchHelper(currNode.right, item);
        }
        return searchHelper(currNode.left, item);
    }

    public void update(int oldValue, int newValue){
        //Updates an element in the BST. If the element is not in the BST, the method should do nothing.
        delete(oldValue);
        insert(newValue);
    }


    public void inOrder(intTreeNode currNode){
        // Returns a string representation of all elements in the BST in in-order traversal.
        if (currNode != null){
            inOrder(currNode.left);
            System.out.println(currNode.data + " ");
            inOrder(currNode.right);
        }
    }

    public intTreeNode sortedArrayToBST(int[] values){
        // Creates a height-balanced BST from a sorted array of integers. 
        // The method should return the root of the BST.
        return sortedArrayToBSTHelper(values, 0, values.length-1);
    }

    private intTreeNode sortedArrayToBSTHelper(int[] values, int left, int right){
        // Creates a height-balanced BST from a sorted array of integers. 
        // The method should return the root of the BST.
        if (left > right){
            return null;
        }
        int mid = (left + right) / 2;
        intTreeNode node = new intTreeNode(values[mid]);
        node.left = sortedArrayToBSTHelper(values, left, mid-1);
        node.right = sortedArrayToBSTHelper(values, mid +1, right);
        return node;
    }

    public intTreeNode lowestCommonAncestor(int p, int q){
        // Returns the lowest common ancestor of two elements in the BST. 
        // If either element is not in the BST, the method should return -1.
        if (root == null){
            return -1;
        }
        if (root == p || root == q){
            return root;
        }

        if (p < root.data && q < root.data){
            return lowestCommonAncestor(root.left, p, q);
        }else if 
            (p > root.data && q > root.data) {
            return lowestCommonAncestor(root.right, p, q);
        } else{
            return root;

        }

    }

}
