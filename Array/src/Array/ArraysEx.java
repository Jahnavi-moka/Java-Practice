package Array;

import java.util.Scanner;

public class ArraysEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array=new int[3];
		
		
		System.out.println("enter the values into an array:");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
	
		
		System.out.println("arranging acending order:");
	
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
				System.out.println("acending order elements");
				for(int k=0;k<array.length;k++) {
					System.out.println(array[k]);
					
					
					
					
			
			
		}
	}
}
		
			
		
		
		

	


