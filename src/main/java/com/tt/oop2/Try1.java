package com.tt.oop2;

public class Try1 {

	int a = 30;
	int b = 40;
	int c = 600;
	int d = 500;
	
		void add() {
			//adding methods
			int sum;
			sum = a+b;
			System.out.println(sum);
		}
	
	public static void main(String[] args) {
		//creating object
		Try1 myobj = new Try1();
		myobj.add();
	}
}
