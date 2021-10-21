
public class LineComparisonComputation {

	static int x1 = 1, y1 = 14, x2 = 3, y2 = 9;
	static int a1 = 4, b1 = 10, a2 = 5, b2 = 16;

	public static void comparingTwoLines() {
		System.out.println("Welcome to Line Comparison");
		Double LengthOfaLine1 = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		Double LengthOfaLine2 = Math.sqrt((Math.pow((a2 - a1), 2)) + (Math.pow((b2 - b1), 2)));
		System.out.println("LengthOfaLine1 :" + LengthOfaLine1);
		System.out.println("LengthOfaLine2 :" + LengthOfaLine2);
		int compare = LengthOfaLine1.compareTo(LengthOfaLine2);

		switch (compare) {
		case 1:
			System.out.println("Line  1 is greater");
			break;
		case 0:
			System.out.println("Two line are equal");
		case -1:
			System.out.println("Line  2 is greater");
			break;

		}
	}

	public static void main(String[] args) {
		comparingTwoLines();
	}

}