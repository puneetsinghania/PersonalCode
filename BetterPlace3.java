 class BetterPlace3 
{ 
    public static void main(String args[]) 
    {  
        int n = 15; 
  
        for (int i=1; i<=n; i++)                                  
        { 
            if (i%15==0)                                                  
                System.out.print("FizzBuzz"+" ");  
         
            else if (i%5==0)      
                System.out.print("Buzz"+" ");  
  
        
            else if (i%3==0)      
                System.out.print("fizz"+" ");  
  
            else 
                System.out.print(i+" ");                          
        } 
    } 
} 