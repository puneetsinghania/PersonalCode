package KMC;

public class JosephusCircle {

    public static void main(String[] args) {

        int res=jos(5,3);
        System.out.println(res);
    }

    public static int jos(int n,int k) {

        int res=0;

        for(int i=1;i<=n;i++)
        {
            res=(res+k)%i;
        }
        return res;
        //if array is 1-indexed
        //return res+1;
    }
}
