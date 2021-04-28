//Class: CSE1322
//Section: 02
//Term: Spring 2021
//Instructor: Mokter Hossain
//Name: Andrew Love
//Assignment#: 12
public class Test {
	public static void main(String[] args) {
		int totalThreads=100;
		for(int i=0;i<totalThreads;i++) {
			Guesser guess = new Guesser();
			guess.start();
		}
	}
}