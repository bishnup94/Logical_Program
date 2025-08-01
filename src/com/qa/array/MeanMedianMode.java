package com.qa.array;

import java.util.Arrays;

public class MeanMedianMode {

	// Method to calculate Mean
	public static double calculateMean(int[] numbers) {
		if (numbers.length == 0)
			return 0;
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return (double) sum / numbers.length;
	}

	// Method to calculate Median
	public static double calculateMedian(int[] numbers) {
		if (numbers.length == 0)
			return 0;
		Arrays.sort(numbers); // Sort the array

		int middle = numbers.length / 2;

		// If even number of elements
		if (numbers.length % 2 == 0) {
			return (numbers[middle - 1] + numbers[middle]) / 2.0;
		} else {
			return numbers[middle];
		}
	}

	// Method to calculate Mode
	public static int calculateMode(int[] numbers) {
		if (numbers.length == 0)
			return 0;

		int maxValue = numbers[0], maxCount = 0;

		for (int i = 0; i < numbers.length; i++) {
			int count = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == numbers[i]) {
					count++;
				}
			}
			if (count > maxCount || (count == maxCount && numbers[i] < maxValue)) {
				maxCount = count;
				maxValue = numbers[i];
			}
		}

		return maxValue;
	}
	public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 2 };

        System.out.println("Mean: " + calculateMean(arr));
        System.out.println("Median: " + calculateMedian(arr));
        System.out.println("Mode: " + calculateMode(arr));
    }
	

}
