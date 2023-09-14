package Demo1;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumEven=0;
		int sumOdd=0;
		int countEven=0;
		int countOdd=0;
		for(int i=0;i<=11;i++) {
			if(i%2==0) {
				countEven++;
				sumEven=sumEven+i;
			}
			else {
				countOdd++;
				sumOdd=sumOdd+i;
			}
		}
		System.out.println("Sum of Even Number is: "+sumEven);
		System.out.println("Sum of Odd Number is: "+sumOdd);
		System.out.println("Average of Even Number is: "+sumEven/countEven);
		System.out.println("Average of Odd Number is: "+sumOdd/countOdd);
	}

}
