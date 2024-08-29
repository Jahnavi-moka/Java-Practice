package Array;

import java.util.Scanner;

public class Array2d {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size for rows");
		int rs =sc.nextInt();
		System.out.println("enter the size for columns");
	    int cs=sc.nextInt();
	    int a[][]=new int[rs][cs];
	    System.out.println("enter the array elements");
	    for(int i=0;i<rs;i++) {
	    	for(int j=0;j<cs;j++) {
	    		a[i][j]=sc.nextInt();
	    	}
	    }
	    System.out.println("the array elements are:");
	    for(int i=0;i<rs;i++) {
	    	for(int j=0;j<cs;j++) {
	    		System.out.print(a[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	}
}

	    	
	    		
	