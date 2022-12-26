package task1;

import java.util.Scanner;

public class SumAvg {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		SumAvg obj=new SumAvg();
		obj.Execute();
	}
	void Execute() {
		float sum=0,count=0,flag=0;
		while(flag==0) {
			System.out.println("Enter the input");
			String input=sc.next();
			if(input.matches("^[a-z,A-Z,!,@,#,$,%,^,&,*]*$")) {
				if(input.equals("done")) {
					flag=0;
					break;
				}
				else {
					flag=1;
				}
			}
			else {
				sum=sum+(Integer.parseInt(input));
				count++;
			}
		}
		if(flag==1) {
			System.out.println("Invalid Entry.");
		}
		else {
			System.out.println("Sum of the numbers is : "+sum+"\n\nAverage is : "+(sum/count));
			
		}
	}
}
