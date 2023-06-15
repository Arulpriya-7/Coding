import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int a1[][]={
            {4,0,0},
            {0,5,0},
            {0,0,6}
        };
        int row,col,size,c=0;
        row=a1.length;
        col=a1[0].length;
        size=row*col;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(a1[i][j]==0)
                {
                    c++;
                }
            }
        }
        if(c>size/2)
        {
            System.out.println("The given matrix is sparse matrix");
        }
        else{
            System.out.println("The given matrix is not a sparse matrix");
        }
    }
}
