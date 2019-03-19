//reference: https://www.youtube.com/watch?v=4UyPsYI1G4E&t=90s

package tStackTest;


	
	public class GenericStack<T> {
		
		int size;
		StackElement<T> top;
		
		public GenericStack(){
			size = 0;
			top = null;
		}
		
		
		public void push(T newValue){
			StackElement<T> newElement = new StackElement<T>(newValue , top);
			top = newElement;
			size++;
			
		}
		
		public T pop(){
			StackElement<T> previousTop = top;
			if(size==0){
				return null;
			}
			top = top.getNext();
			size -- ;
			return previousTop.getElement();
		}
		
		public T peek(){
			if(size == 0){
				return null;
			}
			return top.getElement();
		}
		
		
		public void empty(){
			size = 0;
			top = null;
		}
		
		public boolean isEmpty(){
			if(size  == 0){
				return true;
			}
			
			return false ;
			
		}
	}
		
		
		
		
		
		
		
		
