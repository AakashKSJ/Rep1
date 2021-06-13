package one;
import java.util.*;
public class rev {
	public int revint(int n)
	{	int rem=0;
		int reve=0;
		while(n>0)
		{rem=n%10;
		reve=rem+reve*10;
		n/=10;
		}
	return reve;	}
	
	
	
	
	public static void main(String[] args)
	{ rev a= new rev();
	int r1;
	int r2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two Integers:");
	int[] arr= new int[2];
	for(int i=0;i<2;i++)
	arr[i]=sc.nextInt();
	int i1=arr[0];
	int i2=arr[1];
	r1=a.revint(i1);
	r2=a.revint(i2);
	if((i1*i2)==(r1*r2))
	System.out.println("Yes");
	else
	System.out.println("No");
	}
	
}
