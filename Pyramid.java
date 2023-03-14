import java.util.Scanner;
public class Pyramid
{
public static void main(String args[])
{

Scanner so= new Scanner(System.in);
System.out.println("input n");
int n=so.nextInt();
int i=1,j=1;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println("");
}
}
}