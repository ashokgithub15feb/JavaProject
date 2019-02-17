package com.ds.linkedlist;

public class DuplicateAndMissing {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 3, 5, 6 };
		int[] b = new int[a.length];
		int sum = 0;
		int arrSum = 0;
		// should be on sorted order
		for (int i = 0; i < a.length; i++) {
			if (b[a[i] - 1] != 0) {
				System.out.println("Duplicate Element: " + a[i]);
			} else {
				b[i] = a[i];
			}

			arrSum = arrSum + a[i];
			sum = sum + i;

			if ((arrSum - sum) != a[i]) {
				System.out.println("Missing Number: " + (arrSum - sum));
				break;
			}
			//m1();
		}

	}
	
	public static int m1()
	{
		int n = 10;

		int Nsum = 0;
		int NSsum = 0;

		Nsum = (n*(n+1))/2;
		NSsum = n*(n+1)*(2*n+1)/6;

		//vector < int > v (n+1, 0);

		int v[] = new int[11];
		
		int sum = 0;
		int Ssum = 0;

		for (int i=0; i<n-2; i++) {
			sum = sum + v[i];
			Ssum = Ssum + v[i]*v[i];
		}

		int aplusb = Nsum - sum;
		int asqplusbsq = NSsum - Ssum;

		int twoab = aplusb * aplusb - asqplusbsq;
		int aminusb = (int)Math.sqrt(asqplusbsq - twoab);

		int x = (aplusb + aminusb)/2;
		int y = (aplusb - aminusb)/2;

		System.out.println(x+":"+y);
//		cout << x << "x " << y << "y " << endl;

		return 0;
	}
}
