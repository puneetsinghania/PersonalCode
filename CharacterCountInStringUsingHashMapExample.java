import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
 
public class  CharacterCountInStringUsingHashMapExample {
   
    public static void main(String[] args) {
       String inputString="Chitradurga is a fort city 123";
        System.out.println("inputString is : "+inputString);
        System.out.print("Output is : ");
        characterCount(inputString);
    }
   
    /**
     * Method calculates count of all characters in inputString.
     */
    public static void characterCount(String inputString){
       Map<Character, Integer> map=new LinkedHashMap<Character, Integer>(); //LinkedHashMap used so that we could maintain insertion order.
       char[] inputAr=inputString.toCharArray();
      
       for(int i=0;i<inputAr.length;i++){
           char ch=inputAr[i];
           if(map.containsKey(ch))
                  map.put(ch, map.get(ch) +1);
           else
                  map.put(ch, 1);
                  
       }  
       /*
      * Till this point of program, we have stored all unique characters in map as key & corresponding value representing count of character.
      */   
       int sum=0;
       Iterator<Character> charIterator=map.keySet().iterator();
       while(charIterator.hasNext()){
           char ch=charIterator.next();
          
           if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
           {
        	   sum=sum+map.get(ch);
        	  
        	   
           
           }
          
           }
       System.out.print("Vowels="+sum);
    }
   
}