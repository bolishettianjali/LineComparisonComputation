
public class LineComparisonComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation");
		int x1 = 1, y1 = 14, x2 = 3, y2 = 9;
		int a1 = 4, b1 = 10, a2 = 5, b2 = 16;
		 double LengthOfaLine1=Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
		 double LengthOfaLine2=Math.sqrt((Math.pow((a2-a1),2))+(Math.pow((b2-b1),2)));
		 System.out.println("LengthOfaLine1 :" +LengthOfaLine1);
		 System.out.println("LengthOfaLine2 :" +LengthOfaLine2);
			if (LengthOfaLine1 == LengthOfaLine2) {
			System.out.println("Length of two line are equal");
		} else {
			System.out.println("Two lengths are not equal");
		}
	}

}
