package Array;

public class Armstrong {

	public static void main(String[] args, String String) {
		// TODO Auto-generated method stub
int n=153;
int result =0;
int temp =n;
String = "cfr";
while(n!=0) {
	int r=n%10;
	result = result+(r*r*r);
	n=n/10;
}
if(result==temp) {
	System.out.println("Armstrong number");
}
else {
	System.out.println("not Armstrong number");
}
	}

}
