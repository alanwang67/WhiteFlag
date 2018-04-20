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

    public D removeLast() { //O(1)
	if (isEmpty()) {
	    throw new NoSuchElementException();
	}
	D temp = deque.get(_size);
	deque.remove(_size);
	_size--;
	return temp;
    }

    public void addFirst( D x ) { //O(1)
	deque.add(0, x);
	    _size++;
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
    
    public boolean isEmpty() { //O(1)
	return _size == 0;
    }
    
    public D peekFirst() { //O(1)
	return deque.get(0);
    }

    public D peekLast() { //O(1)
	if (isEmpty()) {
	    return null;
	}
	else {
	    return deque.get(_size);
	}
    }

    public D getFirst() { //O(1)
	if (isEmpty()) {
	    throw new NoSuchElementException();
	}
	return deque.get(0);
    }

    public D getLast() { //O(1)
	if (isEmpty()) {
	    throw new NoSuchElementException();
	}
	return deque.get(_size);
    }

    
    public static void main ( String[] args) {
    }
}
