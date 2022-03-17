package revature.practiceTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import revature.practiceQuestions.Question1;
import revature.practiceQuestions.Question2;

public class questionTests {
	Question1 q1 = new Question1();
	@Test
	public void testOne() {
		int[] inputArray = new int[]{5, 10, 12, 2, 7};
		int expectedString = q1.countGreater(6, inputArray);
		Assertions.assertEquals(3, expectedString);
	}
	@Test
	public void testTwo() {
		int[] inputArray = new int[]{17, -8, 0, 2, 1};
		int expectedString = q1.countGreater(2, inputArray);
		Assertions.assertEquals(1, expectedString);
	}

	Question2 q2 = new Question2();
	@Test
	public void testThree() {
		String[] inputArray1 = new String[]{"Chicken Fingers", "Pancakes", "Celery", "Cotton Candy", "Water"};
		String[] inputArray2 = new String[]{"Water",  "Pistachios", "Celery", "Yogurt", "Pancakes"};
		int expectedString = q2.countSame(inputArray1, inputArray2);
		Assertions.assertEquals(3, expectedString);
	}
	@Test
	public void testFour() {
		String[] inputArray1 = new String[]{"Chili Dogs", "Soda", "Popcorn", "Chocolate Bars", "Tuna Fish"};
		String[] inputArray2 = new String[]{"Egg Salad",  "Tuna Fish", "French Fries", "Soda", "A Big Steak"};
		int expectedString = q2.countSame(inputArray1, inputArray2);
		Assertions.assertEquals(2, expectedString);
	}	
}
