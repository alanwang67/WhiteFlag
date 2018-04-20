import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.lang.NullPointerException;
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
	D temp = deque.get(_last);
	deque.remove(_last);
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
	if (isEmpty()) {
	    return null;
	}
	return deque.get(_first);
    }

    public D peekLast() { //O(1)
	if (isEmpty()) {
	    return null;
	}
	else {
	    return deque.get(_last);
	}
    }

    public D getFirst() { //O(1)
	if (isEmpty()) {
	    throw new NoSuchElementException();
	}
	return deque.get(_first);
    }

    public D getLast() { //O(1)
	if (isEmpty()) {
	    throw new NoSuchElementException();
	}
	return deque.get(_last);
    }
    
    public D pollFirst() { //O(1)
	if (isEmpty()) {
	    return null;
	}
	return deque.get(_first);
    }

    public D pollLast() { //O(1)
	if (isEmpty()) {
	    return null;
	}
	
	return deque.get(_last);
    }

    public int size() { //O(1)
	return _size;
    }
    
    public boolean removeFirstOcurrence(D x){ //O(n)
	if (x == null){
	    throw new NullPointerException();
	}
	else if (isEmpty()){
	    return false;
	}
	for (int i = 0; i < _size;i++){
	    if (deque.get(i).equals(x)){
		deque.remove(i);
		_size--;
		return true;
	    }
	}
	return false;
    }
    
    public static void main ( String[] args) {
    }
}
