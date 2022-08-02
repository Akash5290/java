import java.util.Scanner;
class Staff
{
private String sid,nm,ph;
private float sal;
public static Scanner sc = new Scanner(System.in);
public void accept()
{
//sc.nextLine();
System.out.println("Enter Staff id");
sid = sc.next();
System.out.println("Enter name");
nm = sc.next();
System.out.println("Enter phone number");
ph = sc.next();
System.out.println("Enter Salary");
sal = sc.nextFloat();
}
public String toString()
{
String t=new String();
t="sid:"+sid+"nm:"+nm+"ph:"+ph+"salary:"+sal+"\n";
return t;
}
}

class Teaching extends Staff
{
private String dm;
private int pbs;
public void accept()
{
System.out.println("Enter Teaching staff details");
super.accept();
System.out.println("Enter Domain");
dm = sc.next(); //Even static members are inherited from base class
System.out.println("Enter Publications");
pbs = sc.nextInt();
}
public String toString()
{
String t=super.toString();
t+="Domain:"+dm+"\n";
t="publications"+pbs+"\n";
return t;
}
}
class Technical extends Staff
{
private String skills;
public void accept()
{
System.out.println("Enter Technical staff details");
super.accept();
System.out.println("Enter Skills");
skills = sc.next();
}
public String toString()
{
String t=super.toString();
t+="skills:"+skills+"\n";
return t;
}
}
class Contract extends Staff
{
private int period;
public void accept()
{
System.out.println("Enter Contract staff details");
super.accept();
System.out.println("Enter period");
period = sc.nextInt();
}
public String toString()
{
String t=super.toString();
t+="period:"+period+"\n";
return t;
}
}
public class a {
public static void main(String args[]) {
int n,i;
System.out.println("Enter n value");
n = Staff.sc.nextInt();
Teaching t[ ] = new Teaching[n];
for(i=0;i<t.length;i++)
t[i] = new Teaching();
Technical ti [ ] = new Technical[n];
for(i=0;i<ti.length;i++)
ti[i] = new Technical();
Contract c[ ] = new Contract[n];
for(i=0;i<c.length;i++)
c[i] = new Contract();
access(t,0); access(ti,0); access(c,0);
System.out.println("TEACHING staff");
access(t,1);
System.out.println("TECHNICAL staff");
access(ti,1);
System.out.println("CONTRACT staff");
access(c,1);

}
public static void access(Staff t[], int val)
{
for(Staff s : t)
if (val==0)
s.accept();
else
System.out.println(s);
}
}
