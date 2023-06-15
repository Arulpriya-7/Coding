import java.util.*;
class Main{
    public static void main(String args[])
    {
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int row=a.length;
        int col=a[0].length;
        if(row!=col)
        {
            System.out.println("The given mtrix should be a square matrix");
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i<j)
                {
                    System.out.print("0 ");
                }
                else{
                    System.out.print(a[i][j] +" ");
                }
            
            }
            System.out.println(" ");
        }
    }
}
