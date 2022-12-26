package task3;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date (should be in dd/mm/yyyy format)");
		String dt=sc.next();
		SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		sdfrmt.setLenient(false);
		try {
			date=sdfrmt.parse(dt);
			System.out.println(date);
		} catch (ParseException e) {
			System.out.println("Invalid date");
		}
		
	}
}
