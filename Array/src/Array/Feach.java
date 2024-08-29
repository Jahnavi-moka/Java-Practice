package Array;

import java.util.Scanner;

public class Feach {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size");
	int size = sc.nextInt();
	double d[]=new double[size];
	System.out.println("enter the array elements");
	for(int i=0;i<d.length;i++) {
		d[i]=sc.nextDouble();
	}
	System.out.println("the array elements are:");
	for(int i=0;i<d.length;i++) {
		d[i]=sc.nextDouble();
	}
	double max = d[0];
	for(int i=0;i<d.length;i++) {
		if(d[i]>max) {
			max=d[i];
		}
		}
		System.out.println(max);
		System.out.println("min element of array elements");
		double min=d[0];
		for(int i=0;i<d.length;i++) {
			if(d[i]<min) {
				min=d[i];
			}
			
		}
		System.out.println(min);
			}
		}
		
		
		
