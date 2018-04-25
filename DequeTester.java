public class DequeTester {

    public static void main(String[] args) {
    QQKachoo<String> test = new QQKachoo<String>();

    //There was no method for addFirst... curious
    test.addFirst("Alvin");
    test.addLast("Dave");
    test.addFirst("Ian");
    test.addLast("Simon");
    test.addLast("Theodore");

    System.out.println(test); //Expecting Ian Alvin Dave Simon Theodore
    //Did not get this. There is no toString() method!!!
    
    System.out.println(test.getLast()); //Expecting Theodore
    System.out.println(test.peekLast());// Expecting Theodore
    System.out.println(test.getFirst()); //Expecting Ian
    System.out.println(test.peekFirst()); //Expecting Ian

    System.out.println(test.removeFirst()); //expecting Ian
    System.out.println(test.pollFirst()); //Expecting Alvin
    //Does not remove the element, as it should.

    System.out.println(test.pollLast()); //Expecting Theodore
    //Does not remove the element as it should.

    System.out.println(test.removeFirstOccurrence("Simon")); //Expecting true

    System.out.println(test.size()); //Expecting 1, got 3 because poll methods do not work as they should
    System.out.println(test.removeFirstOccurrence("Alvin"));//Should be false, got true for same reason as above.

    System.out.println(test.removeFirst()); //Expecting Dave
    System.out.println(test.removeFirst()); //Expecting Theodore
    System.out.println(test.isEmpty()); //Expecting true

    //System.out.println(test.removeFirst()); //Expecting it to throw a NoSuchElementException
    //System.out.println(test.removeLast()); //Expecting it to throw a NoSuchElementException
    System.out.println(test.pollFirst()); //Expecting it to return null

    System.out.println(test.peekFirst()); //Expecting null
    }
}
