class Main{
    
     void  leftRotate(int a[],int d,int n)
    {  
        for(int i=0;i<d;i++)
           leftRotateByOne(a, n);
    }
     void leftRotateByOne(int a[], int n)
    {
        int i, temp=a[0];
        for(i=0;i<n-1;i++)
            a[i]=a[i+1];
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
	    rotate.leftRotate(a,2,a.length);
	    rotate.printArray(a,a.length);
	}
}
