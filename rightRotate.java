class Main{
    
     void  leftRotate(int a[],int d,int n)
    {  
        for(int i=0;i<d;i++)
           leftRotateByOne(a, n);
    }
     void leftRotateByOne(int a[], int n)
    {
        int i, temp=a[a.length-1];
        for(i=a.length-1;i>0;i--)
            a[i]=a[i-1];
        a[i]=temp;
    }
    void  printArray(int a[], int n)
    {
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
        
    
	public static void main(String[] args) {
	    Main rotate = new Main();
	    int a[]={1,2,3,4,5};
	    rotate.leftRotate(a,3,a.length);
	    rotate.printArray(a,a.length);
	}
}
