package task2;

import java.util.HashMap;
import java.util.Scanner;

public class MultiArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		int row=sc.nextInt();
		System.out.println("Enter the no. of columns");
		int column=sc.nextInt();
		int[] arr2=new int[row*column];
		int k=0;
		HashMap<String, Integer> mat=new HashMap<String, Integer>();
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.println("Enter the name");
				String name=sc.next();
				System.out.println("Enter the value");
				int val=sc.nextInt();
				mat.put(name, val);
				arr2[k]=val;
				k++;
			}
		}
	Object[] arr= mat.keySet().toArray();
	Object[] arr1=new Object[arr.length];
	k=0;
	for(int i=arr.length-1;i>=0;i--) {
		arr1[k]=arr[i];
		k++;
	}
	
	
	
	int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr2[j] > arr2[j + 1]) {
                int temp = arr2[j];
                arr2[j] = arr2[j + 1];
                arr2[j + 1] = temp;
                
                Object temp2 = arr1[j];
                arr1[j] = arr1[j + 1];
                arr1[j + 1] = temp2;
            }
        }
    }
    
    for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
    
    k=0;
    for(int i=0;i<row;i++) {
    	for(int j=0;j<column;j++) {
    		System.out.print(arr[k]+"\t");
    		k++;
    	}
    	System.out.println("\n");
    }
  }
}
