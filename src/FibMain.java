import java.util.Scanner;

public class FibMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Fibonacci Folge");
		System.out.println("Gib eine Zahl ein : ");
		int x=sc.nextInt();
		System.out.println(fib(x));
		sc.close();
	}
	static int fib(int n) {
		if (n==0) {
			return 0;
		}
		if (n==1) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
}
