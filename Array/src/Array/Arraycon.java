package Array;

import java.util.Scanner;

public class Arraycon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the size");
int size = sc.nextInt();
String s[]=new String[size];
System.out.println("enter the array elements");
for(int i=0;i<s.length;i++) {
	s[i]=sc.next();
}
System.out.println("the array elements are:");
for(int i=0;i<s.length;i++) {
	s[i]=sc.next();
}
String max = s[0];
for(int i=0;i<s.length;i++) {
	if(s[i]>max) {
		max=s[i];
	}
	}
	System.out.println(max);
	String min
	
}
	}

}
