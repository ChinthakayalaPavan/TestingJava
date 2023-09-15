package Demo1;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int count=0;
		int num1=num;
		int num2=num;
		while(num!=0) {
			int last = num%10;
			count++;
			num=num/10;
		}
		int c1=count;
		int sum=0;
		while(num1!=0) {
			int prod=1;
			int last1 = num1%10;
			while(count!=0) {
				prod=prod*last1;
				count--;
			}
			count=c1;
			num1=num1/10;
			sum=sum+prod;
		}
		if(sum==num2) {
			System.out.println("The Given Number "+num2+" is Armstrong Number");
		}
		else {
			System.out.println("The Given Number "+num2+" is not Armstrong Number");
		}
		
		
		
	}

}
