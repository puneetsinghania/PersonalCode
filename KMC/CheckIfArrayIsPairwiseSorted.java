package KMC;

public class CheckIfArrayIsPairwiseSorted {

	public static void main(String[] args) {
        int []ar = {2, 5, 3, 7, 9, 10}; 

        boolean isSorted=true;
        for(int i=0;i<ar.length;i+=2)
        {
        	if(ar[i]>ar[i+1])
        	{
        		isSorted=false;
        	}
        }
        if(isSorted==true)
        	System.out.println("Array is Pairwise Sorted");
        else
        	System.out.println("Not");
	}
}
