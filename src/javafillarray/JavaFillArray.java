package javafillarray;

import java.util.Scanner;

public class JavaFillArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int ArrayA[] = new int[10];
		int ArrayB[] = new int[10];
		int ArrayC[] = new int[20];
		int i, j;

		System.out.println("Favor de agregar numeros al Array A: ");
		for (i = 0; i < ArrayA.length; i++) {

			System.out.println("Posicion " + (i + 1) + " : ");
			ArrayA[i] = scan.nextInt();

		}

		System.out.println("Favor de agregar numeros al Array B: ");
		for (i = 0; i < ArrayB.length; i++) {

			System.out.println("Posicion " + (i + 1) + " : ");
			ArrayB[i] = scan.nextInt();

		}

		System.out.println("Pasando los numeros al Array C: ");

		j = 0;

		for (i = 0; i < 10; i++) {

			ArrayC[j] = ArrayA[i];
			System.out.println(ArrayC[j]);
			j++;

			ArrayC[j] = ArrayB[i];
			System.out.println(ArrayC[j]);
			j++;
		}
	}
}
