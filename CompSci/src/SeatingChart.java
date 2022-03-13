import java.util.*;

public class SeatingChart {
	private Student[][]seats;
	public SeatingChart(List<Student> studentList, int rows, int cols) {
		int k = 0;
		seats= new Student[rows][cols];
		while(k<studentList.size()) {
			(int c = 0; c<seats[0].length; ++c) {
				for(int r = 0; r<seats.length; ++r) {
					seats[r][c]=studentList.get(k);
					++k;
				}
			}
		}
	}
	public int removeAbsentStudents(int allowedAbsences) {
		for(int r = 0; r<seats.length; r++) {
			for(int c = 0; c<seats[r].length;++c) {
				if(seats[r][c].getAbsenceCount()>allowedAbsences) {
					seats[r][c]=null;
				}
			}
		}
	}
}
