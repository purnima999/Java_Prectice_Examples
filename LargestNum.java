package tut1;

public class LargestNum {
	public static void main(String [] args) {
		
		int [] arrOfNum = {10,100,22,40,230,99};
		
		int max = arrOfNum[0];
		for(int i = 0; i < arrOfNum.length; i++) {
			if(arrOfNum[i] >max)
				max = arrOfNum[i];
		}
		
		System.out.printf("Largenst Num: %d", max);
	}
}
