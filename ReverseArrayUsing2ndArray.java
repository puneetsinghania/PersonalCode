
public class ReverseArrayUsing2ndArray {

	public static void main(String[] args) {
		int[] ar={23,45,56,89,28};
		int[] revArr=new int[ar.length];
		
		int j=0;
		for(int i=ar.length-1;i>=0;i--)
		{
			revArr[j]=ar[i];
			j++;
		}
		for(int k=0;k<revArr.length;k++)
		{
			System.out.print(revArr[k]+" ");
		}
	}
}
