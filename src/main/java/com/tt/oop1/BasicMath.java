package com.tt.oop1;

public class BasicMath {
	
	private int add(int a, int b) {
		int sum;
		sum = a+b;
		return sum;
	}
	protected int sub(int a, int b) {
		 int sub;
		 sub = a-b;
		 return sub;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicMath myobj = new BasicMath();
		int sum = myobj.add(60, 500);
		System.out.println(sum);
		int sub = myobj.sub(600, 300);
		System.out.println(sub);
	}

}
