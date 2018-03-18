/*
  Coded By : Medi Assumani
  Language : Java
  Topic : Linked List

  Purpose : Implementing The Linked List Data Structure from scratch
*/
import java.util.*;

public class LinkedList{//outer class
  /*
    * The Node class acts as an helper inner class for the Linked List Class
    * @param AnyType : The type parameter. e,g : Interger, String, Double
  */
  private static class Node<AnyType>{

    private AnyType data;
    private Node<AnyType> next;

    public Node(AnyType data, Node<AnyType> next){
      this.data = data;
      this.next = next;
    }
  } //  end of the Node Class

    // the netry point of the List
  private Node<AnyType> head;

// Contructs an empty Linked list
  public LinkedList(){
    this.head = null;
  }
    // checks if the list is empty and returns a true or false value
  public boolean isEmpty(){

  }

}
