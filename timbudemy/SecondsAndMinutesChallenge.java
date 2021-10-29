package timbudemy;

public class SecondsAndMinutesChallenge {
	
	public static void main(String[] args)
	{
		System.out.println(getDurationString(65,45));
		System.out.println(getDurationString(3945));
	}
	
	public static String getDurationString(int minutes,int seconds)
	{
		if(!(minutes>=0)||!(seconds>=0 && seconds<=59))
			return "Invalid value";
		
		int hours=(minutes/60)+(seconds/3600);
		int remMin=(minutes%60);
		int remSeconds=(seconds%3600);
		String res=hours+"h "+remMin+"m "+remSeconds+"s";
		return res;
	}
	public static String getDurationString(int seconds)
	{
		if(!(seconds>=0))
			return "Invalid value";
		
		int min=seconds/60;
		int newSec=seconds%60;
		String res=getDurationString(min,newSec);
		return res;
	}

}
