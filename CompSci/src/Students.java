
public class Students {
	public static void main(String[] args) {
		StudentRecord s1 = new StudentRecord(new int[] {80,88,66,91});
		StudentRecord s2 = new StudentRecord(new int[] {50,60,70,80,90});
		StudentRecord s3 = new StudentRecord(new int[] {90,91,92,93});
		System.out.println(s1.finalAverage());
		System.out.println(s2.finalAverage());
		System.out.println(s3.finalAverage());
		System.out.println(StudentRecord.getNumStudents());
		System.out.println(StudentRecord.getTotalAmountOfScores());
		StudentRecord.reset();
		System.out.println(StudentRecord.getNumStudents());
		System.out.println(StudentRecord.getTotalAmountOfScores());
	}
}
