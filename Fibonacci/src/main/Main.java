package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int fibo1=1, fibo2=1, fibonacci=1;
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of Fibonacci numbers:");
		n=scanner.nextInt();
		scanner.close();
		for(int i=0; i<n;i++)
		{
			if(i==0||i==1)
			{
			System.out.print(1+" ");
			continue;
			}
			fibonacci=fibo1+fibo2;
			fibo2=fibo1;
			fibo1=fibonacci;
			System.out.print(fibonacci+" ");
		}
	}

}
