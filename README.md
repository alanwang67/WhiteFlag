# White Flag
George Liang
<br>
Alan Wang
# Methods to implement 
1. Void Methods
	* addLast()
	* addFirst()
2. Generic Object Returning Methods
	* removeLast()
	* removeFirst()
	* peekFirst()
	* peekLast()
	* getFirst()
	* getLast()
	* pollFirst()
	* pollLast()
3. Primitive Returning Methods
	* isEmpty()
	* size()
# Rationale for choosing ArrayList-based architecture
We choose the ArrayList-based architecture because we had to access to indexes and individual elements. In addition the get method only has a runtime of O(1) compared to O(n) for the nodes. This means if we were to iterate through the ArrayList it would only be O(n) runtime however if we used nodes it would be O(n^2). 
# To Do List
	* As of 2018-04-18 we plan to get our addLast() and addFirst() methods done by implementing isEmpty() first as different operations are performed if a deque is empty.
# Development Plan
Implement methods around isEmpty starting with the adding methods in order to construct our basic deque. After that, we will implement the peek and the get methods and move 
onto remove elements from deque. Then, we will figure out what more methods we need to implement in order to have a functional deque that allows for the best usage of it.
