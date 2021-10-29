package timbudemy;

public class MethodOverloadingChallenge {
	
	public static void main(String[] args)
	{
		double cm=calcFeetAndInchesToCentimeters(0,1);
		System.out.println(cm);
		
		double cm2=calcFeetAndInchesToCentimeters(157);
		System.out.println(cm2);
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches)
	{
		if(!(feet>=0) || !(inches>=0 && inches<=12))
			return -1;
		
		double cm=(feet*12*2.54)+(inches*2.54);
		//double cm=(feet*12*2.54)+(calcFeetAndInchesToCentimeters(inches)*12*2.54);
		return cm;
	}

	public static double calcFeetAndInchesToCentimeters(double inches)
	{
		if(!(inches>=0))
		return -1;
		
		double feet=(int)(inches/12);
		double remaining_inch=(int)(inches%12);
		double cm2=calcFeetAndInchesToCentimeters(feet,remaining_inch);
		return cm2;
		
	}
}
