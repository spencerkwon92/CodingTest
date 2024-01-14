import java.util.*;

public interface MyTree<T>{
  void insert(T data);
  void delete(T data);
  boolean search(T data);
  int size();
}

public class BinarySearchTree<T extends Comparable<T>> implements MyTree<T>{
  class Node {
    T data;
    Node left;
    Node right;
  }

  private Node root;
  private int size;

  public BinarySearchTree(){
    this.root = null;
    this.size = 0;
  }

  private T minNode(Node node){
    T minData = node.data;

    while(node.left != null){
      minData = node.left.data;
      node = node.left;
    }

    return minData;
  }

  private T maxNode(Node node){
    T maxData = node.data;

    while(node.right != null){
      maxData = node.right.data;
      node = node.right;
    }

    return maxData;
  }

  public List<T> preOrder(){
    return this.preOrderTree(this.root, new ArrayList<>());
  }

  private List<T> preOrderTree(Node node, List<T> visited){
    if(node == null) return visited;

    visited.add(node.data);
    preOrderTree(node.left, visited);//recursion...
    preOrderTree(node.right, visited);

    return visited;
  }
}

