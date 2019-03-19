package tStackTest;

public class GenericStack <T> {
	int size;
	StackElement<T> top;
	
	public GenericStack(){
		size=0;
		top= null;
		
	}

	public void push (T X){
		
		
	}
	public Object pop (){
		return top;
	}
	public boolean isEmpty (){
	return true;	
	}
}
