package timbudemy;

public class NumberToWordsChallenge {

		
		public static void main(String[] args)
		{
			//numberToWords(123456);
			//numberToWords(10000);
			numberToWords(-10000);
		}
		
	    public static void numberToWords(int number)
	    {
	        String st="";
	        int count=0;
	        
	        if(number<0)
	            System.out.println("Invalid Value");
	        
	        int revNum=reverse(number);
	        
	        while(revNum>0){
	        int rem=revNum%10;
	        revNum/=10;
	        
	        count++;
	        
	        if(rem==0)
	            st=st+" Zero";
	         else if(rem==1)
	            st=st+" One";
	         else if(rem==2)
	            st=st+" Two";
	         else if(rem==3)
	            st=st+" Three";
	         else if(rem==4)
	            st=st+" Four";
	         else if(rem==5)
	            st=st+" Five";
	         else if(rem==6)
	            st=st+" Six";
	         else if(rem==7)
	            st=st+" Seven";
	         else if(rem==8)
	            st=st+" Eight";
	         else if(rem==9)
	            st=st+" Nine";
	        }
	        if(count!=getDigitCount(number))
	        {
	            int diff=getDigitCount(number)-count;
	            for(int i=0;i<diff;i++)
	            {
	            	st=st+" Zero";
	            }
	        }
	        System.out.println(st.trim());
	    }
	    
	    public static int reverse(int number)
	    {
	        String num=String.valueOf(number);
	        char[] ar= num.toCharArray();
	        String st="";
	        boolean negative=false;
	        
	        for(int i=ar.length-1;i>=0;i--)
	        {
	        	if(ar[i]=='-')
	            {
	                //st=String.valueOf(ar[i])+st;
	                negative=true;
	            }
	        	else if((Integer.parseInt(String.valueOf(ar[i]))>=0) && (Integer.parseInt(String.valueOf(ar[i]))<=9))
	            {
	                st+=String.valueOf(ar[i]);
	            }
	        }
	        int reverNum=Integer.parseInt(st);
	        if(negative==true)
	        {
	        	reverNum*= -1;
	        }
	        return reverNum;
	    }
	    
	    public static int getDigitCount(int number)
	    {
	        if(number<0) return -1;
	        
	        if(number==0) return 1;
	        
	        int count=0;
	        while(number>0){
	        int rem=number%10;
	        number/=10;
	        count++;
	        }
	        
	        return count;
	    }

}
