package KMC;

public class TwoElementsWhoseSumIsClosestToZero1 {

	public static void main(String[] args) {
		 int ar[] = {1, 60, -10, 70, -80, 85};
		 
		 
		 int mindiff=Integer.MAX_VALUE;
		 int minIndexI=0;
		 int minIndexJ=0;
		 int given=0;
		 
		 for(int i=0;i<ar.length-1;i++)
		 {
			 for(int j=i+1;j<ar.length;j++)
			 {
				 int sum=ar[i]+ar[j];
				 int diff=Math.abs(sum-given);
				 if(diff<mindiff)
				 {
					 mindiff=diff;
					 minIndexI=i;
					 minIndexJ=j;
				 }
			 }
		 }
		 System.out.println(mindiff+"--> "+ar[minIndexI]+","+ar[minIndexJ]);
	}
}
