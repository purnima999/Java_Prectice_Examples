package tut1;

public class PatternProblems {
	public static void main(String [] args) {
		
//		1. Downward Triangle Star Pattern
		int s = 4;
		int i,j,k;
		for(i = s; i >=0; i--) {
			for( j=0; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
//		2. Right down Mirror Star Pattern
		for(i=s; i>=1; i--) {
			for( j=s; j>i;j--) {
				System.out.print(" ");
			}
			for( k=1; k<=i;k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
//		3. Reversed Pyramid Star Pattern
		for( i=s; i>=1; i--) {
			for( j=s; j>i;j--) {
				System.out.print(" ");
			}
			for( k=1; k<=i;k++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
		
//		4. Pyramid Program
//		for( i=0; i<=s; i++) {
//			System.out.print(" ");
//		for( k=0; k<=i; k++) {
//			System.out.print("*"+" ");
//			}
//		}
//			System.out.println();
		
//		5. Right Triangle Star Pattern
		for( i=0; i<=s; i++) {
			System.out.print(" ");
		for( k=0; k<=i; k++) {
			System.out.print("*"+" ");
			}
			System.out.println();
		}
		
//		6. Left Triangle Star Pattern
//		for( i=0; i<=s; i++) {
//			System.out.print(" ");
//		}
//		for( k=0; k<=i; k++) {
//			System.out.print("*"+" ");
//			}
//			System.out.println();
			
//	    7. Diamond Shape Pattern Program in Java
		int space = s- 1;
		for (j = 1; j<= s; j++)
		{
		for (i = 1; i<= space; i++)
		{
		System.out.print(" ");
		}
		space--;
		for (i = 1; i <= 2 * j - 1; i++)
		{
		System.out.print("*");
		}
		System.out.println(" ");
		}
		space = 1;
		for (j = 1; j<= s - 1; j++)
		{
		for (i = 1; i<= space; i++)
		{
		System.out.print(" ");
		}
		space++;
		for (i = 1; i<= 2 * (s - j) - 1; i++)
		{
		System.out.print("*");
		}
		System.out.println(" ");
		}
	}
}
