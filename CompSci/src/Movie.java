
public class Movie {
	private String title;
	private String studio;
	private String rating;
	private static int numMovies;
	
	public Movie(String t, String s, String r)
	{
		title = t;
		studio = s;
		rating = r;
		numMovies++;
	}
	public Movie(String t, String s) {
		title = t;
		studio = s;
		rating = "PG";
		numMovies++;
	}
	public static int getNumMovies()
	{
		return numMovies;
	}
	
	public static void main(String[] args) {
		Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG-13");
		System.out.println(getNumMovies());
	}
}
