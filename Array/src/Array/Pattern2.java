package Array;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int space =4; 
int star =0;
for(int i=1;i<=4;i++) {
	space --;
	star ++;
	for(int j=1;j<=space;j++) {
		System.out.print("");
	}
	for(int k=1;k<=star;k++) {
		System.out.print("*");
	}
	System.out.println();
	}
}

	}*/
		int space =0; 
		int star =5;
		for(int i=1;i<=4;i++) {
			space ++;
			star --;
			for(int j=5;j<=star;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=space;k++) {
				System.out.print("");
			}
			System.out.println();
			}
		}

			}
