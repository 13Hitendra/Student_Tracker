package Test8;

import java.util.PriorityQueue;

public class Admission{
	public static void main(String [] asdf)
	{
		PriorityQueue<Candidate>admsnQueue=new PriorityQueue<>();
		admsnQueue.add(new Candidate(1,"Sagar",60,80,76));
		admsnQueue.add(new Candidate(2,"Nishant",68,97,46));
		admsnQueue.add(new Candidate(3,"Sanket",83,67,88));

		System.out.println("Admited cadidates");
		while(!admsnQueue.isEmpty())
		{
			Candidate candidate=admsnQueue.poll();
			System.out.println(candidate);
		}
		
	}
}
   