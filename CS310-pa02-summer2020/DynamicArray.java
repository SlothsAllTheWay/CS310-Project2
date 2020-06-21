import java.util.Iterator;

//
// Complete this class: 15 points
//
// Note:
// Do NOT copy from textbook, or any other sources
// Do NOT copy from code that we did in class (as it contains errors)
//
// Do READ CODE from textbook and in-class code and write it out as your own code
//
public class DynamicArray<T> implements Iterable<T>
{

    public static void main(String [] args)
    {
        //Optional: test DynamicArray here
        DynamicArray<Double> A = new DynamicArray<Double>();
        for(int i=0;i<20;i++) A.insert(Math.random()*100);
		
        for(Double v : A)
        {
          System.out.println(v);
        }
    }

    // Note: You can add any private data and methods here
	
	private T[] array;
	private int size;
	private final int DEFAULT_CAPACITY=2;
	
    @SuppressWarnings("unchecked")
    DynamicArray() //constructor
    {
		 array=(T[])new Object[DEFAULT_CAPACITY];
		 size=0;
    }

    @SuppressWarnings("unchecked")
    public void insert(T data)
    {
		array[size++]=data;
		
		if(size==array.length){
			T[] oldArray=array;
			array=(T[])new Object[size*2];
			
			for(int i=0;i<oldArray.length;i++){
				array[i]=oldArray[i];
			}
		}
    }

    public T get(int index) //get value by index
    {
		checkRange(index);
		
		return array[index];
    }

    public int size() //size of the dynamic array
    {
      return size;
    }

    void delete() //delete the last value in the array
  	{
		if(!is_empty())
			array[--size]=null;
  	}

  	void delete(int loc) //delete element at index "loc"
  	{
		checkRange(loc);
		
		for(int i=loc;i<size-1;i++){
			array[i]=array[i+1];
		}
		
		delete();
  	}

	private void checkRange(int index){
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException();
	}

    boolean is_empty(){ return size==0;} //replace true
	
	public Iterator<T> iterator(){
		return new Iterator<T>(){
			int current=0;
			int size=size();
			T[] data=array;
			
			public boolean hasNext(){
				return current<size;
			}
			
			public T next(){
				return data[current++];
			}
		};
    }

    //Note: You will need to implement an iterator class using java.util.Iterator
    //      interface

    //TO DO: implement iterator here
}