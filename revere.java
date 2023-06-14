class Main
{
    void reverseArray(int a[],int n)
    {
        int b[]=new int[n];
        int j;
        j=n;
        for(int i=0;i<n;i++)
        {
            b[i]=a[j-1];
            j=j-1;
        }
        for(int k=0;k<n;k++)
        {
            System.out.println(b[k]+" ");
        }
    }
    public static void main(String args[])
    {
        int a[]={10,20,30,40,50};
        Main reverse =new Main();
        reverse.reverseArray(a, a.length);
    }
}
