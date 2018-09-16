public class CounterVowelsConsonantsDigitsSpecialChars {

	public static void main(String[] args) {
		String str="Chitradurga is a fort city 123";
		str=str.toLowerCase();
		
		char[] ar=str.toCharArray();
		int vowels=0,consonants=0,digits=0,special=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>='a' && ar[i]<='z')
			{
				if(ar[i]=='a'||ar[i]=='e'||ar[i]=='i'||ar[i]=='o'||ar[i]=='u')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
			else if(ar[i]>='0' && ar[i]<='9')
			{
				digits++;
			}
			else
			{
				special++;
			}
			
		}
		System.out.println("Vowels="+vowels);
		System.out.println("Consonants="+consonants);
		System.out.println("Digits="+digits);
		System.out.println("Special chars="+special);
	}
}
