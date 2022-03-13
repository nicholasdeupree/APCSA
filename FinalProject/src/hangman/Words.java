package hangman;

import java.util.Random;

public class Words {
	public static final String[] wordsSchool = {"pencil", "book", "teacher", "computers", "library", "commons", "homework", "test", "quiz", "quest", "essay","computer science", "math","science","history", "advanced placement"};
	public static final String[] wordsComputers = {"computer","mouse","keyboard","monitor","graphics Card","processor", "apple","windows","intel","advanced Micro Devices","frames per second","steam","video games", "coding"};
	public static final String[] wordsSports = {"soccer","football","baseball","cricket","golf","swimming","basketball","tennis","hockey","frisbee","water polo","wrestling","boxing","cross country","track and field"};
	public static String getWord(int e)
	{
		int rnd =0;
		switch(e) {
		case 1:
			rnd = new Random().nextInt(wordsSchool.length);
			return wordsSchool[rnd];
		case 2:
			rnd = new Random().nextInt(wordsComputers.length);
			return wordsComputers[rnd];
		case 3:
			rnd = new Random().nextInt(wordsSports.length);
			return wordsSports[rnd];
		default:
			rnd = new Random().nextInt(wordsSchool.length);
			return wordsSchool[rnd];
		}
	}

}
