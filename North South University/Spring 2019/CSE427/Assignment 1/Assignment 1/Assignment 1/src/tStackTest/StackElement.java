package tStackTest;

public class StackElement<T> {
T element;
StackElement<T> next;

public StackElement(T element, StackElement next){
	this.element = element;
	this.next= next;
}


public StackElement<T> getNext(){
	return next;
}


public T getElement(){
	return element;
}












}