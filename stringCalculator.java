package is.ru.stringCalculator;

public class stringCalculator {

	public static int add(String numbers) {

		if(numbers.equals("")) {

			return 0;
		}
		else if(numbers.contains(",") || numbers.contains("\n")) {

			String[] nums = numbers.split("[\n,]");
			int total = 0;

			for(int i = 0; i < nums.length; i++) {

				total += Integer.parseInt(nums[i]);
			}

			return total;
		}
		else {

			return Integer.parseInt(numbers);
		}


		/*else {

			if(numbers.contains(",")) {

				String[] nums = numbers.split(",");
				return Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
			}
			return 1;*/
	}
}