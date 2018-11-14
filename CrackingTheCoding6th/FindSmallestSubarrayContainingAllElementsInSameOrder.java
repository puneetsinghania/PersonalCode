package CrackingTheCoding6th;

public class FindSmallestSubarrayContainingAllElementsInSameOrder {

	public static void main(String[] args) {
		int A[] = { 5, 6, 5, 2, 7, 5, 6, 7, 5, 5, 7 }; 
		int B[] = { 5, 5, 7 }; 
		int index=0;
		int minLength=Integer.MAX_VALUE;
		int indexStart=0;
		int indexEnd=0;
		
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==B[0])
			{
				index=i;
				int j=0;
				for(;index<A.length;index++)
				{
					if(B[j]==A[index])
						j++;
					
					if(j==B.length)
						break;
				}
				if(j==B.length)
				{
					int length=index+1-i;
					if(length<minLength)
					{
						minLength=length;
						indexStart=i;
						indexEnd=index;
					}
				}
			}
		}
		System.out.println("MinLength="+minLength+"-->("+indexStart+","+indexEnd+")");
	}
}
