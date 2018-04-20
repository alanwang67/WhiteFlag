# White Flag
George Liang
<br>
Alan Wang
# Methods to implement 
1. Void Methods
	* addLast(D x)
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
	* removeFirstOccurence(D x)
	
# Method selection and Priority of implementation
Methods were chosen based on similarity to useability in a deque in which objects can be removed from the front or the back. Any methods that seemed unique to deque were later implemented in order to maintain functionality.
Methods were implemented based on easiness and runnability in priority. Any methods with similar functionality to one of higher priority were implemented later on. 

## (Top --> High Priority | Bottom --> Low Priority)
	* isEmpty()
	* size()
	* addLast(D x)
	* addFirst()
	* peekFirst()
	* peekLast()
	* removeLast()
	* removeFirst()
	* getFirst()
	* pollLast()
	* pollFirst()
	* pollLast()
	* removeFirstOccurence(D x)
	
# Rationale for choosing ArrayList-based architecture
We began with checking Deque interface methods for its differences to the other Queues we have made. We found a method called removeFirstOccurence(D x) that removes the first occurence of specified object. 
This method seems to set the Deque apart from Queues in that it can also remove specfic occurences of an object. As a result, we implemented Deque in ArrayList-based architecture because we can access elements with O(1)
time using the get element at index, at a much faster runtime than the get at index for a series of nodes which runs in O(n) allowing us to traverse a whole deque to find an element at the end in O(n) time rather than O(n^2) in 
a doubly node-based architecturer. 

# To Do List
	* As of 2018-04-18 we plan to get our addLast() and addFirst() methods done by implementing isEmpty() first as different operations are performed if a deque is empty.
	* As of 2018-04-19 we tackled exception throwing and implementing lower priority methods. We found a lot of methods that were similar to the ones we had and thought it was nice to implement them.
	
# Development Plan
Implement methods around isEmpty starting with the adding methods in order to construct our basic deque. After that, we will implement the peek and the get methods and move 
onto remove elements from deque. Then, we will figure out what more methods we need to implement in order to have a functional deque that allows for the best usage of it that 
sets it apart from other Queue-like structures.
