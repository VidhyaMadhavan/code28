import java.util.*;
class primeno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int count,n1,n2;
System.out.print("First interval:");
n1=sc.nextInt();
System.out.print("Second interval:");
n2=sc.nextInt();
for(int i=n1;i<n2;i++)
{
count=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
count++;
break;
}
}
if(count==0)
{
System.out.println(i);
}
}
}
}
