//Team WhiteFlag (George Liang, Alan Wang)
//APCS2 pd08
//L02 -- All Hands on Deque!
//2018-04-19
public interface Deque<T> {

    //Retrieves and removes the first element of this deque.
    public T removeFirst();

    //Retrieves and removes the last element of this deque.
    public T removeLast();
    
    //Inserts the specified element at the end of this deque if it is
    //possible to do so immediately without violating capacity restrictions
    public void addLast( T x );
    
    //Inserts the specified element at the front of this deque if it is
    //possible to do so immediately without violating capacity restrictions
    public void addFirst( T x );

    //Returns true if this queue is empty, otherwise returns false.
    public boolean isEmpty();
    
    //Returns the first element of the deque without dequeuing it.
    public T peekFirst();

    //Retrieves, but does not remove, the last element of this deque,
    //or returns null if this deque is empty.
    public T peekLast();
    
    //Retrieves, but does not remove, the first element of this deque.
    //This method differs from peekFirst only in that it throws an exception
    //if this deque is empty.
    public T getFirst();

    //Retrieves, but does not remove, the last element of this deque.
    //This method differs from peekFirst only in that it throws an exception
    //if this deque is empty.
    public T getLast();

    //Retrieves and removes the first element of this deque,
    //or returns null if this deque is empty.
    public T pollFirst();

    //Retrieves and removes the last element of this deque,
    //or returns null if this deque is empty.
    public T pollLast();
    
    //Returns the number of elements in this deque.
    public int size();

    //Removes the first occurrence of the specified element from this deque. 
    //If the deque does not contain the element, it is unchanged
    public boolean removeFirstOccurrence(T x);
    
}//end interface Deque                                                                                           
