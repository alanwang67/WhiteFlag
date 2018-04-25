/*
Purple Frog's DequeTester2.java for Team White Flag
*/

public class DequeTester2{

    public static void main (String[] args){
	Deque<String> a = new QQKachoo<String>();

	//you are missing an addFirst(D x) method!!!
	//a.addFirst("Charlie");
	a.addLast("Brown");
	//a.addFirst("whaterv");
	a.addLast("Charlie");
	System.out.println(a.getFirst()); //should be "Brown"
	System.out.println(a.getLast());//"Charlie"      
	System.out.println(a.removeFirst());//"Brown"
	System.out.println(a.removeLast());//"Charlie"
	/**
	System.out.println(a.removeFirst()); //NoSuchElementException
	**/

	a.addLast("rat");	
	a.addLast("Poland");
	a.addLast("Spring");
	a.addLast("charlie");
	a.addLast("again");
	a.addLast("rat");

	System.out.println(a.pollFirst()); //"rat"
	System.out.println(a.pollLast()); //"rat"
	System.out.println(a.size()); //6
	
	//testing removeFirstOccurence

	System.out.println(a.removeFirstOccurrence("rat")); //true
	System.out.println(a.pollFirst()); //"Poland"
	System.out.println(a.pollLast());// "rat"

	while (! a.isEmpty()){
	    a.removeFirst();
	}
	System.out.println(a.size());

	System.out.println(a.removeFirstOccurrence(null));

    }
}
