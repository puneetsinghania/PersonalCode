public class Walmart2  
{ 
    static class petrolPump 
    { 
        int petrol; 
        int distance; 
           
        public petrolPump(int petrol, int distance)  
        { 
            this.petrol = petrol; 
            this.distance = distance; 
        } 
    } 
      

    static int toursPrinter(petrolPump arr[], int n) 
    {   
        int start = 0; 
        int end = 1; 
        int cp = arr[start].petrol - arr[start].distance; 

        while(end != start || cp < 0) 
        { 
   
            while(cp < 0 && start != end) 
            { 
                cp -= arr[start].petrol - arr[start].distance; 
                start = (start + 1) % n; 

                if(start == 0) 
                    return -1; 
            } 
            cp += arr[end].petrol - arr[end].distance; 
              
            end = (end + 1)%n; 
        } 
          
        return start; 
    } 
      
    // Driver program
    public static void main(String[] args)  
    { 
          
        petrolPump[] arr = {new petrolPump(6, 4), 
                            new petrolPump(3, 6), 
                            new petrolPump(7, 3)}; 
          
        int start = toursPrinter(arr, arr.length); 
          
        System.out.println(start == -1 ? "WrongSol" : "Start = " + start);  
  
    } 
  
} 
