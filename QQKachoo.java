import java.util.ArrayList;
public class QQKachoo<D> implements Deque<D> {
    private int _size; 
    private int _first, _last;
    
    ArrayList<D> deque = new ArrayList<D>(); 

    public QQkachoo() { 
	_size = _first = _last = 0;
    }
    
    public void addLast( D x ) {
	if (isEmpty()) {
	    deque.add(x);
	    _first = _last = 0;
	}
	else {
	    deque.add(_last + 1, x);
	    _last++; 
	}
	_size++
    }
    
    
    public isEmpty() {
	return _size == 0;
    }
    
    public static void main ( String[] args) {
    }
}
