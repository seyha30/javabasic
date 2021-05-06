package LOOPS;

import java.util.Iterator;

public class DemoCountChar {

	public static void main(String[] args) {
		String str = "Hello World!";
//		for loop
		int forFinder = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == 'l') {
				forFinder++;
			}
		}
		System.out.println("For loop finder{'l'} :" + forFinder);
//		while loop
		int whileFinder = 0;
		int k = 0;
		while (k <= str.length() - 1) {
			if (str.charAt(k) == 'l') {
				whileFinder++;
			}
			k++;
		}
		System.out.println("While loop finder{'l'} :" + whileFinder);
//		do while loop
		int doWhileFinder = 0;
		int index = 0;
		do {
			if (str.charAt(index) == 'l') {
				doWhileFinder++;
			}
			index ++;

		} while (index <= str.length() - 1);
		System.out.println("do While loop finder{'l'} :" + doWhileFinder);
	}

}
