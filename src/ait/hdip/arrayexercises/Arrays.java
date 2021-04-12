package ait.hdip.arrayexercises;

import java.util.*;


public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//histogram();
		//dynamicHistogram();
		//frequency();
		//multiDimArray();
		//studentGrades();
		statistics();
		}	
	
	public static void histogram() {
		int [] n = {19, 3, 15, 7, 11, 9, 13, 5, 17, 1};
		System.out.println("Element"+"\t"+"Value"+"\t"+"Histogram");
		System.out.println();
		  for (int i =0;i<n.length; i++){
		  System.out.print(i+"\t"+n[i]+"\t");
		  	for(int j=0;j<n[i]; j++){
		  		System.out.print("*");
		  	}System.out.println();
		       
		  }
	}

	public static void dynamicHistogram() {

		Scanner in = new Scanner(System.in);
		System.out.print("How many elements in the array? ");
		int times = in.nextInt();
		int [] arr = new int[times];
		
		for (int i=0; i<times;i++) {
			System.out.print("Please enter a value --> ");
			arr[i] = in.nextInt();
		}
		System.out.println("Element"+"\t"+"Value"+"\t"+"Histogram");
		System.out.println();
		  for (int i =0;i<arr.length; i++){
		  System.out.print(i+"\t"+arr[i]+"\t");
		  	for(int j=0;j<arr[i]; j++){
		  		System.out.print("*");
		  	}System.out.println();
		       
		  }
		
	}
	
	public static void frequency() {
		
		int arr[] = {1,2,6,4,8,5,9,7,8,10,1,6,3,8,6,10,3,8,2,7};
		int repeat[] = {0,0,0,0,0,0,0,0,0,0,0};
		int rating[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<rating.length;i++){ 
			for(int j=0;j<arr.length;j++){
				if(rating[i]==arr[j])
					repeat[i]++;
			}
			
		}  
			
		System.out.println("Rating"+"\t"+"Frequency");
		
		for(int i=1;i<repeat.length;i++){
			
		     System.out.println(i+"\t"+repeat[i-1]);
		}
					
	}
	
	public static void multiDimArray() {
		
		int [][] array = { {1,2,3},{5,6,7} };
		
		System.out.println("Values of Array are: ");
		
		for (int i=0;i<array.length;i++) {
			
			for (int j=0;j<=array.length;j++) {
				
			System.out.printf("%2d", array[i][j]);
			
			}
		System.out.println();
		}
	
	}

	public static void studentGrades() {
		
		int studentGrades[][] = { {77,68,86,73}, {96,87,89,78}, {70,90,86,81} };
		int lowestGrade = studentGrades [0][0];
		int highestGrade = studentGrades [0][0];
		double firstStudentAverage = 0.0;
		double secondStudentAverage = 0.0;
		double thirdStudentAverage =0.0;
		int totalFirst = 0;
		int totalSecond = 0;
		int totalThird = 0;
		
		System.out.println("The array is ");
		System.out.println("                   [0]  [1]  [2]  [3]");
		
		for (int i=0; i<studentGrades.length;i++) {
			
			System.out.printf("studentGrades["+i+"]");
			
			for (int j=0; j<=studentGrades.length;j++) {
				
				System.out.printf("%5d", studentGrades[i][j]);
				
				if(studentGrades[i][j] < lowestGrade) {
					lowestGrade = studentGrades[i][j];
				}else if (studentGrades[i][j] > highestGrade) {
					highestGrade = studentGrades[i][j];
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("The lowest grade is "+lowestGrade);
		System.out.println("The highest grade is "+highestGrade);
		
		for (int i=0;i<studentGrades[0].length;i++) {
			totalFirst = totalFirst + studentGrades[0][i];
		}
		firstStudentAverage = totalFirst/studentGrades[0].length;
		System.out.println("\nThe average for the first student is "+firstStudentAverage);
		
		for (int i=0; i<studentGrades[1].length;i++) {
			totalSecond = totalSecond + studentGrades[1][i];
		}
		secondStudentAverage = totalSecond/studentGrades[1].length;
		System.out.println("The average for the first student is "+secondStudentAverage);
		
		for (int i=0; i<studentGrades[2].length;i++) {
			totalThird = totalThird + studentGrades[2][i];
		}
		thirdStudentAverage = totalThird/studentGrades[2].length;
		System.out.println("The average for the first student is "+thirdStudentAverage);
	}	
	
	public static void statistics() {
		double average1 = 0.0;
		double average2 = 0.0;
		int total1 = 0;
		int total2 = 0;
		
		int arr1[] = {9, 3, 44, 17, 15};
		int arr2[] = {8, -6, 89, 17, 12, 6};
		
		for (int i=0; i<arr1.length;i++) {
			total1 = total1 + arr1[i];
		}
		average1 = total1/arr1.length;
		System.out.println("The average of arr1 is "+average1);
		System.out.println("Median value is "+median(arr1));
		System.out.println("Median value is "+median(arr2));
		System.out.println("The range of arr1 is "+ range(arr1));
		System.out.println("The range of arr2 is "+ range(arr2));
	}
	
	public static int median(int[] arr) {
		int median = 0;
		java.util.Arrays.sort(arr);
		
		for (int i=0;i<arr.length;i++) {
			
			if (arr.length % 2 == 1) {
				median = Math.round(arr[arr.length/2]);
			} else {
				median = (arr[(arr.length/2)] + arr[(arr.length/2)-1])/2;
			}
			
		}
		return median;
	}
	
	public static int range(int[] arr) {
		int range = 0;
		int higherRange = 0;
		for (int i=0; i<arr.length;i++) {
			
			range = arr[arr.length -1] -  arr[0];
			
			if (range > higherRange) {
				higherRange = range;
			}
		}
		return higherRange;
	}
	
	

	
	
}