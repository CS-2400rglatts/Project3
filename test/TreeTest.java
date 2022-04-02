package project3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TreeTest {

    @Test
    public void testPostorderTraverse() {
        BinaryTree <String> a = new BinaryTree<>("a");
        BinaryTree <String> b = new BinaryTree<>("b");
        BinaryTree <String> c = new BinaryTree<>("c", a, b);
        BinaryTree <String> d = new BinaryTree<>("d");
        BinaryTree <String> e = new BinaryTree<>("e", c, d);
        e.postorderTraverse();

    }

    @Test
    public void testPostorderTraverse_callBinaryNodeMethod() {
        BinaryTree <String> a = new BinaryTree<>("a");
        BinaryTree <String> b = new BinaryTree<>("b");
        BinaryTree <String> c = new BinaryTree<>("c", a, b);
        BinaryTree <String> d = new BinaryTree<>("d");
        BinaryTree <String> e = new BinaryTree<>("e", c, d);
        e.postorderTraverse_callBinaryNodeMethod();

    }

    @Test
    public void testPostorderTraverse_binaryNodeMethod() {
        BinaryNode <String> a = new BinaryNode<>("a");
        BinaryNode <String> b = new BinaryNode<>("b");
        BinaryNode <String> c = new BinaryNode<>("c", a, b);
        BinaryNode <String> d = new BinaryNode<>("d");
        BinaryNode <String> e = new BinaryNode<>("e", c, d);
        e.postorderTraverse_binaryNodeMethod();

    }

    @Test
    public void testgetHeight_callBinaryNodeMethod() {
        BinaryTree <String> a = new BinaryTree<>("a");
        BinaryTree <String> b = new BinaryTree<>("b");
        BinaryTree <String> c = new BinaryTree<>("c", a, b);
        BinaryTree <String> d = new BinaryTree<>("d");
        BinaryTree <String> e = new BinaryTree<>("e", c, d);
        e.getHeight_callBinaryNodeMethod();
        assertEquals(3, e.getHeight_callBinaryNodeMethod())
    }

    @Test
    public void testgetHeight_binaryNodeMethod() {
        BinaryNode <String> a = new BinaryNode<>("a");
        BinaryNode <String> b = new BinaryNode<>("b");
        BinaryNode <String> c = new BinaryNode<>("c", a, b);
        BinaryNode <String> d = new BinaryNode<>("d");
        BinaryNode <String> e = new BinaryNode<>("e", c, d);
        assertEquals(3, e.getHeight_binaryNodeMethod());
    }

    @Test
    public void testgetNumberOfNodes() {
        BinaryTree <String> a = new BinaryTree<>("a");
        BinaryTree <String> b = new BinaryTree<>("b");
        BinaryTree <String> c = new BinaryTree<>("c", a, b);
        BinaryTree <String> d = new BinaryTree<>("d");
        BinaryTree <String> e = new BinaryTree<>("e", c, d);
        assertEquals(5, e.getNumberOfNodes());
    }

}
