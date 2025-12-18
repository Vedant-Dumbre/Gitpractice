public class Armstrong
{
	public static void main(String x[])
	{
		int n,i,cnt=0,temp,sum=0,rem,p=1;
		n=Integer.parseInt(x[0]);
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
