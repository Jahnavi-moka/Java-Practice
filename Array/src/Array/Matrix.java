package Array;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row Elements:");
		int rs=sc.nextInt();
		System.out.println("enter column elements:");
		int cs =sc.nextInt();
		int[][] a= new int[rs][cs];
		System.out.println("enter the elements:");
		for(int i=0;i<rs;i++) {
			for(int j=0;j<cs;j++) {
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println( "printing the elements:");
		for(int i=0;i<rs;i++) {
			for(int j=0;j<cs;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			}
		}
				

	}


