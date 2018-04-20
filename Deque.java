public interface Deque<Card> {

    //Retrieves and removes the first element of this deque.
    public Card removeFirst();

    //Retrieves and removes the last element of this deque.
    public Card removeLast();
    
    //Inserts the specified element at the end of this deque if it is
    //possible to do so immediately without violating capacity restrictions
    public void addLast( Card x );

    //Returns true if this queue is empty, otherwise returns false.
    public boolean isEmpty();
    
    //Returns the first element of the deque without dequeuing it.
    public Card peekFirst();

    //Retrieves, but does not remove, the last element of this deque,
    //or returns null if this deque is empty.
    public Card peekLast();
    
    //Retrieves, but does not remove, the first element of this deque.
    //This method differs from peekFirst only in that it throws an exception
    //if this deque is empty.
    public Card getFirst();

    //Retrieves, but does not remove, the last element of this deque.
    //This method differs from peekFirst only in that it throws an exception
    //if this deque is empty.
    public Card getLast();

    //Retrieves and removes the first element of this deque,
    //or returns null if this deque is empty.
    public Card pollFirst();

    //Retrieves and removes the last element of this deque,
    //or returns null if this deque is empty.
    public Card pollLast();
    
    //Returns the number of elements in this deque.
    public int size();

    //Removes the first occurrence of the specified element from this deque. 
    //If the deque does not contain the element, it is unchanged
    public boolean removeFirstOcurrence(Card x);
    
}//end interface Deque                                                                                           
