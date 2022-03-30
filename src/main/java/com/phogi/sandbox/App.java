package com.phogi.sandbox;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Parent p = new Parent();
		Son s = new Son();
		Parent p2 = new Son();
		// Son s2 = new Parent();

		System.out.println(p instanceof Parent);
		System.out.println(s instanceof Son);
		System.out.println(s instanceof Parent);
		System.out.println(p instanceof Son);
		System.out.println(p2 instanceof Parent);
		System.out.println(p2 instanceof Son);

		p = p2;
		System.out.println();
		System.out.println(p instanceof Parent);
		System.out.println(p instanceof Son);

		System.out.println("Hello World!");
	}
}
