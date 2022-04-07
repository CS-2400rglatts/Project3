public class BinaryTree<T> implements BinaryTreeInterface<T>
{
   private BinaryNode<T> root;

   public BinaryTree()
   {
      root = null;
   } // end default constructor

   public BinaryTree(T rootData)
   {
      root = new BinaryNode<>(rootData);
   } // end constructor

   public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
   {
      initializeTree(rootData, leftTree, rightTree);
   } // end constructor
   
    public BinaryTree(String preorderString, String inorderString) {
      //splits strings into string arrays without empty space in the front
      String[] preorder = preorderString.split("(?!^)");
      String[] inorder = inorderString.split("(?!^)");
      
      
      int middle = 0;
      String preorderbeg = "";
      String inorderbeg = "";
      String preorderend = "";
      String inorderend = "";
      T rootData;
      
      if (preorder.length > 1) {
         //finds where preorder value is in the inorder traversal
         for (int i = 0; i < preorder.length; i++) {
            if (preorder[0].equals(inorder[i])) {
               middle = i;
               break;
            }
         }
         //creates the new strings for preorder and inorder
         for (int i = 1; i < middle + 1; i++) {
            preorderbeg += (preorder[i]);
         }
         for (int i = 0; i < middle; i++) {
            inorderbeg += inorder[i];
         }
         for (int i = middle+1; i < preorder.length; i++) {
            preorderend += preorder[i];
            inorderend += preorder[i];
         }
         //recursively calls BinaryTree to create the left tree using the new preorder and inorder strings
         BinaryTree<T> leftTree = new BinaryTree<>(preorderbeg, inorderbeg);
         //once the left trees are created it recursively creates the right trees
         BinaryTree<T> rightTree = new BinaryTree<>(preorderend, inorderend);
         rootData = (T) preorder[0];
         //creates the tree with the top root and the subtrees
         initializeTree(rootData, leftTree, rightTree);
         //preorder: ABDEC
         //inorder: DBEAC
         //should be D E B C A
      } 
   }

   public void setTree(T rootData, BinaryTreeInterface<T> leftTree,
                                   BinaryTreeInterface<T> rightTree)
   {
      initializeTree(rootData, (BinaryTree<T>)leftTree,
                               (BinaryTree<T>)rightTree);
   } // end setTree

   public void setRootData(T rootData)
   {
      root.setData(rootData);
   } // end setRootData
   
   public T getRootData()
   {
      if (isEmpty())
         throw new EmptyTreeException();
      else
         return root.getData();
   } // end getRootData
   
   public boolean isEmpty()
   {
      return root == null;
   } // end isEmpty
   
   public void clear()
   {
      root = null;
   } // end clear
   
   protected void setRootNode(BinaryNode<T> rootNode)
   {
      root = rootNode;
   } // end setRootNode
   
   protected BinaryNode<T> getRootNode()
   {
      return root;
   } // end getRootNode
   
   private void initializeTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
   {
      root = new BinaryNode<>(rootData);
      
      if ((leftTree != null) && !leftTree.isEmpty())
         root.setLeftChild(leftTree.root);
      
      if ((rightTree != null) && !rightTree.isEmpty())
      {
         if (rightTree != leftTree)
            root.setRightChild(rightTree.root);
         else
            root.setRightChild(rightTree.root.copy());
      } // end if
      
      if ((leftTree != null) && (leftTree != this))
         leftTree.clear();
      
      if ((rightTree != null) && (rightTree != this))
         rightTree.clear();
   } // end initializeTree
   
   /** -------------------------------------------------------------------- */
   /** Task 1: Implement the 4 methods
    *     . In BinaryTree.java
    *          1. public void postorderTraverse();
    *          2. private void postorderTraverse(BinaryNode<T> node)
    *          3. public void postorderTraverse_callBinaryNodeMethod()
    *     . In BinaryNode.java
    *          4. public void postorderTraverse_binaryNodeMethod() */
   
   /** calls postorderTraverse(BinaryNode<T> node)
    * prints (using post-order traversal) all nodes in the "whole" tree */
   public void postorderTraverse()
   { 
      postorderTraverse(root); //calls postorderTraverse to traverse and print 
   }
   
   /** A Recursive Method in the BinaryTree Class   
    * prints (using post-order traversal) all nodes in the subtree rooted at this node.*/
   private void postorderTraverse(BinaryNode<T> node)
   {
      if (node != null){
         postorderTraverse(node.getLeftChild());
         postorderTraverse(node.getRightChild());
         System.out.println(node.getData());
      }
   }
 
   /** The following calls postorderTraverse_binaryNodeMethod(), which is a recursive binaryNode class method   
    * prints (using post-order traversal) all nodes in the "whole" tree */
   public void postorderTraverse_callBinaryNodeMethod()
   {
         root.postorderTraverse_binaryNodeMethod();
   }
   
   /** -------------------------------------------------------------------- */
   /** Task 2: Implement the 2 methods
    *     . In BinaryTree.java
    *          1. public int getHeight_callBinaryNodeMethod()
    *     . In BinaryNode.java
    *          2. public int getHeight_binaryNodeMethod()*/
   
   /** calls getHeight(BinaryNode<T> node)
   @return  The height of the "whole" tree */
   public int getHeight()
   {
	   return getHeight(root);
   } // end getHeight
   
   /** A Recursive Method in the BinaryTree Class  
    * Computes the height of the subtree rooted at this node.
   @return  The height of the subtree rooted at this node. */
   private int getHeight(BinaryNode<T> node)
   {
      int height = 0;
      if (node != null)
         height = 1 + Math.max(getHeight(node.getLeftChild()),
                               getHeight(node.getRightChild()));
      return height;
   } // end getHeight
   
   /** The following calls getHeight_binaryNodeMethod() which is a recursive binaryNode class method
    * Computes the height of the "whole" tree.
   @return  The height of the "whole" tree. */
   public int getHeight_callBinaryNodeMethod()
   {
      int height = 0;
      if (root != null){
         height = root.getHeight_binaryNodeMethod();
      }
      return height;
   } // end getHeight_callBinaryNodeMethod

   /** -------------------------------------------------------------------- */
   /** Task 3: Implement the 2 methods
    *     . In BinaryTree.java
    *          1. public int getNumberOfNodes()
    *          2. private int getNumberOfNodes(BinaryNode<T> node)*/
   
   /** calls getNumberOfNodes(BinaryNode<T> node) 
   @return  The number of nodes in the "whole" tree */
   public int getNumberOfNodes()
   {
      return getNumberOfNodes(root);
   } // end getNumberOfNodes
   
   /** A Recursive Method in the BinaryTree Class   
    * Counts the nodes in the subtree rooted at this node.
   @return  The number of nodes in the subtree rooted at this node. */
   private int getNumberOfNodes(BinaryNode<T> node)
   {
      int numOfNodes = 0;
      int leftNumber = 0;
      int rightNumber = 0;
      
      if (node.getLeftChild() != null)
         leftNumber = getNumberOfNodes(node.getLeftChild());
	 
      if (node.getRightChild() != null)
         rightNumber = getNumberOfNodes(node.getRightChild());
	 
      return 1 + leftNumber + rightNumber;
   } // end getNumberOfNodes
   
   /** The following calls getNumberOfNodes_binaryNodeMethod() which is a recursive binaryNode class method
    * Counts the nodes in the "whole" tree
   @return  The number of nodes in the "whole" tree. */
   public int getNumberOfNodes_callBinaryNodeMethod()
   {
	   return root.getNumberOfNodes_binaryNodeMethod();
   } // end getNumberOfNodes_callBinaryNodeMethod
   
} // end BinaryTree
