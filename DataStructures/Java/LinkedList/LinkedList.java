/*
  Coded By : Medi Assumani
  Language : Java
  Topic : Linked List

  Purpose : Implementing The Linked List Data Structure from scratch
*/
import java.util.*;

/*
  * The Node class acts as an helper class for the Linked List Class
  * @param AnyType : The generuc parameter type . e,g : Interger, String, Double
*/
private static Node<AnyType>{

  private AnyType data;
  private Node<AnyType> next;

  public Node(AnyType data, Node<AnyType> next){
    this.data = data;
    this.next = next;
  }
} //  end of the Node Class

/*
  * The LinkedList class is the outer class of the LinkedList
  * The <AnyType> Generic Type means that we can have a list of String, Integers, Doubles, etc..
*/
public class LinkedList<AnyType>{//outer class

      // LINKEDLIST CLASS INSTANCE VARIABLES
  private Node<AnyType> head;

        // LINKEDLIST CLASS CONSTRUCTOR
  public LinkedList(){
    head = null;
  }

        // HELPFUL METHODS
      // returns a true or false value on wheater or not the list is empty
  public boolean isEmpty(){
    return (head == null);
  }
        //inserts an element in the begining of the list
  public void addFirst(AnyType data){
    if (this.isEmpty()){
      this.head = new Node<AnyType>(data,head)
    }
  }

    // appends an element in the end of the linked List
  public void addLast(AnyType data){

  }
}
