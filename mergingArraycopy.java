import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int firstArray[]={1,2,3,4,5};
        int secondArray[]={6,7,8,9,10};
        int fl=firstArray.length;
        int sl=secondArray.length;
        int res[]=new int[fl+sl];
        System.arraycopy(firstArray,0,res,0,fl);
        System.arraycopy(secondArray,0,res,fl,sl);
        System.out.println(Arrays.toString(res));
    }
}
