public interface Deque<Card> {

    //Retrieves and removes the first element of this deque.
    public Card removeFirst();

    //Inserts the specified element at the end of this deque if it is
    //possible to do so immediately without violating capacity restrictions
    public void addLast( Card x );

    //Returns true if this queue is empty, otherwise returns false.
    public boolean isEmpty();
    
    //Returns the first element of the deque without dequeuing it.
    public Card peekFirst();

}//end interface Deque                                                                                           
