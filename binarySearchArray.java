import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
        int intArr[]={2,34,5,7,1,5};
        int intKey=7;
        Arrays.sort(intArr);
        System.out.println(intKey + " Found at the index "+ Arrays.binarySearch(intArr,intKey));
    }
}
