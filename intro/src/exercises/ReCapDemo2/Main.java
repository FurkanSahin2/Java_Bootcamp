package exercises.ReCapDemo2;

public class Main {

	public static void main(String[] args) {

		double[] myList = { 1.3, 3.9, 5.7 , 2.5 };
		double total = 0;
		double max = myList[0];

		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;

			System.out.println(number);

		}
		System.out.println();
		System.out.println("Toplam: " + total);
		System.out.println();
		System.out.println("En Büyük Rakam: " + max);

	}

}
