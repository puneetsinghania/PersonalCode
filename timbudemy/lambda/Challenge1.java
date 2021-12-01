package timbudemy.lambda;

public class Challenge1 {

    public static void main(String[] args) {
        Runnable runnable1= () -> {
            String myString="Puneet Singhania";
            String[] parts=myString.split(" ");
            for(String part:parts){
                System.out.println(part);
            }
        };
    }
}
