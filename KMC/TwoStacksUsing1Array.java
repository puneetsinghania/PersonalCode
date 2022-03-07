package KMC;

public class TwoStacksUsing1Array {

    int size;
    int[] ar;
    int top1;
    int top2;

    TwoStacksUsing1Array(int n)
    {
        ar= new int[n];
        size=n;
        top1=-1;
        top2=size;
    }

    void push1(int val)
    {
        if(top1+1==top2|| top1==size-1 || top2==0)
            System.out.println("Overflow");
        else
        {
            top1++;
            ar[top1]=val;
        }

    }

    void push2(int val)
    {
        if(top1+1==top2|| top1==size-1 || top2==0)
            System.out.println("Overflow");
        else
        {
            if(top2==size)
                top2=size-1;
            else
                top2--;

            ar[top2]=val;
        }

    }

    int pop1()
    {
        int val=0;

        if(top1==-1)
            System.out.println("Underflow");
        else
        {
            val=ar[top1];
            top1--;
        }
        return val;
    }

    int pop2()
    {
        int val=0;

        if(top2==size)
            System.out.println("Underflow");
        else
        {
            val=ar[top2];
            top2++;
        }
        return val;
    }

    public static void main(String args[])
    {
        TwoStacksUsing1Array ts = new TwoStacksUsing1Array(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack2 is " + ts.pop2());
    }



}
