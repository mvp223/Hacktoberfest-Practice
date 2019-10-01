public class Main {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Usage: Main.java [number]");
			return;
		}
		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(nthCatalanNumber(n));
		} catch (Exception e) {
			System.out.println("Input must be an integer");
		}
	}

	public static int nthCatalanNumber(int n) {
		return factorial(2*n)/(factorial(n + 1) * factorial(n));
	}

	public static int factorial(int n) {
		if(n == 0)
			return 1;
		return n * factorial(n - 1);
	}
}