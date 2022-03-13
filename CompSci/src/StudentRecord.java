
public class StudentRecord {
	private int[] scores;
	private static int totalStudents;
	private static int totalAmountOfScores;
	
	public StudentRecord(int[] a) {
		scores = a; 
		totalStudents++;
	}
	private double average(int first, int last) {
		int x= 0;
		for(int k = first; k<last; k++) {
			x += scores[k];
		}
		return (double)x/scores.length;
	}
	private boolean hasImproved() {
		int x = 0;
		for(int k =1; k<scores.length;k++) {
			if(scores[k]<scores[x]) {
				return false;
				
			}
			x++;
		}
		return true;
	}
	public double finalAverage(){
		if(hasImproved()) {
			totalAmountOfScores+=scores.length-scores.length/2;
			return average(scores.length/2,scores.length);
		}
		else {
			totalAmountOfScores+=scores.length;
			return average(0,scores.length);
		}
	}
	public static int getNumStudents() {
		return totalStudents;
	}
	public static int getTotalAmountOfScores() {
		return totalAmountOfScores;
	}
	public static void reset() {
		totalStudents=0;
		totalAmountOfScores=0;
	}
}
