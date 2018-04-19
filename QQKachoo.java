import java.util.ArrayList;
import java.util.NoSuchElementException;
public class QQKachoo<D> implements Deque<D> {
    private int _size; 
    private int _first, _last;
    
    ArrayList<D> deque = new ArrayList<D>(); 

    public QQKachoo() { 
	_size = _first = _last = 0;
    }

    public D removeFirst() { //O(n)
	if (isEmpty()) {
	    throw new NoSuchElementException();
	}
	D temp = deque.get(0);
	deque.remove(0);
	_size--;
	return temp;
    }
    
    public void addLast( D x ) { //O(1)
	if (isEmpty()) {
	    deque.add(x);
	    _first = _last = 0;
	}
	else {
	    deque.add(_last + 1, x);
	    _last++; 
	}
	_size++;
    }

    //public addFirst( D x) {

    //}
    
    public boolean isEmpty() {
	return _size == 0;
    }
    
    public static void main ( String[] args) {
    }
}
