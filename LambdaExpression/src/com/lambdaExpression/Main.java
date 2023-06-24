package com.lambdaExpression;

public class Main {
     public static void main(String[] args) {
			/*
			 * LambdaUse obj = new LambdaUse() {
			 * 
			 * @Override public void show() { // TODO Auto-generated method stub
			 * System.out.println("hello lambda bro !!");
			 * 
			 * }
			 * 
			 * @Override public void display(int i) { // TODO Auto-generated method stub
			 * System.out.println(i);
			 * 
			 * } }; obj.show(); obj.display(40);
			 */
    	 LambdaUse lambda = () -> {
    		 System.out.println("hello lambda bro !!");
    	 };
    	 lambda.show();
	}
}
