package is.ru.stringCalculator;

public class stringCalculator {

	public static int add(String numbers) {

		if(numbers.contains("//")) {

			String[] split = numbers.split("\n");
			String del = split[0];
			String delimiter = del.replaceAll("/", "");
		}		

		if(numbers.contains("-")) {

			String[] allNums = numbers.split("[\n,delimiter]");
			int[] negNums = new int[allNums.length];

			System.out.println("Negatives are not allowed: ");
			for(int i = 0; i < allNums.length; i++) {

				negNums[i] = Integer.parseInt(allNums[i]);

				if(negNums[i] < 0) {

					System.out.println(negNums[i] + ",");
				}
			}
		}
		if(numbers.equals("")) {

			return 0;
		}
		else if(numbers.contains(",") || numbers.contains("\n")) {

			String[] nums = numbers.split("[\n,delimiter]");
			int total = 0;

			for(int i = 0; i < nums.length; i++) {

				if(Integer.parseInt(nums[i]) <= 1000) {

					total += Integer.parseInt(nums[i]);
				}
			}

			return total;
		}
		else {

			return Integer.parseInt(numbers);
		}
	}
}