public class HomoHetero {
int[] arr= {0,0,0,2,0,1};
int ch=0;

public boolean homo(){
	
for(int i=0;i<arr.length;i++)
{
if(arr[i]!=0){
	ch=arr[i];
	break;
}
}
for(int j=0;j<arr.length;j++)
{
if(arr[j]!=ch)	
{
	if(arr[j]!=0)
		return false;
}
}
return true;

}

}

class Driver{
	
	public static void main(String[] args)
	{
		HomoHetero homohetero=new HomoHetero();
	if(homohetero.homo()==true)
	{
		System.out.println("Homo");
	}
	else{
		System.out.println("Hetero");
	}
	}

}