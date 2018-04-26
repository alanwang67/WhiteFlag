//Team WhiteFlag (George Liang, Alan Wang)
//APCS2 pd08
//L02 -- All Hands on Deque!
//2018-04-19
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.lang.NullPointerException;
public class QQKachoo<T> implements Deque<T> {
    private int _size; 
    private int _first, _last;
    
    ArrayList<T> deque = new ArrayList<T>(); 

    public QQKachoo() { 
	_size = _first = _last = 0;
    }

    public T removeFirst() { //O(n)
	if (isEmpty()) {
	    throw new NoSuchElementException();
	}
	T temp = deque.get(0);
	deque.remove(0);
	_size--;
	_last = _size - 1;
	return temp;
    }

    public T removeLast() { //O(1)
	if (isEmpty()) {
	    throw new NoSuchElementException();
	}
	T temp = deque.get(_last);
	deque.remove(_last);
	_size--;
	_last = _size - 1;
	return temp;
    }

    public void addFirst( T x ) { //O(1)
	deque.add(0, x);
        _size++;
	_last = _size - 1;
    }
    
    public void addLast( T x ) { //O(1)
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
    
    public T peekFirst() { //O(1)
	if (isEmpty()) {
	    return null;
	}
	return deque.get(_first);
    }

    public T peekLast() { //O(1)
	if (isEmpty()) {
	    return null;
	}
	else {
	    return deque.get(_last);
	}
    }

    public T getFirst() { //O(1)
	if (isEmpty()) {
	    throw new NoSuchElementException();
	}
	return deque.get(_first);
    }

    public T getLast() { //O(1)
	if (isEmpty()) {
	    throw new NoSuchElementException();
	}
	return deque.get(_last);
    }
    
    public T pollFirst() { //O(1)
	if (isEmpty()) {
	    return null;
	}
	return deque.get(_first);
    }

    public T pollLast() { //O(1)
	if (isEmpty()) {
	    return null;
	}
	
	return deque.get(_last);
    }

    public int size() { //O(1)
	return _size;
    }
    
    public boolean removeFirstOccurrence(T x){ //O(n)
	if (x == null){
	    throw new NullPointerException();
	}
	else if (isEmpty()){
	    return false;
	}
	for (int i = 0; i < _size;i++){
	    if (deque.get(i).equals(x)){
		if(i == _first){
		    _first ++;
		}
		else{
		    _last --;
		}
		deque.remove(i);
		_size--;
		return true;
	    }
	}
	return false;
    }
}
