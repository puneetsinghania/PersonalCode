package FAQ;

public class PrintAllSubarraysWith0Sum {

	public static void main(String[] args) {
		 int ar[] = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7}; 
		 
		 for(int i=0;i<ar.length;i++)
		 {
			 int sum=0;
			 int start=0;
			 int end=0;
			 for(int j=i;j<ar.length;j++)
			 {
				 sum=sum+ar[j];
				 
				 if(sum==0)
				 {
					 start=i;
					 end=j;
					 System.out.println(start+","+end);
				 }
			 }
		 }
	}
}
