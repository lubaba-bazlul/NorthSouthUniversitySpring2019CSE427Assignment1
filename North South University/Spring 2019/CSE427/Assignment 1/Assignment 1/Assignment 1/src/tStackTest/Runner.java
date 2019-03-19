package tStackTest;

public class Runner {

	public static void main(String[] args) {
		GenericStack<Double> num1 = new GenericStack<Double>();
		
		num1.push(8.7);
		num1.push(7.8);
		
		
		System.out.println(num1.peek());
		System.out.println(num1.pop());
		System.out.println(num1.pop());
		
		GenericStack<String> s1 = new GenericStack<String>();
		
		s1.push("Work");
		s1.push("Hard");
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
	}

}
