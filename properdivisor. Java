import java.util.*;
public class Main
{
    public static int properdivisor(int n){
        int sum=0,i=1;
        while(i<n){
            if(n%i==0){
                sum+=i;
            }
            i++;
        }
        return sum;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n==properdivisor(properdivisor(n))?1:0);
	}
}
