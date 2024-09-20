/**
 * 
 */
package slideDeckExercises;

/**
 * 
 */
public class Exercise03_WhatYearWillITurn100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whatYearWillITurn100();
		whatYearWillYouTurn100(99);

	}

	/**
	 * A method to work out what year you will turn 100
	 * @param age - The age you will be this year
	 */
	public static void whatYearWillYouTurn100(int age) {
		int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		int year100 = year - age + 100;
		System.out.println(year100);
	}

	/**
	 * A Method to work out what year I will turn 100
	 */

	public static void whatYearWillITurn100() {
		int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		int age = 38;
		int year100 = year - age + 100;
		System.out.println(year100);
	}

}
