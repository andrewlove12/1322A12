//Class: CSE1322
//Section: 02
//Term: Spring 2021
//Instructor: Mokter Hossain
//Name: Andrew Love
//Assignment#: 12
import java.util.Random;
	public class Guesser extends Thread {
		public int threadID;
		public static int nextThreadID = 0;
		public Guesser() {
			threadID=nextThreadID;
			nextThreadID=nextThreadID+1;
		}
		
		@Override
	public void run() {
			Random random = new Random();
			int guess,count=0;
			while(true) {
				guess = random.nextInt(1000000);
				if(guess==123456) {
					System.out.println("I'm thread "+ threadID + " I just found it on guess "+count);
					break;
				}
				count++;
			}
		}
}