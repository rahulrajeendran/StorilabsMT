package task4;

import java.io.File;
import java.util.Scanner;

public class Folder {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println(" Enter the path \n\n Enter !exit! to exit");
			String str=sc.next();
			if(str.equals("!exit!")) {
				break;
			}
			else {
				try {
					File path=new File(str);
					String contents[]=path.list();
					for(int i=0;i<contents.length;i++) {
						System.out.println(contents[i]);
					}
				}
				catch(Exception e) {
					System.out.println("Invalid file path");
				}
			}
		}
		
	}
}
