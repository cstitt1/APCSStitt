package p9_02;

public class QuizDataSetTester {
	public static void main(String[] args) {
		DataSet test = new DataSet();
		test.add(new Quiz(89, "B+"));
		test.add(new Quiz(75, "C"));
		test.add(new Quiz(90, "A-"));
		System.out.println("Average: "+test.getAverage());
		
		Quiz max = (Quiz) test.getMaximum();
		System.out.println("Maximum Score: "+max.getMeasure());
		System.out.println("Maximum Letter Grade: "+max.getLetter());
	}
}