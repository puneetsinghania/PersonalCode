package CrackingTheCoding6th;

public class MajorityElement2 {

	public static void main(String[] args) {
		 int ar[] = {2,2,2,2,5,5,2,3,3}; 
		 
		 int ele=0;
		 int count=1;
		 for(int i=1;i<ar.length;i++)
		 {
			 if(ar[i]==ar[ele])
				 count++;
			 else
				 count--;
			 
			 if(count==0)
			 {
				 ele=i;
				 count=1;
			 }
		 }
		 int count2=0;
		 for(int j=0;j<ar.length;j++)
		 {
			 if(ar[j]==ar[ele])
				 count2++;
		 }
		 if(count2>(ar.length/2))
			 System.out.println("Majority element is "+ar[ele]);
		 else
			 System.out.println("None");
		 
	}
}
