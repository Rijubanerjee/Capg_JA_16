package Lab1;
import java.util.*;

public class Exercise5 {

	static int calculatesum(int n)
	{
		int sum = 0;
		for (int i = 1; i <= n; i++)
		{
			if (i%3 == 0 || i%5 == 0)
				sum = sum +i;
		}
		return sum;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enert the nth term:");
		int n = sc.nextInt();

		System.out.println(calculatesum(n));

	}

}
