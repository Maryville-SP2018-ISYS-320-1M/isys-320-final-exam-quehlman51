package edu.maryville.isys320;

import java.util.Scanner;

/*
 * Class:    ISYS-320
 * Student:  Anthony Quehl
 * Date:     30-APR-2018
 */

public class FinalExam {

	public static void main(String[] args) {
		double numbers = squaredDifference(5.0,1.0);
		System.out.println(numbers);
		double dis = distance(5,2,2,6);
		System.out.println(dis);
		DistanceFinder();
		GolfTracker();
	}
		public static double squaredDifference(double a, double b) {
			return (a - b)*(a - b);
		}
		public static double distance(double x1, double y1, double x2, double y2) {
			return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		}
		public static void DistanceFinder() {
			Scanner console = new Scanner(System.in);
			System.out.println("Enter x, y for the first point: ");
			double x1 = console.nextDouble();
			double y1 = console.nextDouble();
			System.out.println("Enter x, y for the second point: ");
			double x2 = console.nextDouble();
			double y2 = console.nextDouble();
			System.out.println("The distance between these points is " + distance(x1, y1, x2, y2));
		}
		public static void TriangleWord() {
			Scanner console = new Scanner(System.in);
			System.out.println("What is your word?");
			String word = console.next();
			for (int i = 0; i <= word.length(); i--) {
				
			}
		
		}
		public static void GolfTracker() {
			Scanner console = new Scanner(System.in);
			int sum = 0;
			System.out.println("What is par for the Course?");
			int par = console.nextInt();
			int score = par;
			while (score != 0) {
				sum = (par - score);
				System.out.println("Enter next round score or 0 to finish: ");
				score = console.nextInt();
			}
			System.out.println("Total score for this course is: " + sum);
			if (sum <= 0) {
				System.out.print("You scored Par or under, well done!");
			} else if (sum > 0) {
				System.out.print("Looks like you need to work on your game a bit");
			}
		}
}
