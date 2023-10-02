
class Main 
{
    public static void main(String args[])
    {
        int nums[]={23,445,1,2,8,19,-3,16,-11,28};
        int target=19;
        int ans=linearSerach(nums,target);
        System.out.println(ans);
    }
    static int linearSerach(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int index=0;index<arr.length;index++)
        {
            int element=arr[index];
            if(element==target)
            {
                return index;
            }
        }
        return -1;
    }
}
