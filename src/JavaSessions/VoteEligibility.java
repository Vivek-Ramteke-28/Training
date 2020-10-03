package JavaSessions;

public class VoteEligibility {

	public static void main(String[] args) {

		VoteEligibility ve = new VoteEligibility();
		ve.vote(25);
		ve.vote(18);
		
		ve.vote(17);
		ve.vote(0);

	}

	
	public void vote(int v)
	{
		if(v>=18)
		{
			System.out.println(" A person is elligible to vote");
		}
		else if(v<18 || v ==0)
		{
			System.out.println(" A person is not elligible to vote");

		}
		
	}
}
