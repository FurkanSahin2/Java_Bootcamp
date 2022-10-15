package exercises.LoopDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// for
		for (int i = 0; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("~ For döngüsü sonlandı ~");
		System.out.println();

		// while
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;

		}
		System.out.println();
		System.out.println("~ While döngüsü sonlandı ~");
		System.out.println();

		// Do-While
		int j = 1;
		do {
			System.out.println(j);
			j += 2;

		} while (j < 10);

		System.out.println();
		System.out.println("~ Do-While döngüsü sonlandı ~");

		// Note: Do-while döngüsünün çalışma mantığı while döngüsü ile aynıdır,
		// fakat while döngüsünde parantez içerisindeki koşul sağlandığı sürece
		// kod bloğu çalışacaktır. Ama Do-while döngüsünde durum false olsa bile
		// döngü (satır satır ilerlediği için) en az bir kere çalışacaktır. 

	}

}
