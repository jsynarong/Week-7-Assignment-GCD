import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int x = sc.nextInt();
		System.out.print("Enter second number: ");
		int y = sc.nextInt();
		try {

			int gcd = GCD(x, y);

			System.out.println("the GCD is: " + gcd);

		}

		catch (Exception e)

		{

			System.out.println("GCD iS 1");

		}

	}

	public static int GCD(int x, int y) throws Exception

	{

		int dividend = (x > y ? x : y);

		int divisor = (x < y ? x : y);

		int rem = dividend % divisor;

		while (rem != 0)

		{

			dividend = divisor;

			divisor = rem;

			rem = dividend % divisor;

		}

		if (divisor == 1)

			throw new Exception();

		return divisor;

	}

}