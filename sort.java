import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int a[]= new int[] { 90,23,5,109,2,22,67,34};
		Arrays.sort(a);
		System.out.println("Elements in sorted way:");
		for(int i=0;i<a.length;i++)
		{
		    System.out.println(a[i]);
		}
	}
}
