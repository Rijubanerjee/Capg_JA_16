package AssignmentDay4;

import java.util.Scanner;

public class PatternDiamond2 {
	public static void main(String args[]) {
		int choice = 0;
		do {
		int row, i, j, space = 1;
		System.out.print("Enter the number of rows you want to print: ");
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		space = row - 1;
		for (j = 1; j <= row; j++) {
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space--;
			for (i = 1; i <= 2 * j - 1; i++) {
				if (i == 1 || i == (j * 2) - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		space = 1;
		for (j = 1; j <= row - 1; j++) {
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space++;
			for (i = 1; i <= 2 * (row - j) - 1; i++) {
				if (i == 1 || i == 2 * (row - j) - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

		System.out.println(" Do u want to exe more <0 for exit>");
		choice = sc.nextInt();
	}while(choice!=0);
	
	}
}


