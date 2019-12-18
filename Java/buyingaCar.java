package kat6;

public class buyingaCar {
	/*
	 * 2312 12312 1000 1.5
	 */

	public static void main(String[] args) {
		int[] oldMan1 = nbMonths2(2260, 12260, 1000, 1.0);
		System.out.println("Months to buy new car: " + oldMan1[0]);
		System.out.println("Savings left: $" + oldMan1[1]);
		int[] oldMan2 = nbMonths2(2000, 8000, 1000, 1.5);
		System.out.println("Months to buy new car: " + oldMan2[0]);
		System.out.println("Savings left: $" + oldMan2[1]);
	}

	/*
	 * Money increments by 1000 every month. Price of old car and new car
	 * decrease every month Decrease = 1.5% a month, and 0.5% incremented every
	 * 2 months.
	 */
	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
		int[] data = { 0, 0 };
		if (startPriceOld >= startPriceNew) {
			data[1] = startPriceOld - startPriceNew;
			return data;
		} else {
			// int i = 0; //i is savings
			int j = 1; // j is month
			// int savingsIncrement = savingperMonth;
			float startPriceOldDouble = startPriceOld;
			float startPriceNewDouble = startPriceNew;
			for (float i = savingperMonth; i <= startPriceNew - startPriceOld; i += savingperMonth) {

				data[0]++;
				// Every even month increments by one because 60 days will have
				// passed
				if (j % 2 == 0) {
					// System.out.println(percentLossByMonth);
					percentLossByMonth = percentLossByMonth + 0.5;
				}
				j++;
				// Savings left is correct
				// startPriceOldDouble = (int)(startPriceOldDouble * ((100 -
				// percentLossByMonth) / 100));
				// startPriceNewDouble = (int)(startPriceNewDouble * ((100 -
				// percentLossByMonth) / 100));
				// startPriceOldDouble = Math.round((startPriceOldDouble * ((100
				// - percentLossByMonth) / 100)));
				// startPriceNewDouble = Math.round((startPriceNewDouble * ((100
				// - percentLossByMonth) / 100)));
				// startPriceOldDouble = (float) Math.floor((startPriceOldDouble
				// * ((100 - percentLossByMonth) / 100)));
				// startPriceNewDouble = (float) Math.ceil((startPriceNewDouble
				// * ((100 - percentLossByMonth) / 100)));
				startPriceOldDouble = (float) (startPriceOldDouble * ((100 - percentLossByMonth) / 100));
				startPriceNewDouble = (float) (startPriceNewDouble * ((100 - percentLossByMonth) / 100));
				System.out.println(startPriceOldDouble + " " + startPriceNewDouble);
				if ((startPriceOldDouble + i) >= (startPriceNewDouble)) {
					System.out.println(startPriceOldDouble + i - startPriceNewDouble);
					data[1] = (int) Math.floor(startPriceOldDouble + i - startPriceNewDouble);
					System.out.println(data[1]);
				}
			}
			return data;
		}
	}

	public static int[] nbMonths2(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {

		int[] result = { 0, 0 };
		int savings = 0;
		double oldOne = startPriceOld;
		double newOne = startPriceNew;

		while ((oldOne + savings < newOne && oldOne < newOne)) {
			oldOne = oldOne * (1 - percentLossByMonth / 100);
			newOne = newOne * (1 - percentLossByMonth / 100);
			savings += savingperMonth;

			if (result[0] % 2 == 0) {
				percentLossByMonth += 0.5;

			}

			result[0]++;
		}

		result[1] = (int) Math.round(oldOne + savings - newOne);

		return result;
	}

}
