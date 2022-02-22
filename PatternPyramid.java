public class PatternPyramid {

    public static void main(String[] args) {

        int n=15;
        int l=5;
        int sp=l-1;
        int st=1;

        for(int i=0;i<l;i++)
        {
            for(int k=0;k<sp;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<st;j++)
            {
                if(j%2==0)
                {
                    if(n<10)
                        System.out.print("0"+n);
                    else
                        System.out.print(n);

                    n--;
                }
                else
                {
                    System.out.print("_");
                }
            }

            System.out.println();
            st=st+2;
            sp--;
        }

    }
}
