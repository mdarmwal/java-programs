import java.util.Scanner;
public class circle
{
  public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the radius of circle:");
   double r= sc.nextDouble();
   double ar;
   ar=(22*r*r)/7;
   System.out.print("The area of the circle is"+ ar );
 }
}