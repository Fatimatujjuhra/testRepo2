package com.tt.oop1;

public class AdvancedMath {
	
	int mul(int a, int b) {
		int mul = a*b;
		return mul;
	}
	
	public int div(int a, int b) {
		int div = a/b;
		return div;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvancedMath myobj = new AdvancedMath();
		int mul = myobj.mul(80, 30);
		System.out.println(mul);
		int div = myobj.div(90, 30);
		System.out.println(div);
	}

}
