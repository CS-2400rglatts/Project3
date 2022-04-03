package project3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TreeTest {

    /**Tests postorderTraverse with a normal binary tree */
    @Test
    public void testPostorderTraverse() {
        BinaryTree <String> a = new BinaryTree<>("a");
        BinaryTree <String> b = new BinaryTree<>("b");
        BinaryTree <String> c = new BinaryTree<>("c", a, b);
        BinaryTree <String> d = new BinaryTree<>("d");
        BinaryTree <String> e = new BinaryTree<>("e", c, d);
        e.postorderTraverse();
    }

    /** Tests postorderTraverse with an empty binary tree */
    @Test
    public void testPostorderTraverseEmpty() {
        BinaryTree <String> e = new BinaryTree<>(null);
        e.postorderTraverse();
    }

    /**Tests PostorderTraverse_callBinaryNodeMethod */
    @Test
    public void testPostorderTraverse_callBinaryNodeMethod() {
        BinaryTree <String> a = new BinaryTree<>("a");
        BinaryTree <String> b = new BinaryTree<>("b");
        BinaryTree <String> c = new BinaryTree<>("c", a, b);
        BinaryTree <String> d = new BinaryTree<>("d");
        BinaryTree <String> e = new BinaryTree<>("e", c, d);
        e.postorderTraverse_callBinaryNodeMethod();

    }

    /**Tests PostorderTraverse_callBinaryNodeMethod with an empty tree */
    @Test
    public void testPostorderTraverse_callBinaryNodeMethodEmpty() {
        BinaryTree <String> e = new BinaryTree<>(null);
        e.postorderTraverse_callBinaryNodeMethod();

    }

    /** Tests PostorderTraverse_binaryNodeMethod with normal binary nodes*/
    @Test
    public void testPostorderTraverse_binaryNodeMethod() {
        BinaryNode <String> a = new BinaryNode<>("a");
        BinaryNode <String> b = new BinaryNode<>("b");
        BinaryNode <String> c = new BinaryNode<>("c", a, b);
        BinaryNode <String> d = new BinaryNode<>("d");
        BinaryNode <String> e = new BinaryNode<>("e", c, d);
        e.postorderTraverse_binaryNodeMethod();

    }

     /** Tests PostorderTraverse_binaryNodeMethod with an empty binary node  */
     @Test
     public void testPostorderTraverse_binaryNodeMethodEmpty() {
         BinaryNode <String> e = new BinaryNode<>(null);
         e.postorderTraverse_binaryNodeMethod();
 
     }

    /** Tests getHeight_callBinaryNodeMethod with a normal binary tree */
    @Test
    public void testgetHeight_callBinaryNodeMethod() {
        BinaryTree <String> a = new BinaryTree<>("a");
        BinaryTree <String> b = new BinaryTree<>("b");
        BinaryTree <String> c = new BinaryTree<>("c", a, b);
        BinaryTree <String> d = new BinaryTree<>("d");
        BinaryTree <String> e = new BinaryTree<>("e", c, d);
        e.getHeight_callBinaryNodeMethod();
        assertEquals(3, e.getHeight_callBinaryNodeMethod());
    }

    
    /** Tests getHeight_callBinaryNodeMethod with an empty binary tree */
    @Test
    public void testgetHeight_callBinaryNodeMethodEmpty() {
        BinaryTree <String> e = new BinaryTree<>(null);
        e.getHeight_callBinaryNodeMethod();
        assertEquals(1, e.getHeight_callBinaryNodeMethod());
    }

    /** Tests getHeight_binaryNodeMethod with normal binary nodes */
    @Test
    public void testgetHeight_binaryNodeMethod() {
        BinaryNode <String> a = new BinaryNode<>("a");
        BinaryNode <String> b = new BinaryNode<>("b");
        BinaryNode <String> c = new BinaryNode<>("c", a, b);
        BinaryNode <String> d = new BinaryNode<>("d");
        BinaryNode <String> e = new BinaryNode<>("e", c, d);
        assertEquals(3, e.getHeight_binaryNodeMethod());
    }

    /** Tests getHeight_binaryNodeMethodEmpty with an empty binary node */
    @Test
    public void testgetHeight_binaryNodeMethodEmpty() {
        BinaryNode <String> e = new BinaryNode<>(null);
        assertEquals(1, e.getHeight_binaryNodeMethod());
    }

    /** Tests getNumberOfNodes with a normal binary tree */
    @Test
    public void testgetNumberOfNodes() {
        BinaryTree <String> a = new BinaryTree<>("a");
        BinaryTree <String> b = new BinaryTree<>("b");
        BinaryTree <String> c = new BinaryTree<>("c", a, b);
        BinaryTree <String> d = new BinaryTree<>("d");
        BinaryTree <String> e = new BinaryTree<>("e", c, d);
        assertEquals(5, e.getNumberOfNodes());
    }

    /** Tests getNumberOfNodes with an empty binary tree */
    @Test
    public void testgetNumberOfNodesEmpty() {
        BinaryTree <String> e = new BinaryTree<>(null);
        assertEquals(1, e.getNumberOfNodes());
    }

}
