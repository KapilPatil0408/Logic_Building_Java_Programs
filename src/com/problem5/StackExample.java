package com.problem5;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> stack= new Stack<String>();
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Mango");
		stack.push("Orange");
		
		int position= stack.search("Orange");
		System.out.println(position);
		position= stack.search("Mango");
		System.out.println(position);
		position= stack.search("Banana");
		System.out.println(position);
		position= stack.search("Apple");
		System.out.println(position);
		position= stack.search("apple");
		System.out.println(position);  // case sensitive- in search this element will 
									  // not be found so it will return -1
		
		stack.pop(); // remove top element from stack and return it back to you
		stack.peek(); // it doesn't remove element from stack but returns the value
		stack.isEmpty(); // true -if empty else its gonna return false;
		int position1= stack.search("Orange"); // position topelement 1,2,3,4 if element is 
											// not found the  position will be -1
		
		
//		System.out.println(stack);
//		String topElement=stack.peek();
//		System.out.println(topElement);
//		String elementOutFromStack=stack.pop();
//		System.out.println(elementOutFromStack);
//		topElement=stack.peek();
//		System.out.println(topElement);
//		System.out.println(stack.isEmpty());
//		System.out.println(stack.pop());
//		System.out.println(stack.isEmpty());
		
	}

}
