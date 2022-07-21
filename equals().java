
import java.util.*;
class nig
{
	int i,r;
	public void accept()
	{
		Scanner sc= new Scanner(System.in);
		i=sc.nextInt();
		r=sc.nextInt();
	}

	public boolean equals(Object obj)
	{   nig t=(nig)obj;
		if(r==t.r && i==t.i)
			return true;
		return false;
	}
	public void wait(nig a,nig b)
	{  
		if((a.equals(b))==true)
		{
			nig t=new nig();
			t.i=2*(a.i);
			t.r=2*(a.r);
			System.out.println(t.r+"+i"+t.i);
			
		}
		if((a.equals(b))==false)
		{	
			nig p=new nig();
			p.i=a.i+b.i;
			p.r=a.r+b.r;
			System.out.println(p.r+"+i"+p.i);
			
		}
	}
			
	public static void main(String[]args)
	{	
		nig a=new nig();
		a.accept();
		nig b=new nig();
		b.accept();
		System.out.println(a.equals(b));
		nig sum=new nig();
		sum.wait(a,b);
	}
}
			
		
	
		
	
