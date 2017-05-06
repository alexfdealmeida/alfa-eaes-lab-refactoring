package replaceInheritanceWithDelegation;

import java.util.Vector;

public class Stack {
	private Vector<Object> vector;
	
	public void push(Object element) {
		vector.insertElementAt(element, 0);
	}
	
	public Object pop() {
		Object result = vector.firstElement();
		vector.removeElementAt(0);
		return result;
	}
	
	public boolean isEmpty() {
		return vector.isEmpty();
	}
	
	public Integer size() {
		return vector.size();
	}
}
