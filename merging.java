import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int a1[]={1,2,3,4,5};
        int a2[]={6,7,8,9,10};
        int l1=a1.length;
        int l2=a2.length;
        int l=l1+l2;
        int a3[]=new int[l];
        int pos=0;
        for(int element:a1)
        {
            a3[pos]=element;
            pos++;
        }
        for(int element:a2)
        {
            a3[pos]=element;
            pos++;
        }
        System.out.println(Arrays.toString(a3));
    }
}
