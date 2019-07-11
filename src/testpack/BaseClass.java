package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass rajesh = new BaseClass();
		rajesh.arraySortByRajesh();
		rajesh.arrayvisalvani();
		System.out.println("this is my modified base class");
		rajesh.arraySortByVignesh();
		System.out.println("this is my modified base class by RAJESH KANNA");

	}

	public void arraySortByRajesh() {
		int n, temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of Integer Value you want in array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the Integer Values:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order:");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.print(a[n - 1]);
	}

	void arrayvisalvani() {

		System.out.println("this is my modified base class");

		int a[] = new int[5];
		a[0] = 1;
		a[1] = 12;
		a[2] = 15;
		a[3] = 19;
		a[4] = 100;

		for (int i = 0; i <= a.length; i++) {

			System.out.println(a[i]);
		}

	}

	public void arraySortByVignesh() {

		System.out.println("Enter 5 Values : ");
		Scanner sc = new Scanner(System.in);

		int a[] = new int[5];
		int temp;
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Ascending Order :");
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++)

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
	}

}