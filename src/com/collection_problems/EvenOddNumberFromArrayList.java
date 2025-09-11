package com.collection_problems;

import java.util.ArrayList;

public class EvenOddNumberFromArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(null);
		al.add(23);
		al.add('c');
		al.add(24);
		al.add(27);
		al.add(28);

		for (Object o : al) {
			if(o instanceof Integer) {
				Integer i= (Integer)o;
				int x= i.intValue();
				//if(((Integer)o).intValue() % 2==0) {
				if(x % 2==0) {
					System.out.println("Value is even "+ o);
				}else {
					System.out.println("Value is Odd "+ o);
				}
			}
		}
	}
}
