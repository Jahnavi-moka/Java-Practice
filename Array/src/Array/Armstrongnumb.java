package Array;

public class Armstrongnumb {

	public static void main(String[] args) {
		int n=153;
		int result =0;
		int temp =n;
		while(n!=0) {
			int r=n%10;
			result = result+(r*r*r);
			n=n/10;
		}
		if(temp== result) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("not Armstrong number");
		}
	}
}
		/*int n=153;
		int temp = n;
		int result =0;
		while(n!=0) {
			int r= n%10;// we can intialize with datatype because we cant intialize asa a r
			result = result+(r*r*r);
			 n=n/10;
		}
		if(temp == result) { //ii randuu equal avtunaa kada armstrong number
			System.out.println("Armstrong number");
		}
		System.out.println("not Armstrong number");
		
			
			
		}
		

	}*/

