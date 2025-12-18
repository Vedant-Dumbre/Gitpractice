import java.util.*;
public class armstronglist
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int n,i,cnt=0,temp,sum=0,rem,p=1;
		System.out.println("Enter the number");
		int no=xyz.nextInt();
		for(n=1;n<=no;n++)
		{
			temp=n;
			i=0;
			while(n!=0)
			{
				n=n/10;
				cnt++;
			}
			System.out.println("Count is:"+cnt);
			n=temp;
			i=1;
			while(n!=0)
			{
				rem=n%10;
				System.out.println("Reminder is : "+rem);
				while(i<=cnt)
				{
					p=p*rem;
					i++;
				}
		
				sum=sum+p;
				n=n/10;
		 		i=1;
				p=1;
			}
			if(temp==sum)
			{
				System.out.println("Number is amstrong");
			}
			else
			{
				System.out.println("Number is not armstrong");
			}
		}
	}
}


	
	

		