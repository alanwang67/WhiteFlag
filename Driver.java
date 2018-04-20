public class Driver{
    public static void main(String[]args){
    QQKachoo<String> t = new QQKachoo<String>();
    System.out.println(t.isEmpty()); //Expecting true;
    //System.out.println(t.removeFirstOccurrence("polly")); //Will throw exception
    System.out.println(t.size());//Expecting 0
    //Both methods below will throw exceptions
    //t.removeLast();
    //t.removeFirst();
    t.addFirst("bob");
    t.addFirst("tom");
    t.addFirst("jerry");
    System.out.println(t.size());//Expecting 3
    System.out.println("Checking First " + t.peekFirst());
    System.out.println("Checking Last " + t.peekLast());
    t.removeFirstOccurrence("bob");
    System.out.println(t.size());//Size should be 2
    System.out.println(t.peekLast());//Expecting tom
    t.addLast("timmy");
    System.out.println(t.peekLast());//Expecting timmy
    System.out.println(t.pollLast());//Expecting timmy
    System.out.println(t.pollFirst());//Expecting jerry
    }
}