package RealCodedGA;

import java.util.Arrays;
import java.util.HashMap;

public class test {
	static int num=6;
	static double F=0;
	static double fits[]={1.2, 2.3 ,0.6 , 6.8 ,3.2 ,1.3};
	static double p[]=new double[num];
	static int number[]=new int[num];
	public static void main(String[] args) {
		HashMap<Double, Integer> map=new HashMap<Double, Integer>();
		for (int i = 0; i < num; i++) {
			map.put(fits[i], i);
		}
		Arrays.sort(fits);
		for (int i = 0; i < num; i++) {
			System.out.println(fits[i]);
			number[i]=map.get(fits[i]);
			System.out.println(number[i]);
		}
		for (int i = 0; i < num; i++) {
			F=F+i+1;
		}
		System.out.println(F);
		for (int i = 0; i < num; i++) {
				p[i]=(i+1)/F;
				System.out.println("p[i]="+p[i]);
		}
	}
}
