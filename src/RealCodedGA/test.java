package RealCodedGA;

import java.util.Random;



public class test {
	public static int n=10;
	public static int seq[]=new int [n];
	public static void main(String[] args) {
		for (int i = 0; i < n; i++) {
			seq[i]=i;
			System.out.println(seq[i]);
		}
		Random r=new Random();
		for (int i = 0; i < 2; i++) {
			int a=r.nextInt(n);
			
			System.out.println(a);
		}
	}
}
