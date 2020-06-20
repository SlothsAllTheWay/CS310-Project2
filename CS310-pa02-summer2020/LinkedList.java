import java.util.Iterator;

//
// Complete this class: 20 points
//
// Note:
// Do NOT copy from textbook, or any other sources
// Do NOT copy from code that we did in class (as it contains errors)
//
// Do READ CODE from textbook and in-class code and write it out as your own code
//
public class LinkedList<T> implements Iterable<T>
{
    public static void main(String [] args)
    {
        //Optional: test LinkedList here
        Double A[]={0.1,0.34,0.7,23.1,-0.75};
        LinkedList<Double> M = new LinkedList<Double>(A);
        System.out.println("Linked List: "+M);
    }


    public LinkedList(T [] A) //create a linked list from an array
    {
		this();
		
		for(int i=0;i<A.length;i++){
			insert(A[i]);
		}
    }

  	public void insert(T data) //insert data into the linked list
  	{
		Node<T> node=new Node<T>(data);
		
		if(head.next==null){
			head.next=node;
			tail.prev=head;
		}
		else{
			tail.prev.next=node;
			node.prev=tail.prev;
			tail.prev=node;
		}
  	}

    private void delete(Node<T> n) //remove node n from the linked list
    {
		if(n.prev!=null)
			n.prev.next=n.next;
		
		if(n.next!=null)
			n.next.prev=n.prev;
		
		n.prev=null;
		n.next=null;
    }

    public boolean is_empty() //check if the string is empty
    {
      return head.next==null;
    }


    public Iterator<T> iterator(){
      return new Iterator<T>(){
			Node<T> current=head.next;
			
			public boolean hasNext(){
				return current!=null;
			}
			
			public T next(){
				T data=current.data;
				current=current.next;
				return data;
			}
		};
    }

    //Note: You will need to implement an iterator class using java.util.Iterator
    //      interface

    //TO DO: implement iterator here

    // ----------------------------------------------------------------------
    //
    // !!! READ but Do NOT Change anything after this line
    //
    // ----------------------------------------------------------------------

    private class Node<T>
    {
      Node(){}
      Node(T data){ this.data=data; }
      public T data;
      public Node<T> next;
      public Node<T> prev; //for doubly linked list
    }

    Node<T> head; //pointing to the location BEFORER the first element
    Node<T> tail; //for doubly linked list
                  //pointing to the location AFTER the last element

    public LinkedList() //constructor
    {
      head=new Node<T>();
      tail=new Node<T>();
      head.next=tail;
      tail.prev=head;
    }

    public T last()
    {
      //nothing to return
      if(head.next==tail) return null;
      return tail.prev.data;
    }

    public String toString()
    {
      String S="(";
      for(T t : this) S=S+t+", ";
      if(is_empty()==false) S=S.substring(0,S.length()-2);
      S=S+")";
      return S;
    }
}
